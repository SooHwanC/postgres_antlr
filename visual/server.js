// 설치: npm install neo4j-driver express cors
const neo4j = require('neo4j-driver');
const express = require('express');
const cors = require('cors');

const app = express();
app.use(cors());
app.use(express.json());

// Neo4j 연결 설정
const driver = neo4j.driver(
    'bolt://localhost:7687',
    neo4j.auth.basic('neo4j', '1q2w3e4r!')
);

// 정적 파일 제공
app.use(express.static(__dirname));

// 그래프 데이터 조회 API
app.get('/api/graph', async (req, res) => {
    const session = driver.session();

    try {
        const result = await session.run(`
MATCH (n)-[r]->(m)
WHERE NOT n:SYSTEM AND NOT m:SYSTEM
RETURN n, r, m
        `);

        const nodes = new Map();
        const relationships = [];

        result.records.forEach(record => {
            const n = record.get('n');
            const m = record.get('m');
            const r = record.get('r');

            // 노드 추가
            if (!nodes.has(n.identity.toString())) {
                nodes.set(n.identity.toString(), {
                    id: n.identity.toString(),
                    labels: n.labels,
                    properties: n.properties
                });
            }
            if (!nodes.has(m.identity.toString())) {
                nodes.set(m.identity.toString(), {
                    id: m.identity.toString(),
                    labels: m.labels,
                    properties: m.properties
                });
            }

            // 관계 추가
            relationships.push({
                source: r.start.toString(),
                target: r.end.toString(),
                type: r.type,
                properties: r.properties
            });
        });

        res.json({
            nodes: Array.from(nodes.values()),
            relationships: relationships,
            timestamp: new Date().toISOString()
        });

    } catch (error) {
        console.error('Graph API 에러:', error);
        res.status(500).json({ error: error.message });
    } finally {
        await session.close();
    }
});

// 통계 조회 API
app.get('/api/stats', async (req, res) => {
    const session = driver.session();

    try {
        const nodeCount = await session.run('MATCH (n) RETURN count(n) as count');
        const relCount = await session.run('MATCH ()-[r]->() RETURN count(r) as count');
        const labels = await session.run(`
            MATCH (n)
            RETURN labels(n)[0] as label, count(*) as count
            ORDER BY count DESC
        `);

        res.json({
            nodes: nodeCount.records[0].get('count').toNumber(),
            relationships: relCount.records[0].get('count').toNumber(),
            labelCounts: labels.records.map(r => ({
                label: r.get('label'),
                count: r.get('count').toNumber()
            })),
            timestamp: new Date().toISOString()
        });

    } catch (error) {
        console.error('Stats API 에러:', error);
        res.status(500).json({ error: error.message });
    } finally {
        await session.close();
    }
});

// 연결 테스트 API
app.get('/api/health', async (req, res) => {
    try {
        await driver.verifyConnectivity();
        res.json({ status: 'connected', message: 'Neo4j 연결 정상' });
    } catch (error) {
        res.status(500).json({ status: 'disconnected', error: error.message });
    }
});

const PORT = 3000;
app.listen(PORT, () => {
    console.log('\n' + '='.repeat(50));
    console.log('🚀 Neo4j 실시간 모니터링 서버 실행 중');
    console.log('='.repeat(50));
    console.log(`\n📊 대시보드: http://localhost:${PORT}/dashboard.html`);
    console.log(`📈 통계 API: http://localhost:${PORT}/api/stats`);
    console.log(`🔗 그래프 API: http://localhost:${PORT}/api/graph`);
    console.log(`💚 상태 확인: http://localhost:${PORT}/api/health`);
    console.log('\n종료: Ctrl+C\n');
});

process.on('exit', () => {
    driver.close();
});

process.on('SIGINT', () => {
    console.log('\n\n✅ 서버 종료 중...');
    driver.close();
    process.exit(0);
});
