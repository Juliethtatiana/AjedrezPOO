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
public class Peon extends Ficha{
    private boolean primerMov = false;
    public Peon(String color) {
        super(color,'P');
    }

    @Override
    public ArrayList<Point> posiblesMovimientos(Jugador jugador) {
         pm.clear();
         pm.add(new Point(coordenada.x+1, coordenada.y+1));
          if(super.getColor()=="blanco"){
             // MOVIMIENTOS EN LINEA RECTA
            if(primerMov==false){
                // se habilita el primer movimento de dos casillas
                pm.add(new Point(coordenada.x,coordenada.y+2));
            }     
          // MOVIMIENTO CAPTURA AL PASO.
            
            // se necesita estar en la fila 4 (Empieza a contar desde 0)
            if(coordenada.y==4){
                // verifica si hay una ficha del equipo negro al lado de esta ficha
                if(coordenada.x<7){
                    // se pregunta si hay un peon en la posiciÃ³n de al lado
                    // se dirige a la esquina derecha
                    /*if(capturaPaso(new Point(coordenada.x+1,coordenada.y)==true){
                        pm.add(new Point(coordenada.x+1,coordenada.y+1));
                    } */
                }
                if(coordenada.x>0){
                    // se pregunta si hay un peon en la posiciÃ³n de al lado
                    // se dirige en la direcciÃ³n (0,7) esquina izquierda
                    /*if(capturaPaso(new Point(coordenada.x-1,coordenada.y)==true){
                        pm.add(new Point(coordenada.x-1,coordenada.y+1));
                    } */ 
                }                    
            }
            if(super.getCoordenada().y<7){
                pm.add(new Point(coordenada.x,coordenada.y+1));
            }

            // MOVIMIENTOS EN DIAGONAL
            // las posiciones del tablero van de 0 a 7 (para concordar con una matriz)
            // validan si la ficha esta en alguna de las dos esquinas (0,7) y (7,7)
            // no era tan necesario validarlo pero bueno
            if(coordenada.x<7 && coordenada.y<7){
                pm.add(new Point(coordenada.x+1,coordenada.y+1));
            }
            if(coordenada.x>0 && coordenada.y<7){
                pm.add(new Point(coordenada.x-1,coordenada.y+1));
            }
        }else{
            //---------------------------------------------------------------------------------------
            // LO SIGUIENTE ES PARA LAS FICHAS NEGRAS QUE SE DIRIGEN HACIA ABAJO
             // MOVIMIENTOS EN LINEA RECTA
             if(primerMov==false){
                // se habilita el primer movimento de dos casillas
                pm.add(new Point(coordenada.x,coordenada.y-2));
            }           
            // posiciÃ³n en Y se le resta 1 posiciÃ³n 
            if(super.getCoordenada().y>0){
                pm.add(new Point(coordenada.x,coordenada.y-1));
            }

            // MOVIMIENTO CAPTURA AL PASO.
            // se necesita estar en la fila 3 
            if(coordenada.y==3){
                // verifica si hay una ficha del equipo negro al lado de esta ficha
                if(coordenada.x>0){
                     // se pregunta si hay un peon en la posiciÃ³n de al lado
                     // se mueve hacia el suroeste hacia el (0,0)
                     /*if(capturaPaso(new Point(coordenada.x-1,coordenada.y)==true){
                        pm.add(new Point(coordenada.x-1,coordenada.y-1));
                    } */
                }
                // se mueve hacia el sureste hacia el (7,0)
                if(super.getCoordenada().x<7 && super.getCoordenada().y>0){                  
                    // se pregunta si hay un peon en la posiciÃ³n de al lado
                    /*if(capturaPaso(new Point(coordenada.x+1,coordenada.y)==true){
                        pm.add(new Point(coordenada.x+1,coordenada.y-1));
                    } */
                }
                 
            }


            // MOVIMIENTOS EN DIAGONAL
            // las posiciones del tablero van de 0 a 7 (para concordar con una matriz)
            // validan si la ficha esta en alguna de las dos esquinas (0,7) y (7,7)
            // no era tan necesario validarlo pero bueno
            if(coordenada.x>0 && coordenada.y>0){
                pm.add(new Point(coordenada.x-1,coordenada.y-1));
            }
            if(coordenada.x<7 && coordenada.y>0){
                pm.add(new Point(coordenada.x+1,coordenada.y-1));
            }
        
          }
          
        return pm;
    }
}
