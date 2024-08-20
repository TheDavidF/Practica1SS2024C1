/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1conant;

/**
 *
 * @author DAVID
 */
public class Grafica {
    
    private String figura;
    private String nombre;
    private double ex1;
    private double ex2;
    private double ex3;
    private double ex4;
    private double ex5;
    private String color;

    public Grafica(String figura, String nombre, double ex1, double ex2, double ex3, String color) {
        this.figura = figura;
        this.nombre = nombre;
        this.ex1 = ex1;
        this.ex2 = ex2;
        this.ex3 = ex3;
        this.color = color;
    }
    
    public Grafica(String figura, String nombre, double ex1, double ex2, double ex3,double ex4, String color) {
        this.figura = figura;
        this.nombre = nombre;
        this.ex1 = ex1;
        this.ex2 = ex2;
        this.ex3 = ex3;
        this.ex4 = ex4;
        this.color = color;
    }
    
    public Grafica(String figura, String nombre, double ex1, double ex2, double ex3,double ex4,double ex5, String color) {
        this.figura = figura;
        this.nombre = nombre;
        this.ex1 = ex1;
        this.ex2 = ex2;
        this.ex3 = ex3;
        this.ex4 = ex4;
        this.ex5 = ex5;
        this.color = color;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEx1() {
        return ex1;
    }

    public void setEx1(double ex1) {
        this.ex1 = ex1;
    }

    public double getEx2() {
        return ex2;
    }

    public void setEx2(double ex2) {
        this.ex2 = ex2;
    }

    public double getEx3() {
        return ex3;
    }

    public void setEx3(double ex3) {
        this.ex3 = ex3;
    }

    public double getEx4() {
        return ex4;
    }

    public void setEx4(double ex4) {
        this.ex4 = ex4;
    }

    public double getEx5() {
        return ex5;
    }

    public void setEx5(double ex5) {
        this.ex5 = ex5;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Grafica{" + "figura=" + figura + ", nombre=" + nombre + ", ex1=" + ex1 + ", ex2=" + ex2 + ", ex3=" + ex3 + ", ex4=" + ex4 + ", ex5=" + ex5 + ", color=" + color + '}';
    }
    
    
    
    
    
}
