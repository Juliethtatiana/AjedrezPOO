
package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class Controlador implements ActionListener{
    
    private Ventana ventana;
    private Modelo miApp;

      
    public Controlador(Ventana v){
        this.ventana = v;
        miApp = ventana.getModelo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
           
        JButton button =(JButton)e.getSource();


        if(button.getText() == "Iniciar partida"){
            button.setText("Salir de la partida");
            miApp.CrearPartida();
        }

        if (button.getText()== "Salir de la partida"){
            miApp.TerminarPartida();
        }
    }

}
