/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author jhosd
 */
public class ArmaMago implements Arma{
    @Override
    public void añadir(JLabel img, JLabel l) {
        l.setText("<html>CETRO MAGICO<br/><br/>Daño: 10<br/>Alcance: 20</html>");
        img.setIcon(new ImageIcon("src/Imagenes/Arma_Mago.png"));
    }
    
}
