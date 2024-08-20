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
public class Circulo extends Figura{
    
    
    private double radio;
    
    private double limiteX;
    private double limiteY;
    private double velocidadX;
    private double velocidadY;
    private double posXInicial;
    private double posYInicial;
    private double radioInicial;

    public Circulo(String nombre, double posX, double posY, double radio, String color) {
        super(nombre, posX, posY, color);
        this.radio = radio;
        
        this.posXInicial = posX;
        this.posYInicial = posY;
        this.radioInicial = radio;
        this.limiteX = 450;
        this.limiteY = 400;
        this.velocidadX = 1;
        this.velocidadY = 0;
    }
    
    public void mover() {
        posX += velocidadX;
        posY += velocidadY;

        if (posX > limiteX) {
            posX = posXInicial;
        }
        if (posY > limiteY) {
            posY = posYInicial;
        }
    }
    
    
    public void dibujar(Graphics g) {
        g.setColor(convertir(color));
        g.fillOval((int)posX, (int)posY, (int)radio * 2, (int)radio * 2);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
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
