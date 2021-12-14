/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos1.personajes;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author jhosd
 */
public class ArmaMago implements Arma{
    JLabel img =new JLabel();
    JLabel l =new JLabel("<html>CETRO MAGICO<br/><br/>Daño: 10<br/>Alcance: 20</html>");
    @Override
    public void añadir(JFrame m) {
        m.add(img);
        m.add(l);
        l.setBounds(70,70,100,100);
        img.setIcon(new ImageIcon("C:\\Users\\jhosd\\OneDrive\\Documentos\\NetBeansProjects\\Personajes\\src\\main\\java\\Imagenes\\Arma_Mago.jpg"));
        img.setBounds(10,70,50,100);
        
    }
    
}
