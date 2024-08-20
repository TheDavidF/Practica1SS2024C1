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
public class Rectangulo extends Figura {

    private boolean incrementPhase = true;
    private int incrementCount = 0;
    private double ancho;
    private double alto;
    private double posXVelocidad = 1; // Velocidad de animación en X
    private double posYVelocidad = 1; // Velocidad de animación en Y

    public Rectangulo(String nombre, double posX, double posY, double ancho, double alto, String color) {
        super(nombre, posX, posY, color);
        this.ancho = ancho;
        this.alto = alto;
    }

    public void dibujar(Graphics g) {
        g.setColor(convertir(color));
        g.fillRect((int) posX, (int) posY, (int) ancho, (int) alto);

    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
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
        // Actualizar la posición de la figura para animar
        posX += posXVelocidad;
        posY += posYVelocidad;

        // Cambiar dirección si se sale del área visible (opcional)
        if (posX < 0 || posX + ancho > 800) {
            posXVelocidad *= -1; // Cambia la dirección si toca los bordes
        }
        if (posY < 0 || posY + alto > 600) {
            posYVelocidad *= -1;
        }
    }

    public void mover(double deltaX, double deltaY, String animacion) {
        double posxx = posX;
        double posyy = posY;
        if (animacion.equals("linea")) {
            posX += deltaX;
            posY += deltaY;

            if (posX > 450) {
                posX = posxx;
                // Reiniciar la posición cuando el rectángulo sale del área visible
            }
        } else if (animacion.equals("curva")) {
            posX += 1;
            if (incrementPhase) {
                if (incrementCount < 50) {
                    posY += 1;
                    incrementCount++;
                } else {
                    incrementPhase = false; // Cambiar a fase de decremento
                    incrementCount = 0;     // Reiniciar el contador
                }
            } else {
                if (incrementCount < 50) {
                    posY -= 1;
                    incrementCount++;
                } else {
                    incrementPhase = true;  // Cambiar de nuevo a fase de incremento
                    incrementCount = 0;     // Reiniciar el contador
                }
            }

            if (posX > 450 || posY > 400) {
                posX = posxx;
                posY = posyy;

                // Reiniciar la posición cuando el rectángulo sale del área visible
            }
        }

    }

}
