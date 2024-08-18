/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1conant.Flex;


import java.io.StringReader;
import java_cup.runtime.Symbol;
import java.io.IOException;
import practica1conant.sym;
/**
 *
 * @author DAVID
 */
public class Token {
    
    public final int type;
    public final String lexeme;
    public final int line;
    public final int column;

    public Token(int type, String lexeme, int line, int column) {
        this.type = type;
        this.lexeme = lexeme;
        this.line = line;
        this.column = column;
    }

    @Override
    public String toString() {
        return "Token: " + type + " (" + lexeme + "), Line: " + line + ", Column: " + column;
    }
 
    
   
}
