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
public class Cuadrado extends Figura {

    private double size;

    private double limiteX;
    private double limiteY;
    private double velocidadX;
    private double velocidadY;
    private double posXInicial;
    private double posYInicial;
    private double radio;
    private double angulo;

    public Cuadrado(String nombre, double posX, double posY, double size, String color) {
        super(nombre, posX, posY, color);
        this.size = size;

        this.posXInicial = posX;
        this.posYInicial = posY;
        this.limiteX = 400;
        this.limiteY = 510;
        this.velocidadX = 1;
        this.velocidadY = 0;
        this.radio = 100; // Radio para animación en curva
        this.angulo = 0;

    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(convertir(color));
        g.fillRect((int) posX, (int) posY, (int) size, (int) size);
    }

    
    public void mover(String animacion) {
        if (animacion.equals("curva")) {
            // Animación en curva
            angulo += 0.05; // Incremento del ángulo
            if (angulo >= 2 * Math.PI) {
                angulo = 0; // Reiniciar ángulo al completar un círculo
            }

            posX = posXInicial + radio * Math.cos(angulo);
            posY = posYInicial + radio * Math.sin(angulo);
        } else {
            // Animación lineal
            posX += velocidadX;
            posY += velocidadY;

            // Reiniciar posición si el cuadrado sale de los límites
            if (posX > limiteX) {
                posX = posXInicial;
            }
            if (posY > limiteY) {
                posY = posYInicial;
            }
        }
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPosX() {
        return posX;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public double getPosY() {
        return posY;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    

    @Override
    public void actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
