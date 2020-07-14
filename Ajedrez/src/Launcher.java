
import presentacion.Modelo;
import presentacion.Ventana;



public class Launcher {

    private Modelo modelo;

    public static void main(String[] args) {
       new Launcher();
    }


    public Launcher() {

        modelo = new Modelo(); 
        modelo.iniciar();
       
    }

}
