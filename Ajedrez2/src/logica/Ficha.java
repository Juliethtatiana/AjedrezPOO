/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Tatiana
 */
public abstract class Ficha {
    char tipo;
    String color;
    Point coordenada;
    ArrayList<Point> pm;
    boolean vivo;
    
public Ficha(String color, char tipo) {
        this.color = color;
        this.tipo = tipo;
        pm= new ArrayList<Point>();
    }    
public String getColor() {
        return color;
    }
 public void setColor(String color) {
        this.color = color;
    }
public Point getCoordenada() {
        return coordenada;
    }

public void setCoordenada(Point coordenada) {
        this.coordenada = coordenada;
    }

    public char getTipo() {
        return tipo;
    }
//para corroborar cuales son los posibles movimientos que calculo
public void imprimirPosMov(){
    for(int i=0;i<pm.size();i++){
        System.out.println("x"+pm.get(i).x+" y:"+pm.get(i).y);
    }
        
}

public void mover(Point nuevo){
        this.setCoordenada(nuevo);
        //TODO: si esta posición esta ocupada, entonces capturar y realizar animación
}
public abstract ArrayList<Point> posiblesMovimientos(Jugador jugador);


}
