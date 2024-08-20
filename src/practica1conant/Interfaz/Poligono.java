package practica1conant.Interfaz;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author DAVID
 */
public class Poligono extends Figura {

    private double lados;
    private double ancho;
    private double alto;

    //variables de animacion
    private double limiteX;
    private double limiteY;
    private double velocidadX;
    private double velocidadY;
    private double posXInicial;
    private double posYInicial;

    public Poligono(String nombre, double posX, double posY, double lados, double ancho, double alto, String color) {
        super(nombre, posX, posY, color);
        this.lados = lados;
        this.ancho = ancho;
        this.alto = alto;

        this.posXInicial = posX;
        this.posYInicial = posY;
        this.limiteX = 450;
        this.limiteY = 400;
        this.velocidadX = 1;
        this.velocidadY = 0;
    }

    public void dibujar(Graphics g) {
        g.setColor(convertir(color));
        
        int[] xPoints = new int[(int)lados];
        int[] yPoints = new int[(int)lados];

        // Calcula el radio como la mitad del menor de ancho y alto
        double radio = Math.min(ancho, alto) / 2.0;

        // Calcula el ángulo entre los vértices
        double centroX = posX;
        double centroY = posY;
        double angulo = 2 * Math.PI / lados;

        for (int i = 0; i < lados; i++) {
            double theta = angulo * i;
            xPoints[i] = (int) (centroX + radio * Math.cos(theta));
            yPoints[i] = (int) (centroY + radio * Math.sin(theta));
        }

        // Ajusta la posición si se quiere centrar el polígono en base al ancho y alto
        int offsetX = (int) ((ancho - radio * 2) / 2);
        int offsetY = (int) ((alto - radio * 2) / 2);

        // Dibuja el polígono
        g.drawPolygon(
                shiftArray(xPoints, offsetX),
                shiftArray(yPoints, offsetY),
                (int)lados
        );
    }

    // Método para ajustar las coordenadas del polígono
    private int[] shiftArray(int[] array, int offset) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i] + offset;
        }
        return newArray;
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

    public double getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
