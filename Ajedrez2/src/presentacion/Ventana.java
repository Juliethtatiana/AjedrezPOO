
package presentacion;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.management.modelmbean.ModelMBean;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


public class Ventana extends JFrame {

    private JPanel fondo;

    private JButton a1[][];


    // extras
   
    private JButton nuevaPartida;
    private JButton salir;
    private JLabel numJugadas;
    private Controlador control;
    private Modelo modelo;
    
    public Ventana(Modelo m) {
        modelo =m;
        setSize(1250, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        InicializarComponentes();
        ActivarBotones();
    } 

    public Controlador getControl() {
        if(control == null){
            control = new Controlador(this);
        }
        return control;
    }

    public Modelo getModelo(){
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
        a1= new JButton [8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                a1[i][j]=new JButton();
            }
        }

        nuevaPartida = new JButton();
        nuevaPartida.setText("Iniciar partida");

        // botones del tablero
    
        nuevaPartida.setBounds(800, 200, 300, 50);

        a1[0][0].setBounds(20, 545, 75, 75);
        a1[1][0].setBounds(20, 470, 75, 75);
        a1[2][0].setBounds(20, 395, 75, 75);
        a1[3][0].setBounds(20, 320, 75, 75);
        a1[4][0].setBounds(20, 245, 75, 75);
        a1[5][0].setBounds(20, 170, 75, 75);
        a1[6][0].setBounds(20, 95 , 75, 75);
        a1[7][0].setBounds(20, 20 , 75, 75);
        a1[0][1].setBounds(95, 545, 75, 75);
        a1[1][1].setBounds(95, 470, 75, 75);
        a1[2][1].setBounds(95, 395, 75, 75);
        a1[3][1].setBounds(95, 320, 75, 75);
        a1[4][1].setBounds(95, 245, 75, 75);
        a1[5][1].setBounds(95, 170, 75, 75);
        a1[6][1].setBounds(95, 95 , 75, 75);
        a1[7][1].setBounds(95, 20 , 75, 75);
        a1[0][2].setBounds(170, 545, 75, 75);
        a1[1][2].setBounds(170, 470, 75, 75);
        a1[2][2].setBounds(170, 395, 75, 75);
        a1[3][2].setBounds(170, 320, 75, 75);
        a1[4][2].setBounds(170, 245, 75, 75);
        a1[5][2].setBounds(170, 170, 75, 75);
        a1[6][2].setBounds(170, 95 , 75, 75);
        a1[7][2].setBounds(170, 20 , 75, 75);
        a1[0][3].setBounds(245, 545, 75, 75);
        a1[1][3].setBounds(245, 470, 75, 75);
        a1[2][3].setBounds(245, 395, 75, 75);
        a1[3][3].setBounds(245, 320, 75, 75);
        a1[4][3].setBounds(245, 245, 75, 75);
        a1[5][3].setBounds(245, 170, 75, 75);
        a1[6][3].setBounds(245, 95 , 75, 75);
        a1[7][3].setBounds(245, 20 , 75, 75);
        a1[0][4].setBounds(320, 545, 75, 75);
        a1[1][4].setBounds(320, 470, 75, 75);
        a1[2][4].setBounds(320, 395, 75, 75);
        a1[3][4].setBounds(320, 320, 75, 75);
        a1[4][4].setBounds(320, 245, 75, 75);
        a1[5][4].setBounds(320, 170, 75, 75);
        a1[6][4].setBounds(320, 95 , 75, 75);
        a1[7][4].setBounds(320, 20 , 75, 75);
        a1[0][5].setBounds(395, 545, 75, 75);
        a1[1][5].setBounds(395, 470, 75, 75);
        a1[2][5].setBounds(395, 395, 75, 75);
        a1[3][5].setBounds(395, 320, 75, 75);
        a1[4][5].setBounds(395, 245, 75, 75);
        a1[5][5].setBounds(395, 170, 75, 75);
        a1[6][5].setBounds(395, 95 , 75, 75);
        a1[7][5].setBounds(395, 20 , 75, 75);
        a1[0][6].setBounds(470, 545, 75, 75);
        a1[1][6].setBounds(470, 470, 75, 75);
        a1[2][6].setBounds(470, 395, 75, 75);
        a1[3][6].setBounds(470, 320, 75, 75);
        a1[4][6].setBounds(470, 245, 75, 75);
        a1[5][6].setBounds(470, 170, 75, 75);
        a1[6][6].setBounds(470, 95 , 75, 75);
        a1[7][6].setBounds(470, 20 , 75, 75);
        a1[0][7].setBounds(545, 545, 75, 75);
        a1[1][7].setBounds(545, 470, 75, 75);
        a1[2][7].setBounds(545, 395, 75, 75);
        a1[3][7].setBounds(545, 320, 75, 75);
        a1[4][7].setBounds(545, 245, 75, 75);
        a1[5][7].setBounds(545, 170, 75, 75);
        a1[6][7].setBounds(545, 95 , 75, 75);
        a1[7][7].setBounds(545, 20 , 75, 75);
        

        // colores

        nuevaPartida.setBackground(java.awt.Color.GRAY);
        Font fuente = new Font ("Calibri", 3, 24);
        nuevaPartida.setFont(fuente);
        /*
        a1[0][0].setBackground(java.awt.Color.BLACK);
        a1[1][0].setBackground(java.awt.Color.WHITE);
        a1[2][0].setBackground(java.awt.Color.BLACK);
        a1[3][0].setBackground(java.awt.Color.WHITE);
        a1[4][0].setBackground(java.awt.Color.BLACK);
        a1[5][0].setBackground(java.awt.Color.WHITE);
        a1[6][0].setBackground(java.awt.Color.BLACK);
        a1[7][0].setBackground(java.awt.Color.WHITE);

        a1[0][1].setBackground(java.awt.Color.WHITE);
        a1[1][1].setBackground(java.awt.Color.BLACK);
        a1[2][1].setBackground(java.awt.Color.WHITE);
        a1[3][1].setBackground(java.awt.Color.BLACK);
        a1[4][1].setBackground(java.awt.Color.WHITE);
        a1[5][1].setBackground(java.awt.Color.BLACK);
        a1[6][1].setBackground(java.awt.Color.WHITE);
        a1[7][1].setBackground(java.awt.Color.BLACK);

        a1[0][2].setBackground(java.awt.Color.BLACK);
        a1[1][2].setBackground(java.awt.Color.WHITE);
        a1[2][2].setBackground(java.awt.Color.BLACK);
        a1[3][2].setBackground(java.awt.Color.WHITE);
        a1[4][2].setBackground(java.awt.Color.BLACK);
        a1[5][2].setBackground(java.awt.Color.WHITE);
        a1[6][2].setBackground(java.awt.Color.BLACK);
        a1[7][2].setBackground(java.awt.Color.WHITE);
        
        a1[0][3].setBackground(java.awt.Color.WHITE);
        a1[1][3].setBackground(java.awt.Color.BLACK);
        a1[2][3].setBackground(java.awt.Color.WHITE);
        a1[3][3].setBackground(java.awt.Color.BLACK);
        a1[4][3].setBackground(java.awt.Color.WHITE);
        a1[5][3].setBackground(java.awt.Color.BLACK);
        a1[6][3].setBackground(java.awt.Color.WHITE);
        a1[7][3].setBackground(java.awt.Color.BLACK);

        a1[0][4].setBackground(java.awt.Color.BLACK);
        a1[1][4].setBackground(java.awt.Color.WHITE);
        a1[2][4].setBackground(java.awt.Color.BLACK);
        a1[3][4].setBackground(java.awt.Color.WHITE);
        a1[4][4].setBackground(java.awt.Color.BLACK);
        a1[5][4].setBackground(java.awt.Color.WHITE);
        a1[6][4].setBackground(java.awt.Color.BLACK);
        a1[7][4].setBackground(java.awt.Color.WHITE);

        a1[0][5].setBackground(java.awt.Color.WHITE);
        a1[1][5].setBackground(java.awt.Color.BLACK);
        a1[2][5].setBackground(java.awt.Color.WHITE);
        a1[3][5].setBackground(java.awt.Color.BLACK);
        a1[4][5].setBackground(java.awt.Color.WHITE);
        a1[5][5].setBackground(java.awt.Color.BLACK);
        a1[6][5].setBackground(java.awt.Color.WHITE);
        a1[7][5].setBackground(java.awt.Color.BLACK);

        a1[0][6].setBackground(java.awt.Color.BLACK);
        a1[1][6].setBackground(java.awt.Color.WHITE);
        a1[2][6].setBackground(java.awt.Color.BLACK);
        a1[3][6].setBackground(java.awt.Color.WHITE);
        a1[4][6].setBackground(java.awt.Color.BLACK);
        a1[5][6].setBackground(java.awt.Color.WHITE);
        a1[6][6].setBackground(java.awt.Color.BLACK);
        a1[7][6].setBackground(java.awt.Color.WHITE);

        a1[0][7].setBackground(java.awt.Color.WHITE);
        a1[1][7].setBackground(java.awt.Color.BLACK);
        a1[2][7].setBackground(java.awt.Color.WHITE);
        a1[3][7].setBackground(java.awt.Color.BLACK);
        a1[4][7].setBackground(java.awt.Color.WHITE);
        a1[5][7].setBackground(java.awt.Color.BLACK);
        a1[6][7].setBackground(java.awt.Color.WHITE);
        a1[7][7].setBackground(java.awt.Color.BLACK);
        ¨*/
        //añadir

        this.add(nuevaPartida);

        this.fondo.add(a1[0][0]);
        this.fondo.add(a1[1][0]);
        this.fondo.add(a1[2][0]);
        this.fondo.add(a1[3][0]);
        this.fondo.add(a1[4][0]);
        this.fondo.add(a1[5][0]);
        this.fondo.add(a1[6][0]);
        this.fondo.add(a1[7][0]);
        this.fondo.add(a1[0][1]);
        this.fondo.add(a1[1][1]);
        this.fondo.add(a1[2][1]);
        this.fondo.add(a1[3][1]);
        this.fondo.add(a1[4][1]);
        this.fondo.add(a1[5][1]);
        this.fondo.add(a1[6][1]);
        this.fondo.add(a1[7][1]);
        this.fondo.add(a1[0][2]);
        this.fondo.add(a1[1][2]);
        this.fondo.add(a1[2][2]);
        this.fondo.add(a1[3][2]);
        this.fondo.add(a1[4][2]);
        this.fondo.add(a1[5][2]);
        this.fondo.add(a1[6][2]);
        this.fondo.add(a1[7][2]);
        this.fondo.add(a1[0][3]);
        this.fondo.add(a1[1][3]);
        this.fondo.add(a1[2][3]);
        this.fondo.add(a1[3][3]);
        this.fondo.add(a1[4][3]);
        this.fondo.add(a1[5][3]);
        this.fondo.add(a1[6][3]);
        this.fondo.add(a1[7][3]);
        this.fondo.add(a1[0][4]);
        this.fondo.add(a1[1][4]);
        this.fondo.add(a1[2][4]);
        this.fondo.add(a1[3][4]);
        this.fondo.add(a1[4][4]);
        this.fondo.add(a1[5][4]);
        this.fondo.add(a1[6][4]);
        this.fondo.add(a1[7][4]);
        this.fondo.add(a1[0][5]);
        this.fondo.add(a1[1][5]);
        this.fondo.add(a1[2][5]);
        this.fondo.add(a1[3][5]);
        this.fondo.add(a1[4][5]);
        this.fondo.add(a1[5][5]);
        this.fondo.add(a1[6][5]);
        this.fondo.add(a1[7][5]);
        this.fondo.add(a1[0][6]);
        this.fondo.add(a1[1][6]);
        this.fondo.add(a1[2][6]);
        this.fondo.add(a1[3][6]);
        this.fondo.add(a1[4][6]);
        this.fondo.add(a1[5][6]);
        this.fondo.add(a1[6][6]);
        this.fondo.add(a1[7][6]);
        this.fondo.add(a1[0][7]);
        this.fondo.add(a1[1][7]);
        this.fondo.add(a1[2][7]);
        this.fondo.add(a1[3][7]);
        this.fondo.add(a1[4][7]);
        this.fondo.add(a1[5][7]);
        this.fondo.add(a1[6][7]);
        this.fondo.add(a1[7][7]);
    }

    public void Bloquear(){

        a1[0][0].setEnabled(false);
        a1[1][0].setEnabled(false);
        a1[2][0].setEnabled(false);
        a1[3][0].setEnabled(false);
        a1[4][0].setEnabled(false);
        a1[5][0].setEnabled(false);
        a1[6][0].setEnabled(false);
        a1[7][0].setEnabled(false);
        a1[0][1].setEnabled(false);
        a1[1][1].setEnabled(false);
        a1[2][1].setEnabled(false);
        a1[3][1].setEnabled(false);
        a1[4][1].setEnabled(false);
        a1[5][1].setEnabled(false);
        a1[6][1].setEnabled(false);
        a1[7][1].setEnabled(false);
        a1[0][2].setEnabled(false);
        a1[1][2].setEnabled(false);
        a1[2][2].setEnabled(false);
        a1[3][2].setEnabled(false);
        a1[4][2].setEnabled(false);
        a1[5][2].setEnabled(false);
        a1[6][2].setEnabled(false);
        a1[7][2].setEnabled(false);
        a1[0][3].setEnabled(false);
        a1[1][3].setEnabled(false);
        a1[2][3].setEnabled(false);
        a1[3][3].setEnabled(false);
        a1[4][3].setEnabled(false);
        a1[5][3].setEnabled(false);
        a1[6][3].setEnabled(false);
        a1[7][3].setEnabled(false);
        a1[0][4].setEnabled(false);
        a1[1][4].setEnabled(false);
        a1[2][4].setEnabled(false);
        a1[3][4].setEnabled(false);
        a1[4][4].setEnabled(false);
        a1[5][4].setEnabled(false);
        a1[6][4].setEnabled(false);
        a1[7][4].setEnabled(false);
        a1[0][5].setEnabled(false);
        a1[1][5].setEnabled(false);
        a1[2][5].setEnabled(false);
        a1[3][5].setEnabled(false);
        a1[4][5].setEnabled(false);
        a1[5][5].setEnabled(false);
        a1[6][5].setEnabled(false);
        a1[7][5].setEnabled(false);
        a1[0][6].setEnabled(false);
        a1[1][6].setEnabled(false);
        a1[2][6].setEnabled(false);
        a1[3][6].setEnabled(false);
        a1[4][6].setEnabled(false);
        a1[5][6].setEnabled(false);
        a1[6][6].setEnabled(false);
        a1[7][6].setEnabled(false);
        a1[0][7].setEnabled(false);
        a1[1][7].setEnabled(false);
        a1[2][7].setEnabled(false);
        a1[3][7].setEnabled(false);
        a1[4][7].setEnabled(false);
        a1[5][7].setEnabled(false);
        a1[6][7].setEnabled(false);
        a1[7][7].setEnabled(false);
     
    }

    public void Desbloquear(int casillas [][]) {
        int aux1, aux2;
        for (int i = 0; i < casillas.length; i++) {
            
            aux1=casillas[i][0];
            aux2=casillas[i][1];
            a1[aux1][aux2].setEnabled(true);
            
        }
    }



    public void PonerFichas(){
        int aux1, aux2;
        for (int i = 0; i < this.a1.length; i++) {
            ImageIcon icono = new ImageIcon("../../img/Bpeon");
            a1[2][i].setIcon(icono);
            
        }
        for (int i = 0; i < this.a1.length; i++) {
            ImageIcon icono = new ImageIcon("Npeon.jpg");
            a1[7][i].setIcon(icono);
            //this.add( a1[7][i]);
        }
   }
    
       
   public void ActivarBotones(){
        this.nuevaPartida.addActionListener(getControl());
   }

    public void ActivarFichas(float auxDatos[][]) {

         
    }


    
}