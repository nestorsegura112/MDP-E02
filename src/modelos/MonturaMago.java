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
public class MonturaMago implements Montura{
    public void añadir(JLabel img, JLabel l) {
        l.setText("<html>CABALLO INFERNAL<br/><br/>VIDA: 20<br/>VELOCIDAD: 10</html>");
        img.setIcon(new ImageIcon("src/Imagenes/Montura_Mago.png"));
    }
}
