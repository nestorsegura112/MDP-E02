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
public class ArmaduraOrco implements Armadura{
    @Override
    public void añadir(JLabel img, JLabel l) {
        l.setText("<html>ARMADURA DE ACERO<br/><br/>DUREZA: 5<br/>PESO: 10</html>");
        img.setIcon(new ImageIcon("src/Imagenes/Armadura_Orco.png"));
    }
}
