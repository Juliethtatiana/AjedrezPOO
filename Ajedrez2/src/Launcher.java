
import logica.Ajedrez;
import presentacion.Modelo;
import presentacion.Ventana;



public class Launcher {

    private Ajedrez ajedrez;

    public static void main(String[] args) {
       new Launcher();
    }
    //posiciones de las fichas 

    public Launcher() {

        ajedrez = new Ajedrez();
        ajedrez.iniciarPartida();
        //metodo que recibe como parametros (posicion del arreglo de jugadores que hay en ajedrez, y inicio, x inicio, y final, x final)
        //el primer parametro hace referencia al jugador de las fichas negras
        //NOTA: si son fichas negras se pasan las coordenadas de la parte de arriba, si son fichas blancas se toma como referecia la torre de fichas blancas pos(6,0)
        //ajedrez.calcularPosMov(1, 4);//PARA SABER EN EL TABLERO A QUE POSICIONES SE PUEDE MOVER LA  FICHA
         ajedrez.hacerMovimiento(0, 1, 4,3,4);  //PARA MOVER LA  FICHA 
         ajedrez.hacerMovimiento(0, 7, 5,2,0);
        //ajedrez.hacerMovimiento(0, 0, 3,1,4);
       // ajedrez.hacerMovimiento(0, 1, 4,2,5);
    }

}
