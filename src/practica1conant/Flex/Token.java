/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1conant.Flex;


import java.io.StringReader;
import java_cup.runtime.Symbol;
import java.io.IOException;
/**
 *
 * @author DAVID
 */
public class Token {
    
    public TokenConstant tokenType;
    public String lexeme;
    public int line;
    public int column;

    public Token(TokenConstant type, int line, int column, String lexeme) {
        this.tokenType = type;
        this.lexeme = lexeme;
        this.line = line;
        this.column = column;
    }

    @Override
    public String toString() {
        return "Token: " + tokenType + " (" + lexeme + "), Line: " + line + ", Column: " + column;
    }

    public TokenConstant getTokenType() {
        return tokenType;
    }

    public void setTokenType(TokenConstant tokenType) {
        this.tokenType = tokenType;
    }

    public String getLexeme() {
        return lexeme;
    }

    public void setLexeme(String lexeme) {
        this.lexeme = lexeme;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
 
    
    
   
}
