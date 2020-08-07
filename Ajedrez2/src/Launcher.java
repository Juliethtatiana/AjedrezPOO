
import logica.Ajedrez;
import presentacion.Modelo;
import presentacion.Ventana;
import java.util.Scanner;
import logica.*;


public class Launcher {

    private Ajedrez ajedrez;
    public boolean partida;
    public int jugador;
    


    public static void main(String[] args) {
       new Launcher();
    }

    //posiciones de las fichas 

    public Launcher() {
        jugador =0;
        Scanner input = new Scanner(System.in);

        ajedrez = new Ajedrez();
        ajedrez.iniciarPartida();
        //metodo que recibe como parametros (posicion del arreglo de jugadores que hay en ajedrez, y inicio, x inicio, y final, x final)
        //el primer parametro hace referencia al jugador de las fichas negras
        //NOTA: si son fichas negras se pasan las coordenadas de la parte de arriba, si son fichas blancas se toma como referecia la torre de fichas blancas pos(6,0)
        //ajedrez.calcularPosMov(1, 4);//PARA SABER EN EL TABLERO A QUE POSICIONES SE PUEDE MOVER LA  FICHA
        while(partida = true){
            while(jugador==0){
            System.out.print("Ingrese la ficha a mover: ");
            int posx = input.nextInt();
            int posy = input.nextInt();

            System.out.println("Usted ingreso: " + posx + " "+ posy);
           if(ajedrez.CalcularMovimiento(jugador, posx, posy)){
                System.out.print("Ingrese la posicion del movimiento: ");
            int posx1 = input.nextInt();
            int posy1 = input.nextInt();   
            System.out.println("Usted ingreso: " + posx1 + " "+ posy1);
            
           if(ajedrez.hacerMovimiento(jugador, posx, posy, posx1, posy1)){
            jugador = 1;
           }
            
           
           }
           
            }
            
            while(jugador==1){
            System.out.print("Ingrese la ficha a mover: ");
            int posx = input.nextInt();
            int posy = input.nextInt();

            System.out.println("Usted ingreso: " + posx + " "+ posy);
           if(ajedrez.CalcularMovimiento(jugador, posx, posy)){
                System.out.print("Ingrese la posicion del movimiento: ");
            int posx1 = input.nextInt();
            int posy1 = input.nextInt();   
            System.out.println("Usted ingreso: " + posx1 + " "+ posy1);
            
            ajedrez.hacerMovimiento(jugador, posx, posy, posx1, posy1);
            
            jugador = 0;
           }
           
            }
//        // closing the scanner object
//        input.close();
            
        }
//         ajedrez.hacerMovimiento(0, 1, 5,2,5);  //PARA MOVER LA  FICHA 
//         ajedrez.hacerMovimiento(1, 7, 5,2,0);
        //ajedrez.hacerMovimiento(0, 0, 3,1,4);
       // ajedrez.hacerMovimiento(0, 1, 4,2,5);
    }

}
