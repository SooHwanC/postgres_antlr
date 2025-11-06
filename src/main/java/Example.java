import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import postgres.PostgreSQLLexer;
import postgres.PostgreSQLParser;
import postgres.CustomPostgreSQLListener;

import plsql.PlSqlLexer;
import plsql.PlSqlParser;
import plsql.CustomPlSqlListener;

public class Example {
    public static void main(String[] args) throws IOException {
        // ========== 설정 ==========
        String dbmsType = "postgres";  // "postgres" 또는 "plsql"
        String filePath = "plpgsql6.sql";
        // ==========================

        InputStream in = new FileInputStream(filePath);
        CharStream s = CharStreams.fromStream(in);

        String parserType = dbmsType.toLowerCase();

        if (parserType.equals("postgres")) {
            // PostgreSQL/PlPgSQL 파싱
            PostgreSQLLexer lexer = new PostgreSQLLexer(s);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PostgreSQLParser parser = new PostgreSQLParser(tokens);

            PostgreSQLParser.RootContext tree = parser.root();

            ParseTreeWalker walker = new ParseTreeWalker();
            CustomPostgreSQLListener listener = new CustomPostgreSQLListener(tokens);
            walker.walk(listener, tree);

            listener.printStructure();

            try (FileWriter file = new FileWriter("structure.json")) {
                file.write(listener.getRoot().toJson());
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else if (parserType.equals("plsql")) {
            // Oracle PL/SQL 파싱
            PlSqlLexer lexer = new PlSqlLexer(s);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PlSqlParser parser = new PlSqlParser(tokens);

            PlSqlParser.Sql_scriptContext tree = parser.sql_script();

            ParseTreeWalker walker = new ParseTreeWalker();
            CustomPlSqlListener listener = new CustomPlSqlListener(tokens);
            walker.walk(listener, tree);

            listener.printStructure();

            try (FileWriter file = new FileWriter("structure.json")) {
                file.write(listener.getRoot().toJson());
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            System.err.println("알 수 없는 파서 타입: " + parserType);
            System.err.println("'postgres' 또는 'plsql'을 사용하세요.");
            System.exit(1);
        }

        System.out.println("파싱 완료! structure.json 파일이 생성되었습니다.");
    }
}