/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1conant.Interfaz;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Timer;
/**
 *
 * @author DAVID
 */
public class Dibujo extends Canvas {
    
    
    
    private final Timer timer;
    private ArrayList<Animable> figuras = new ArrayList<>();

    public Dibujo(ArrayList<Animable> figuras) {
        
        this.figuras = figuras;
        
        timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //actualizarAnimaciones();
                repaint();
            }
        });
        timer.start();
    }
    
    
       private void actualizarAnimaciones() {
        for (Animable figura : figuras) {
            if (figura instanceof Rectangulo) {
                // Actualiza la posición del rectángulo
                ((Rectangulo) figura).mover(1, 0, "curva"); // Ejemplo: mover hacia la derecha
            } else if(figura instanceof Poligono){
                ((Poligono)figura).mover();
            } else if(figura instanceof Linea){
                ((Linea)figura).mover();
            } else if(figura instanceof  Circulo){
                ((Circulo)figura).mover();
            } else if(figura instanceof Cuadrado){
                ((Cuadrado)figura).mover("curva");
            }
            // Agrega lógica para otras figuras aquí si es necesario
        }
    }

    // Método para iniciar la animación
    public void startAnimation() {
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        for (Animable figura : figuras) {
            figura.dibujar(g);
        }
    }

    
    private void animarRectangulo(){
        
    }
}
