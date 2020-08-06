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
public class Rey extends Ficha{

    public Rey(String color) {
        super(color,'K');
    }

 

    @Override
    public ArrayList<Point> posiblesMovimientos(Jugador jugador) {
        
        return pm;
    }
    
}
