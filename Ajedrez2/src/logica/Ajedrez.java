
package logica;

import java.awt.Point;


public class Ajedrez {

    private int numJugadas;
    private Tablero tablero;
    private boolean turno=true; //true turno fichas blancas
    
    public Ajedrez(){
        
        numJugadas=0;
        
    }
    public void VerificarFichas(){
    }
    
    
    public void iniciarPartida(){
        tablero= new Tablero();
        tablero.imprimirTablero();
    }
    public void hacerMovimiento(int jugador, int x1, int y1,int x2, int y2){
        tablero.moverFicha(jugador,new Point(x1, y1),new Point(x2, y2));
        tablero.imprimirTablero();
        
    }
    
    public void calcularPosMov(int x, int y){
       
       tablero.calcularPosMov(0, new Point(x, y));
    }
}
