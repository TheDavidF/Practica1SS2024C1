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
public class Linea extends Figura {

    private double posX2;
    private double posY2;

    // Variables de animación
    private double limiteX;
    private double limiteY;
    private double velocidadX;
    private double velocidadY;
    private double posX1Inicial;
    private double posY1Inicial;
    private double posX2Inicial;
    private double posY2Inicial;

    public Linea(String nombre, double posX, double posY, double posX2, double posY2, String color) {
        super(nombre, posX, posY, color);
        this.posX2 = posX2;
        this.posY2 = posY2;

        this.posX1Inicial = posX;
        this.posY1Inicial = posY;
        this.posX2Inicial = posX2;
        this.posY2Inicial = posY2;
        this.limiteX = 500;
        this.limiteY = 400;
        this.velocidadX = 1;
        this.velocidadY = 0;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(convertir(color));
        g.drawLine((int) posX, (int) posY, (int) posX2, (int) posY2);
    }

    public void mover() {
        posX += velocidadX;
        posY += velocidadY;
        posX2 += velocidadX;
        posY2 += velocidadY;

        if (posX > limiteX || posX2 > limiteX) {
            posX= posX1Inicial;
            posX2 = posX2Inicial;
        }
        if (posY > limiteY || posY2 > limiteY) {
            posY = posY1Inicial;
            posY2 = posY2Inicial;
        }
    }

    public double getPosX2() {
        return posX2;
    }

    public void setPosX2(double posX2) {
        this.posX2 = posX2;
    }

    public double getPosY2() {
        return posY2;
    }

    public void setPosY2(double posY2) {
        this.posY2 = posY2;
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
