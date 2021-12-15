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
public class ArmaduraMago implements Armadura{
    @Override
    public void añadir(JLabel img, JLabel l) {
        l.setText("<html>ARMADURA MAGICA<br/><br/>DUREZA: 8<br/>PESO: 8</html>");
        img.setIcon(new ImageIcon("src/Imagenes/Armadura_Mago.png"));
       
    }
}
