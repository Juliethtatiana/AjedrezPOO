
package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Controlador implements ActionListener{
    
    private Ventana ventana;
    private Modelo miApp;

      
    public Controlador(Ventana v){
        this.ventana = v;
        miApp = ventana.getModelo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

}
