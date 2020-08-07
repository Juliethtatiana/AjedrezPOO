
package presentacion;

import logica.Ajedrez;



public class Modelo  {
    
    // sistema que se encarga de la logica de la aplicación
    private Ajedrez miSistema;
    private Ventana ventana;

    public Modelo (){
     
    }

    // método que obtendrá el sistema que se esta utilizando 
    public Ajedrez getMiSistema() {
        if(miSistema == null){
            miSistema = new Ajedrez();
        }
        return miSistema;                
        
    }
    
    public Ventana getVentana(){
        if (ventana==null) {
            ventana=new Ventana(this);
        }
        return ventana;
    }

    public void iniciar(){
        this.miSistema = getMiSistema();
        this.ventana = getVentana();
        ventana.setVisible(true);
    }

    public void CrearPartida (){
        ventana.PonerFichas();
    }

    public void VerMovimientos(){

    }

    public void MoverFicha(int mov [][]) {
        
    }

    public void TerminarPartida(){
        
    }
}
