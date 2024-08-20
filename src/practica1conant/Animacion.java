/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1conant;

import java.util.ArrayList;
import practica1conant.Interfaz.Circulo;
import practica1conant.Interfaz.Cuadrado;
import practica1conant.Interfaz.Linea;
import practica1conant.Interfaz.Poligono;
import practica1conant.Interfaz.Rectangulo;

/**
 *
 * @author DAVID
 */
public class Animacion {
    
    private ArrayList<Cuadrado> cuadrados;
    private ArrayList<Circulo> circulos;
    private ArrayList<Linea> lineas;
    private ArrayList<Poligono> poligonos;
    private ArrayList<Rectangulo> rectangulos;
    
    
    public Animacion(){
        cuadrados = new ArrayList<>();
        circulos = new ArrayList<>();
        lineas = new ArrayList<>();
        poligonos = new ArrayList<>();
        rectangulos = new ArrayList<>();
    }

    public ArrayList<Cuadrado> getCuadrados() {
        return cuadrados;
    }

    public void setCuadrados(ArrayList<Cuadrado> cuadrados) {
        this.cuadrados = cuadrados;
    }

    public ArrayList<Circulo> getCirculos() {
        return circulos;
    }

    public void setCirculos(ArrayList<Circulo> circulos) {
        this.circulos = circulos;
    }

    public ArrayList<Linea> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<Linea> lineas) {
        this.lineas = lineas;
    }

    public ArrayList<Poligono> getPoligonos() {
        return poligonos;
    }

    public void setPoligonos(ArrayList<Poligono> poligonos) {
        this.poligonos = poligonos;
    }

    public ArrayList<Rectangulo> getRectangulos() {
        return rectangulos;
    }

    public void setRectangulos(ArrayList<Rectangulo> rectangulos) {
        this.rectangulos = rectangulos;
    }
    
    
            
    
    
}
