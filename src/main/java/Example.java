import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Example {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("plpgsql1.sql");
        CharStream s = CharStreams.fromStream(in);

        PostgreSQLLexer lexer = new PostgreSQLLexer(s); 
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PostgreSQLParser parser = new PostgreSQLParser(tokens);
        
        ParserRuleContext tree = parser.root(); // PostgreSQL 파서의 시작 규칙

        ParseTreeWalker walker = new ParseTreeWalker();
        CustomPostgreSQLListener listener = new CustomPostgreSQLListener(tokens);
        walker.walk(listener, tree);

        listener.printStructure();

        System.out.println(listener.getRoot().toJson());
        try (FileWriter file = new FileWriter("structure.json")) {
            file.write(listener.getRoot().toJson());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}