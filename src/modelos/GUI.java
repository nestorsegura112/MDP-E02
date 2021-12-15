/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author jhosd
 */
public class GUI extends JFrame implements ActionListener{
    
    JFrame marco;
    JButton crear=new JButton("Crear");
    JComboBox seleccion=new JComboBox();
    SpinnerModel sm = new SpinnerNumberModel(1, 1, 10, 1);
    JSpinner cantidad=new JSpinner(sm);
    JLabel l1=new JLabel("Cantidad:");
    
    JLabel img1 =new JLabel();
    JLabel d1 =new JLabel();
    
    JLabel img2 =new JLabel();
    JLabel d2 =new JLabel();
            
    JLabel img3 =new JLabel();
    JLabel d3 =new JLabel();
    
    JLabel img4 =new JLabel();
    JLabel d4 =new JLabel(); 
    
    GUI(){
        marco=new JFrame("Creación de personajes");
        marco.setVisible(true);
        marco.setSize(900,650);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLayout(null);
        marco.add(seleccion);
        seleccion.addItem("Mago");
        seleccion.addItem("Elfo");
        seleccion.addItem("Orco");
        seleccion.setBounds(10,10,200,20);
        marco.add(cantidad);
        marco.add(l1);
        
        
        marco.add(img1);
        marco.add(d1);
        marco.add(img2);
        marco.add(d2);
        marco.add(img3);
        marco.add(d3);
        marco.add(img4);
        marco.add(d4);
        
       
        d1.setBounds(170,70,100,100);
        img1.setBounds(10,70,150,100);
        img1.setHorizontalAlignment(JLabel.CENTER);
        d2.setBounds(170,200,100,100);
        img2.setBounds(10,200,150,100);
        img2.setHorizontalAlignment(JLabel.CENTER);
        d3.setBounds(170,330,100,100);
        img3.setBounds(10,330,150,100);
        img3.setHorizontalAlignment(JLabel.CENTER);
        d4.setBounds(170,460,100,100);
        img4.setBounds(10,460,150,100);
        img4.setHorizontalAlignment(JLabel.CENTER);
        
        l1.setBounds(330,10,100,20);
        cantidad.setBounds(400,10,40,20);
        marco.add(crear);
        crear.setBounds(570,10,200,20);
        crear.addActionListener(this);
        
        
        for(int i = 0; i < 10 ; i++){
            img[i]=new JLabel();
            
        }
    }
    JLabel []img=new JLabel[10];
    
    public JFrame getMarco(){
        return marco;
    }
    
    public int getCantidad(){
        return (int) cantidad.getValue();
    } 
    
    
    FabricaAbstracta fabrica;
    Arma arma;
    Armadura armadura;
    Personaje personaje;
    Montura montura;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        int k=0;
        int a=(int)(Math.ceil(((int) cantidad.getValue()/2.0)));
        System.out.println(""+a);
        
        for(int i = 0; i < 2 ; i++){
            for(int j = 0; j < a; j++){
                if(k<(int) cantidad.getValue()){
                    marco.add(img[k]);
                    img[k].setBounds(300+j*110,150+i*180,100,100);
                    img[k].setHorizontalAlignment(JLabel.CENTER);
                    k++;
                }
            }
        }
        for(int i = 0; i < 10 ; i++){
            img[i].setIcon(null);
        }
        switch(seleccion.getSelectedIndex()){
            case 0:
                fabrica=new FabricaMago();
                break;
            case 1:
                fabrica = new FabricaElfo();
                break;
            case 2:
                fabrica = new FabricaOrco();
                break;
        }
        
        arma=fabrica.CrearArma();
        armadura=fabrica.CrearArmadura();
        personaje=fabrica.CrearPersonaje();
        montura=fabrica.CrearMontura();
        
        arma.añadir(img2, d2);
        armadura.añadir(img3, d3);
        montura.añadir(img4, d4);
        
        personaje.añadir(img, (int)cantidad.getValue(), img1, d1);
        
    }
    
}
