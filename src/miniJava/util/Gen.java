package miniJava.util;

import jflex.SilentExit;

import java.nio.file.Path;

/**
 * Classe criada para facilitar a gera��o do lexer e parser.
 */
public class Gen {

    /**
     * Gera o lexer de acordo com a especifica��o recebida, salvando no destino recebido.
     * O nome da classe � especificado no *.jflex.
     * O arquivo gerado dever� estar no pacote indicado pela especifica��o.
     *
     * @param spec especifica��o do lexer (*.flex)
     * @param dest pasta de destino
     */
    public static void genLexer(Path spec, Path dest) {
        try {
            // Setando destino
            jflex.Main.parseOptions(new String[]{"-d", dest.toAbsolutePath().toString()});

            // Gerando arquivo
            jflex.Main.generate(new String[]{spec.toAbsolutePath().toString()});

        } catch (SilentExit silentExit) {
            silentExit.printStackTrace();
        }
    }

    /**
     * Gera o parser de acordo com a especifica��o recebida, salvando no destino recebido.
     * O nome da classe � especificado no parametro da fun��o
     * O nome da interface de teminais � especificado no parametro da fun��o
     * O arquivo gerado dever� estar no pacote indicado pela especifica��o.
     *
     * @param spec especifica��o do parser (*.cup)
     * @param dest pasta de destino
     */
    public static void genParser(Path spec, Path dest, String parserClassName, String symbolClassName) {

        try {
            // Setando atributos
            java_cup.Main.main(new String[]{"-parser", parserClassName, "-interface", "-symbols", symbolClassName,
                    "-destdir", dest.toAbsolutePath().toString(), "-expect", "10", spec.toAbsolutePath().toString()});

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}