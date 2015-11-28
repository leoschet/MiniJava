import miniJava.astree.INode;
import miniJava.parser.Parser;
import miniJava.util.Gen;
import miniJava.visitor.PrettyPrintVisitor;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    // Caminho para as especificações do lexer a parser
    public static final Path LEXER_SPEC_PATH = Paths.get("src\\miniJava\\lexer\\miniJava.flex");
    public static final Path PARSER_SPEC_PATH = Paths.get("src\\miniJava\\parser\\miniJava.cup");

    /**
     * Caminho para os arquivos de teste
     */
    static final Path TEST_FILES_DIR = Paths.get("test");

    public static void main(String[] args) throws Exception {
        //gen();

        //Testando
        for (Path p: Files.newDirectoryStream(TEST_FILES_DIR)) {
            INode program = (INode) new Parser(p).parse().value;

            PrettyPrintVisitor visitor  = new PrettyPrintVisitor();
            StringBuilder str = program.accept(visitor);

            System.out.print(str);
        }
    }

    /**
     * Gera as classes do lexer e parser automaticamente
     */
    public static void gen() {
        Gen.genLexer(LEXER_SPEC_PATH, LEXER_SPEC_PATH.getParent());
        Gen.genParser(PARSER_SPEC_PATH, PARSER_SPEC_PATH.getParent(), "Parser", "Tokens");
    }
}