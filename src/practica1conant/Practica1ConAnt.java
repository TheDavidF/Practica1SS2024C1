/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1conant;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Practica1ConAnt {

    private static ArrayList<Token> tokens;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Ejemplo de entrada
            String input = 
                    """
                    graficar graficar (rectangulo_12, 12 * 3 + 2, 15, 4 / 4,  negro)
                    
                    graficar cuadrado ( figura_cuadrada, 12*3, 15+1, (15-3) / 4, verde)
                    
                    graficar circulo (figura_1, 25 + 12, 25, 15/3, rojo)
                    
                    graficar rectangulo (linea_Amarillo, 12 * 3 + 2, 15, 4 / 4, 50 * 1, amarillo)
                    
                    graficar poligono ( PoligA, 12 + 2, 15, 6, 50 / 2, 12, amarillo)""";

            // Crear un lector de entrada
            StringReader reader = new StringReader(input);

            // Crear una instancia de JFlex Lexer
            Lexer lexer = new Lexer(reader);

            // Crear una instancia del parser
            Parser parser = new Parser(lexer);

            // Ejecutar el análisis
            parser.parse();

            ArrayList<Error> errores = parser.recuperarErrores();

            for (Error errore : errores) {
                System.out.println(errore);
            }
            ArrayList<Animable> figuras;
            if (errores.isEmpty()) {
                figuras = parser.devolverFiguras();
                for (Animable figura : figuras) {
                    System.out.println(figura);
                }
            }
            // Obtener los errores

        } catch (Exception e) {
            System.out.println("Se produjo un error durante el análisis:");
            e.printStackTrace();
        }
    }
}
