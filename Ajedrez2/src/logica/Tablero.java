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
public class Tablero {
    public  char tablero[][]; //tablero de chars para imprimir en consola
    public Ficha tableroFichas[][]; //tablero de fichas para saber como estan organizadas en el tablero
    private ArrayList<Ficha> fichasblancas;
    private ArrayList<Ficha> fichasnegras;
    
    
    public Tablero(ArrayList<Ficha> fichasblancas, ArrayList<Ficha> fichasnegras){
        this.fichasblancas= fichasblancas;
        this.fichasnegras = fichasnegras;
        PonerFichas();
    }
    public void PonerFichas(){
        tablero = new char[8][8];
        tableroFichas = new Ficha[8][8];
        int aux=15;
        ArrayList<Ficha> ficha= this.fichasblancas;
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
               if(i>5){
                    tablero[i][j]= ficha.get(aux).getTipo();
                    ficha.get(aux).setCoordenada(new Point(i, j));
                    tableroFichas[i][j]= ficha.get(aux);
                    aux++;
                  
               }else{
                   tablero[i][j]= ficha.get(aux).getTipo();
                   ficha.get(aux).setCoordenada(new Point(i, j));
                   tableroFichas[i][j]= ficha.get(aux);
                   aux--;
               }
               
               
            }
            if(i==1){
                i=5;
                ficha=this.fichasnegras;
                aux=0;
            }
        }
        
    }
    public void imprimirTablero(){
        for (int x=0; x < tablero.length; x++) {
            System.out.print("|");
            for (int y=0; y < tablero[x].length; y++) {
                System.out.print (tablero[x][y]);
                if (y!=tablero[x].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }
    public void moverFicha(Jugador jugador,Point ini,Point destino){
        System.out.println("la ficha que se va a mover es: "+tableroFichas[ini.x][ini.y].getTipo());
                
                tableroFichas[ini.x][ini.y].posiblesMovimientos(jugador);
                tableroFichas[ini.x][ini.y].imprimirPosMov();
                
                tableroFichas[ini.x][ini.y].setCoordenada(destino);
                tableroFichas[destino.x][destino.y]=  tableroFichas[ini.x][ini.y];
                tableroFichas[ini.x][ini.y]=null;
                System.out.println(" -------------------");
                tablero[ini.x][ini.y]=' ';
               
                tablero[destino.x][destino.y]=tableroFichas[destino.x][destino.y].getTipo();
            
    }
    public char[][] getTablero() {
        return tablero;
    }
    
}
