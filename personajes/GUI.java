/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos1.personajes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    
    GUI(){
        marco=new JFrame("Creación de personajes");
        marco.setVisible(true);
        marco.setSize(800,500);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLayout(null);
        marco.add(seleccion);
        seleccion.addItem("Mago");
        seleccion.addItem("Elfo");
        seleccion.setBounds(10,10,200,20);
        marco.add(cantidad);
        marco.add(l1);
        l1.setBounds(330,10,100,20);
        cantidad.setBounds(400,10,40,20);
        marco.add(crear);
        crear.setBounds(570,10,200,20);
        crear.addActionListener(this);
    }
    
    
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
        switch(seleccion.getSelectedIndex()){
            case 0:
                fabrica=new FabricaMago();
                break;
            case 1:
                System.out.println("Elfo");
                break;
        }
        
        arma=fabrica.CrearArma();
        armadura=fabrica.CrearArmadura();
        personaje=fabrica.CrearPersonaje();
        montura=fabrica.CrearMontura();
        
        arma.añadir(marco);
        armadura.añadir(marco);
        montura.añadir(marco);
    }
    
}
