# plsql-parser


## Generate Parser 4 Java

java -jar ../antlr-4.13.1-complete.jar ../*.g4 -Dlanguage=Java  
(이때 꼭 *.g4로 해야 - parser.g4와 lexer.g4는 한쌍)


참고:  https://www.cubrid.com/blog/3830336

추가

java -jar antlr-4.13.1-complete.jar -o src/main/java PlpgsqlLexer.g4

java -jar antlr-4.13.1-complete.jar -visitor -o src/main/java PlpgsqlParser.g4

{
    "type": "ROOT",
    "startLine": 0,
    "endLine": 0,
    "children": [
        {
            "type": "UPDATE",
            "startLine": 1,
            "endLine": 288,
            "children": [
                {
                    "type": "SELECT",
                    "startLine": 7,
                    "endLine": 279,
                    "children": [
                        {
                            "type": "SELECT",
                            "startLine": 20,
                            "endLine": 278,
                            "children": [
                                {
                                    "type": "SELECT",
                                    "startLine": 37,
                                    "endLine": 243,
                                    "children": [
                                        {
                                            "type": "SELECT",
                                            "startLine": 60,
                                            "endLine": 242,
                                            "children": [
                                                {
                                                    "type": "SELECT",
                                                    "startLine": 79,
                                                    "endLine": 241,
                                                    "children": [
                                                        {
                                                            "type": "SELECT",
                                                            "startLine": 97,
                                                            "endLine": 240,
                                                            "children": [
                                                                {
                                                                    "type": "SELECT",
                                                                    "startLine": 121,
                                                                    "endLine": 239,
                                                                    "children": [
                                                                        {
                                                                            "type": "SELECT",
                                                                            "startLine": 136,
                                                                            "endLine": 224,
                                                                            "children": [
                                                                                {
                                                                                    "type": "SELECT",
                                                                                    "startLine": 143,
                                                                                    "endLine": 162,
                                                                                    "children": []
                                                                                },
                                                                                {
                                                                                    "type": "SELECT",
                                                                                    "startLine": 164,
                                                                                    "endLine": 179,
                                                                                    "children": []
                                                                                },
                                                                                {
                                                                                    "type": "SELECT",
                                                                                    "startLine": 184,
                                                                                    "endLine": 200,
                                                                                    "children": []
                                                                                },
                                                                                {
                                                                                    "type": "SELECT",
                                                                                    "startLine": 205,
                                                                                    "endLine": 220,
                                                                                    "children": []
                                                                                }
                                                                            ]
                                                                        }
                                                                    ]
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            ]
                                        }
                                    ]
                                },
                                {
                                    "type": "SELECT",
                                    "startLine": 252,
                                    "endLine": 265,
                                    "children": []
                                }
                            ]
                        }
                    ]
                }
            ]
        }
    ]
}
