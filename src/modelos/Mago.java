/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author jhosd
 */
public class Mago implements Personaje{
    @Override
    public void añadir(JLabel []img, int cantidad, JLabel img1, JLabel l) {
        l.setText("<html>MAGO<br/><br/>Vida: 15<br/> Resistencia: 10</html>");
        img1.setIcon(new ImageIcon("src/Imagenes/Mago.png"));
        for(int i=0; i<cantidad; i++){
            img[i].setIcon(new ImageIcon("src/Imagenes/Mago.png"));
        }
    }
}
