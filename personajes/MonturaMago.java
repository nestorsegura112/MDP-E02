/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos1.personajes;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author jhosd
 */
public class MonturaMago implements Montura{
    
    JLabel img =new JLabel();
    JLabel l =new JLabel("<html>DRAGON<br/><br/>VIDA: 20<br/>VELOCIDAD: 10</html>");
    @Override
    public void añadir(JFrame m) {
        m.add(img);
        m.add(l);
        l.setBounds(170,330,100,100);
        img.setIcon(new ImageIcon("C:\\Users\\jhosd\\OneDrive\\Documentos\\NetBeansProjects\\Personajes\\src\\main\\java\\Imagenes\\Montura_Mago.jpg"));
        img.setBounds(10,330,200,100);
        
    }
}
