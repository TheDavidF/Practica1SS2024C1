/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1conant;

import java.io.StringReader;
import java.util.ArrayList;
import practica1conant.Cup.Parser;
import practica1conant.Flex.Lexer;
import practica1conant.Flex.SoloLex;
import practica1conant.Flex.Token;
import practica1conant.Flex.TokenConstant;
import practica1conant.Interfaz.Animable;

/**
 *
 * @author DAVID
 */
public class Compilador {

    private ArrayList<Token> tokens;
    private SoloLex lexico;
    private Lexer lexer;
    private Parser parser;
    private String analizable;
    private ArrayList<Error> errores;
    private ArrayList<Animable> figuras;

    public Compilador() {
        errores = new ArrayList<>();
        figuras = new ArrayList<>();
    }

    public ArrayList<Error> soloLex(String analizable) {
        Token token;

        try {
            tokens = new ArrayList<>();
            lexico = new SoloLex(new StringReader(analizable));
            lexer = new Lexer(new StringReader(analizable));
            parser = new Parser(lexer);
            parser.parse();

            ArrayList<Error> erroress = parser.recuperarErrores();
            if (errores.isEmpty()) {
                figuras = parser.devolverFiguras();
                for (Animable figura : figuras) {
                    System.out.println(figura);
                }
            }
            for (Error errores1 : erroress) {
                System.out.println(errores1);
                errores.add(errores1);
            }
            while (true) {
                token = lexico.yylex();
                if (token == null || token.getTokenType() == TokenConstant.EOF) {
                    break; // Salir del bucle al encontrar EOF
                }
                tokens.add(token);
                System.out.println(token); // Imprime el token
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Token token1 : tokens) {
            if (token1.tokenType == TokenConstant.ERROR) {
                Error err = new Error(token1.getLexeme(), token1.getLine(), token1.getColumn(), "Caracter invalido", "Lexico");
                errores.add(err);
            }
        }

        return errores;
    }

    public ArrayList<Token> getTokens() {
        return tokens;
    }

    public void setTokens(ArrayList<Token> tokens) {
        this.tokens = tokens;
    }

    public SoloLex getLexico() {
        return lexico;
    }

    public void setLexico(SoloLex lexico) {
        this.lexico = lexico;
    }

    public Lexer getLexer() {
        return lexer;
    }

    public void setLexer(Lexer lexer) {
        this.lexer = lexer;
    }

    public Parser getParser() {
        return parser;
    }

    public void setParser(Parser parser) {
        this.parser = parser;
    }

    public String getAnalizable() {
        return analizable;
    }

    public void setAnalizable(String analizable) {
        this.analizable = analizable;
    }

    public ArrayList<Error> getErrores() {
        return errores;
    }

    public void setErrores(ArrayList<Error> errores) {
        this.errores = errores;
    }

    public ArrayList<Animable> getFiguras() {
        return figuras;
    }

    public void setFiguras(ArrayList<Animable> figuras) {
        this.figuras = figuras;
    }
    
    

}
