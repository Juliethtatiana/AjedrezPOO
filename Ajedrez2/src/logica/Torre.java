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
public class Torre extends Ficha{

    public Torre(String color) {
        super(color,'T');
    }



    @Override
    public ArrayList<Point> posiblesMovimientos(Jugador jugador) {
        pm.clear();
        Point posAux=coordenada;
       while(posAux.x<8){
           pm.add(new Point(posAux.x+1,posAux.y));
           posAux.x++;
       }
       posAux= coordenada;
       while(posAux.x>=0){
           pm.add(new Point(posAux.x-1,posAux.y));
           posAux.x--;
       }
       posAux= coordenada;
       while(posAux.y>=0){
           pm.add(new Point(posAux.x,posAux.y-1));
           posAux.y--;
       }
       posAux= coordenada;
       while(posAux.y<8){
           pm.add(new Point(posAux.x,posAux.y+1));
           posAux.y++;
       }
        return pm;
    }
    
}
