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
public class MonturaOrco implements Montura{
    @Override
    public void añadir(JLabel img, JLabel l) {
        l.setText("<html>CERBERO<br/><br/>VIDA: 30<br/>VELOCIDAD: 20</html>");
        img.setIcon(new ImageIcon("src/Imagenes/Montura_Orco.png"));
    }
}
