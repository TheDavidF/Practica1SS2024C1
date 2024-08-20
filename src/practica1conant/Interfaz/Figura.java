/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1conant.Interfaz;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author DAVID
 */
abstract class Figura implements Animable{
    
    protected String nombre;
    protected double posX;
    protected double posY;
    protected String color;
    
    public Figura(String nombre, double posX, double posY, String color) {
        this.nombre = nombre;
        this.posX = posX;
        this.posY = posY;
        this.color = color;
    }
    
    public Color convertir(String color){
        switch (color.toLowerCase()) {
            case "negro":
                return Color.BLACK;
            case "blanco":
                return Color.WHITE;
            case "rojo":
                return Color.RED;
            case "verde":
                return Color.GREEN;
            case "azul":
                return Color.BLUE;
            case "amarillo":
                return Color.YELLOW;
            case "gris":
                return Color.GRAY;
            case "morado":
                return new Color(128, 0, 128); // Morado
            case "rosa":
                return new Color(255, 192, 203); // Rosa
            case "naranja":
                return new Color(255, 165, 0); // Naranja
            // Añade más colores si es necesario
            default:
                throw new IllegalArgumentException("Color no reconocido: " + color);
        }
    }

    public abstract void dibujar(Graphics g);
    
}
