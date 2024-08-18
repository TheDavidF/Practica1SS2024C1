/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1conant;

import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import practica1conant.Flex.Token;

/**
 *
 * @author DAVID
 */
public class Practica1ConAnt {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        try {
            Lexer lexer = new Lexer(new StringReader("animar animar anterior (curva, 50*3, 75+5, 1+1)"));
            Parser parser = new Parser(lexer);
            parser.parse();
            System.out.println("Entrada valida");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error de análisis");
        }
    }
}
