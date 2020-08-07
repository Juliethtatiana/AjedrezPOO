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
 * @author Admin
 */
public class GestorMovimientos {
    private boolean turno = true; // truepara fichas blancas y false para fichas negras
    private int numJugadas = 0;
    Ajedrez ajedrez;

    public GestorMovimientos(Ajedrez aj) {
        this.ajedrez=aj;
    }
    
    
  
    
     public void moverFicha(Jugador jugador,Point ini,Point destino){
         //System.out.print(ajedrez.tablero.tableroFichas[ini.x][ini.y].getColor());
          if(turno && jugador.getFichas().contains(ajedrez.getTablero().tableroFichas[ini.x][ini.y])){
             System.out.println("la ficha que se va a mover es: "+ajedrez.getTablero().tableroFichas[ini.x][ini.y].getTipo());
                
                 ArrayList<Point> pm = ajedrez.getTablero().tableroFichas[ini.x][ini.y].posiblesMovimientos( ajedrez.getTablero());
       
                if(pm.isEmpty()){
                    System.out.println("ESTA FICHA NO  SE PUEDE MOVER");
                    
                }else{
                    if(pm.contains(destino)){
                        ajedrez.getTablero().tableroFichas[ini.x][ini.y].setCoordenada(destino);
                        ajedrez.getTablero().tableroFichas[destino.x][destino.y]=  ajedrez.getTablero().tableroFichas[ini.x][ini.y];
                        ajedrez.getTablero().tableroFichas[ini.x][ini.y]=null;
                        System.out.println(" -------------------");
                        ajedrez.getTablero().tablero[ini.x][ini.y]=' ';
               
                        ajedrez.getTablero().tablero[destino.x][destino.y]=ajedrez.getTablero().tableroFichas[destino.x][destino.y].getTipo();
                        numJugadas++;
                        turno=false;
                        ajedrez.getTablero().imprimirTablero();
                        System.out.print("***TURNO  CAMBIADO A  FICHAS NEGRAS**");
                    }else{
                        System.out.println("MOVIMIENTO  NO PERMITIDO");
                    }
                
            
                }
             
        }else{
            if(jugador.getFichas().contains(ajedrez.getTablero().tableroFichas[ini.x][ini.y])){
                 System.out.println("la ficha que se va a mover es: "+ajedrez.getTablero().tableroFichas[ini.x][ini.y].getTipo());
                
                 ArrayList<Point> pm = ajedrez.getTablero().tableroFichas[ini.x][ini.y].posiblesMovimientos( ajedrez.getTablero());
                if(pm.isEmpty()){
                    System.out.println("ESTA FICHA NO  SE PUEDE MOVER");
                    
                }else{
                    if(pm.contains(destino)){
                        ajedrez.getTablero().tableroFichas[ini.x][ini.y].setCoordenada(destino);
                        ajedrez.getTablero().tableroFichas[destino.x][destino.y]=  ajedrez.getTablero().tableroFichas[ini.x][ini.y];
                        ajedrez.getTablero().tableroFichas[ini.x][ini.y]=null;
                        System.out.println(" -------------------");
                        ajedrez.getTablero().tablero[ini.x][ini.y]=' ';
               
                        ajedrez.getTablero().tablero[destino.x][destino.y]=ajedrez.getTablero().tableroFichas[destino.x][destino.y].getTipo();
                        ajedrez.getTablero().imprimirTablero();
                        numJugadas++;
                         turno=true;
                         System.out.print("***TURNO  CAMBIADO A  FICHAS BLANCAS**");
                    }else{
                        System.err.println("MOVIMIENTO  NO PERMITIDO");
                    }
                
            
                }
               
            }  
              System.out.println("##Movimiento incorrecto  intente de nuevo ##");
        }
       
                
                
    }
    public void calcularPosMov(int  jugador,Point pos){  
        ajedrez.getTablero().tableroFichas[pos.x][pos.y].posiblesMovimientos( ajedrez.getTablero());
        System.out.println("Los posibles movimientos que puedes hacer con la ficha: "+  ajedrez.getTablero().tableroFichas[pos.x][pos.y].getTipo()+ " de color :"+ ajedrez.getTablero().tableroFichas[pos.x][pos.y].getColor()+" son: ");
        ajedrez.getTablero().tableroFichas[pos.x][pos.y].imprimirPosMov();
    }
    public void matarFicha(){
    
    }
    
}
