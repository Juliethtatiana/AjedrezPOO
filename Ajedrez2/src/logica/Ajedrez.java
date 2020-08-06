
package logica;

import java.awt.Point;


public class Ajedrez {
    private Jugador jugadores[];
    private int numJugadas;
    private Tablero tablero;
    private boolean turno=true; //true turno fichas blancas
    
    public Ajedrez(){
        jugadores = new Jugador[2];
        jugadores[0]= new Jugador(true,"blanco");
        jugadores[1]= new Jugador(false,"negro");
        numJugadas=0;
        
    }
    public void VerificarFichas(){
    }
    
    
    public void iniciarPartida(){
        tablero= new Tablero(jugadores[0].getFichas(),jugadores[1].getFichas());
        tablero.imprimirTablero();
    }
    public void hacerMovimiento(int jugador, int x1, int y1,int x2, int y2){
        tablero.moverFicha(jugadores[jugador],new Point(x1, y1),new Point(x2, y2));
        tablero.imprimirTablero();
        
    }
    public void calcularPosMov(int x, int y){
       int tipoFicha = tablero.getTablero()[x][y];
       
    }
}
