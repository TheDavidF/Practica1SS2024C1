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
import practica1conant.Interfaz.Principal;

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
        Principal principal = new Principal();
        principal.setVisible(true);
    }
}
