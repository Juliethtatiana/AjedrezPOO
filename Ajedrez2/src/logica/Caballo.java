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
public class Caballo extends Ficha{

    public Caballo(String color) {
        super(color,'C');
        
    }

    @Override
    public ArrayList<Point> posiblesMovimientos(Jugador jugador) {
        pm.clear();
        Point posAux= coordenada;
        
        return pm;
    }
    
}
