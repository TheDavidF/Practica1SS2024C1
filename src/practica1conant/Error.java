/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1conant;

/**
 *
 * @author DAVID
 */
public class Error {
    
    private String lexema;
    private int linea;
    private int columna;
    private String descripcion;
    private String tipo;

    public Error(String lexema, int linea, int columna, String des, String tipo) {
        this.lexema = lexema;
        this.linea = linea;
        this.columna = columna;
        this.descripcion = tipo;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Error{" + "lexema=" + lexema + ", linea=" + linea + ", columna=" + columna + ", tipo=" + descripcion + '}';
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public String getTipo() {
        return descripcion;
    }

    public void setTipo(String tipo) {
        this.descripcion = tipo;
    }

    
    
}
