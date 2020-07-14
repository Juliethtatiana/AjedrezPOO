
package presentacion;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JButton;
import javax.swing.JLabel;


public class Ventana extends JFrame {

    private JPanel fondo;

    private JButton a1;
    private JButton a2;    
    private JButton a3;
    private JButton a4;
    private JButton a5;
    private JButton a6;
    private JButton a7;
    private JButton a8;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton c1; 
    private JButton c2; 
    private JButton c3; 
    private JButton c4; 
    private JButton c5; 
    private JButton c6; 
    private JButton c7; 
    private JButton c8; 
    private JButton d1;
    private JButton d2;    
    private JButton d3;
    private JButton d4;
    private JButton d5;
    private JButton d6;
    private JButton d7;
    private JButton d8;
    private JButton e1;
    private JButton e2;
    private JButton e3;
    private JButton e4;
    private JButton e5;
    private JButton e6;
    private JButton e7;
    private JButton e8;
    private JButton f1; 
    private JButton f2; 
    private JButton f3; 
    private JButton f4; 
    private JButton f5; 
    private JButton f6; 
    private JButton f7; 
    private JButton f8; 
    private JButton g1;
    private JButton g2;    
    private JButton g3;
    private JButton g4;
    private JButton g5;
    private JButton g6;
    private JButton g7;
    private JButton g8;
    private JButton h1;
    private JButton h2;
    private JButton h3;
    private JButton h4;
    private JButton h5;
    private JButton h6;
    private JButton h7;
    private JButton h8;

    // extras
   
    private JButton nuevaPartida;
    private JButton salir;
    private JLabel numJugadas;

    private JPanel panel2;
    // variables de funcionamiento
    private Modelo modelo;
    private Controlador control;
    


    public Ventana(Modelo m) {
        modelo = m;
        setSize(1250, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        

        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        InicializarComponentes();
        
    }
    
  
    
    
    
    public Controlador getControl() {
        if(control == null){
            control = new Controlador(this);
        }
        return control;
        }
     
     
    public Modelo getModelo() {
        return modelo;
    }

    

    private void InicializarComponentes() {
        
        CrearTablero();
        CrearBotones();
        Bloquear();
    }

    private void CrearTablero(){
        fondo= new JPanel();
        fondo.setLayout(null);
        fondo.setBounds(20, 20, 640, 640);
        fondo.setBackground(java.awt.Color.gray);
        this.add(fondo);
    }


    private void CrearBotones(){
        //instanciar
        a1= new JButton();       
        a2= new JButton();
        a3= new JButton();
        a4= new JButton();
        a5= new JButton();
        a6= new JButton();
        a7= new JButton();
        a8= new JButton();
        b1= new JButton();
        b2= new JButton();
        b3= new JButton();
        b4= new JButton();
        b5= new JButton();
        b6= new JButton();
        b7= new JButton();
        b8= new JButton();
        c1= new JButton();
        c2= new JButton();
        c3= new JButton();
        c4= new JButton();
        c5= new JButton();
        c6= new JButton();
        c7= new JButton();
        c8= new JButton();
        d1= new JButton();
        d2= new JButton();
        d3= new JButton();
        d4= new JButton();
        d5= new JButton();
        d6= new JButton();
        d7= new JButton();
        d8= new JButton();
        e1= new JButton();
        e2= new JButton();
        e3= new JButton();
        e4= new JButton();
        e5= new JButton();
        e6= new JButton();
        e7= new JButton();
        e8= new JButton();
        f1= new JButton();
        f2= new JButton();
        f3= new JButton();
        f4= new JButton();
        f5= new JButton();
        f6= new JButton();
        f7= new JButton();
        f8= new JButton();
        g1= new JButton();
        g2= new JButton();
        g3= new JButton();
        g4= new JButton();
        g5= new JButton();
        g6= new JButton();
        g7= new JButton();
        g8= new JButton();
        h1= new JButton();
        h2= new JButton();
        h3= new JButton();
        h4= new JButton();
        h5= new JButton();
        h6= new JButton();
        h7= new JButton();
        h8= new JButton();

        a1.setBounds(20, 545, 75, 75);
        a2.setBounds(20, 470, 75, 75);
        a3.setBounds(20, 395, 75, 75);
        a4.setBounds(20, 320, 75, 75);
        a5.setBounds(20, 245, 75, 75);
        a6.setBounds(20, 170, 75, 75);
        a7.setBounds(20, 95 , 75, 75);
        a8.setBounds(20, 20 , 75, 75);
        b1.setBounds(95, 545, 75, 75);
        b2.setBounds(95, 470, 75, 75);
        b3.setBounds(95, 395, 75, 75);
        b4.setBounds(95, 320, 75, 75);
        b5.setBounds(95, 245, 75, 75);
        b6.setBounds(95, 170, 75, 75);
        b7.setBounds(95, 95 , 75, 75);
        b8.setBounds(95, 20 , 75, 75);
        c1.setBounds(170, 545, 75, 75);
        c2.setBounds(170, 470, 75, 75);
        c3.setBounds(170, 395, 75, 75);
        c4.setBounds(170, 320, 75, 75);
        c5.setBounds(170, 245, 75, 75);
        c6.setBounds(170, 170, 75, 75);
        c7.setBounds(170, 95 , 75, 75);
        c8.setBounds(170, 20 , 75, 75);
        d1.setBounds(245, 545, 75, 75);
        d2.setBounds(245, 470, 75, 75);
        d3.setBounds(245, 395, 75, 75);
        d4.setBounds(245, 320, 75, 75);
        d5.setBounds(245, 245, 75, 75);
        d6.setBounds(245, 170, 75, 75);
        d7.setBounds(245, 95 , 75, 75);
        d8.setBounds(245, 20 , 75, 75);
        e1.setBounds(320, 545, 75, 75);
        e2.setBounds(320, 470, 75, 75);
        e3.setBounds(320, 395, 75, 75);
        e4.setBounds(320, 320, 75, 75);
        e5.setBounds(320, 245, 75, 75);
        e6.setBounds(320, 170, 75, 75);
        e7.setBounds(320, 95 , 75, 75);
        e8.setBounds(320, 20 , 75, 75);
        f1.setBounds(395, 545, 75, 75);
        f2.setBounds(395, 470, 75, 75);
        f3.setBounds(395, 395, 75, 75);
        f4.setBounds(395, 320, 75, 75);
        f5.setBounds(395, 245, 75, 75);
        f6.setBounds(395, 170, 75, 75);
        f7.setBounds(395, 95 , 75, 75);
        f8.setBounds(395, 20 , 75, 75);
        g1.setBounds(470, 545, 75, 75);
        g2.setBounds(470, 470, 75, 75);
        g3.setBounds(470, 395, 75, 75);
        g4.setBounds(470, 320, 75, 75);
        g5.setBounds(470, 245, 75, 75);
        g6.setBounds(470, 170, 75, 75);
        g7.setBounds(470, 95 , 75, 75);
        g8.setBounds(470, 20 , 75, 75);
        h1.setBounds(545, 545, 75, 75);
        h2.setBounds(545, 470, 75, 75);
        h3.setBounds(545, 395, 75, 75);
        h4.setBounds(545, 320, 75, 75);
        h5.setBounds(545, 245, 75, 75);
        h6.setBounds(545, 170, 75, 75);
        h7.setBounds(545, 95 , 75, 75);
        h8.setBounds(545, 20 , 75, 75);
        

        // colores
        a1.setBackground(java.awt.Color.BLACK);
        a2.setBackground(java.awt.Color.WHITE);
        a3.setBackground(java.awt.Color.BLACK);
        a4.setBackground(java.awt.Color.WHITE);
        a5.setBackground(java.awt.Color.BLACK);
        a6.setBackground(java.awt.Color.WHITE);
        a7.setBackground(java.awt.Color.BLACK);
        a8.setBackground(java.awt.Color.WHITE);

        b1.setBackground(java.awt.Color.WHITE);
        b2.setBackground(java.awt.Color.BLACK);
        b3.setBackground(java.awt.Color.WHITE);
        b4.setBackground(java.awt.Color.BLACK);
        b5.setBackground(java.awt.Color.WHITE);
        b6.setBackground(java.awt.Color.BLACK);
        b7.setBackground(java.awt.Color.WHITE);
        b8.setBackground(java.awt.Color.BLACK);

        c1.setBackground(java.awt.Color.BLACK);
        c2.setBackground(java.awt.Color.WHITE);
        c3.setBackground(java.awt.Color.BLACK);
        c4.setBackground(java.awt.Color.WHITE);
        c5.setBackground(java.awt.Color.BLACK);
        c6.setBackground(java.awt.Color.WHITE);
        c7.setBackground(java.awt.Color.BLACK);
        c8.setBackground(java.awt.Color.WHITE);
        
        d1.setBackground(java.awt.Color.WHITE);
        d2.setBackground(java.awt.Color.BLACK);
        d3.setBackground(java.awt.Color.WHITE);
        d4.setBackground(java.awt.Color.BLACK);
        d5.setBackground(java.awt.Color.WHITE);
        d6.setBackground(java.awt.Color.BLACK);
        d7.setBackground(java.awt.Color.WHITE);
        d8.setBackground(java.awt.Color.BLACK);

        e1.setBackground(java.awt.Color.BLACK);
        e2.setBackground(java.awt.Color.WHITE);
        e3.setBackground(java.awt.Color.BLACK);
        e4.setBackground(java.awt.Color.WHITE);
        e5.setBackground(java.awt.Color.BLACK);
        e6.setBackground(java.awt.Color.WHITE);
        e7.setBackground(java.awt.Color.BLACK);
        e8.setBackground(java.awt.Color.WHITE);

        f1.setBackground(java.awt.Color.WHITE);
        f2.setBackground(java.awt.Color.BLACK);
        f3.setBackground(java.awt.Color.WHITE);
        f4.setBackground(java.awt.Color.BLACK);
        f5.setBackground(java.awt.Color.WHITE);
        f6.setBackground(java.awt.Color.BLACK);
        f7.setBackground(java.awt.Color.WHITE);
        f8.setBackground(java.awt.Color.BLACK);

        g1.setBackground(java.awt.Color.BLACK);
        g2.setBackground(java.awt.Color.WHITE);
        g3.setBackground(java.awt.Color.BLACK);
        g4.setBackground(java.awt.Color.WHITE);
        g5.setBackground(java.awt.Color.BLACK);
        g6.setBackground(java.awt.Color.WHITE);
        g7.setBackground(java.awt.Color.BLACK);
        g8.setBackground(java.awt.Color.WHITE);

        h1.setBackground(java.awt.Color.WHITE);
        h2.setBackground(java.awt.Color.BLACK);
        h3.setBackground(java.awt.Color.WHITE);
        h4.setBackground(java.awt.Color.BLACK);
        h5.setBackground(java.awt.Color.WHITE);
        h6.setBackground(java.awt.Color.BLACK);
        h7.setBackground(java.awt.Color.WHITE);
        h8.setBackground(java.awt.Color.BLACK);

        //añadir
        this.fondo.add(a1);
        this.fondo.add(a2);
        this.fondo.add(a3);
        this.fondo.add(a4);
        this.fondo.add(a5);
        this.fondo.add(a6);
        this.fondo.add(a7);
        this.fondo.add(a8);
        this.fondo.add(b1);
        this.fondo.add(b2);
        this.fondo.add(b3);
        this.fondo.add(b4);
        this.fondo.add(b5);
        this.fondo.add(b6);
        this.fondo.add(b7);
        this.fondo.add(b8);
        this.fondo.add(c1);
        this.fondo.add(c2);
        this.fondo.add(c3);
        this.fondo.add(c4);
        this.fondo.add(c5);
        this.fondo.add(c6);
        this.fondo.add(c7);
        this.fondo.add(c8);
        this.fondo.add(d1);
        this.fondo.add(d2);
        this.fondo.add(d3);
        this.fondo.add(d4);
        this.fondo.add(d5);
        this.fondo.add(d6);
        this.fondo.add(d7);
        this.fondo.add(d8);
        this.fondo.add(e1);
        this.fondo.add(e2);
        this.fondo.add(e3);
        this.fondo.add(e4);
        this.fondo.add(e5);
        this.fondo.add(e6);
        this.fondo.add(e7);
        this.fondo.add(e8);
        this.fondo.add(f1);
        this.fondo.add(f2);
        this.fondo.add(f3);
        this.fondo.add(f4);
        this.fondo.add(f5);
        this.fondo.add(f6);
        this.fondo.add(f7);
        this.fondo.add(f8);
        this.fondo.add(g1);
        this.fondo.add(g2);
        this.fondo.add(g3);
        this.fondo.add(g4);
        this.fondo.add(g5);
        this.fondo.add(g6);
        this.fondo.add(g7);
        this.fondo.add(g8);
        this.fondo.add(h1);
        this.fondo.add(h2);
        this.fondo.add(h3);
        this.fondo.add(h4);
        this.fondo.add(h5);
        this.fondo.add(h6);
        this.fondo.add(h7);
        this.fondo.add(h8);
    }

    public void Bloquear(){
        a1.setEnabled(false);
        a2.setEnabled(false);
        a3.setEnabled(false);
        a4.setEnabled(false);
        a5.setEnabled(false);
        a6.setEnabled(false);
        a7.setEnabled(false);
        a8.setEnabled(false);
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        c1.setEnabled(false);
        c2.setEnabled(false);
        c3.setEnabled(false);
        c4.setEnabled(false);
        c5.setEnabled(false);
        c6.setEnabled(false);
        c7.setEnabled(false);
        c8.setEnabled(false);
        d1.setEnabled(false);
        d2.setEnabled(false);
        d3.setEnabled(false);
        d4.setEnabled(false);
        d5.setEnabled(false);
        d6.setEnabled(false);
        d7.setEnabled(false);
        d8.setEnabled(false);
        e1.setEnabled(false);
        e2.setEnabled(false);
        e3.setEnabled(false);
        e4.setEnabled(false);
        e5.setEnabled(false);
        e6.setEnabled(false);
        e7.setEnabled(false);
        e8.setEnabled(false);
        f1.setEnabled(false);
        f2.setEnabled(false);
        f3.setEnabled(false);
        f4.setEnabled(false);
        f5.setEnabled(false);
        f6.setEnabled(false);
        f7.setEnabled(false);
        f8.setEnabled(false);
        g1.setEnabled(false);
        g2.setEnabled(false);
        g3.setEnabled(false);
        g4.setEnabled(false);
        g5.setEnabled(false);
        g6.setEnabled(false);
        g7.setEnabled(false);
        g8.setEnabled(false);
        h1.setEnabled(false);
        h2.setEnabled(false);
        h3.setEnabled(false);
        h4.setEnabled(false);
        h5.setEnabled(false);
        h6.setEnabled(false);
        h7.setEnabled(false);
        h8.setEnabled(false);
    }

    public void AsignarEventos(){

   }
    
       
    public void ActivarFichas(float auxDatos[][]) {
        
         
    }


    
}
