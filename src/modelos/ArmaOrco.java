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
public class ArmaOrco implements Arma{
    @Override
    public void añadir(JLabel img, JLabel l) {
        l.setText("<html>HACHA DE MUERTO ANTIGUO<br/><br/>Daño: 7<br/>Alcance: 10</html>");
        img.setIcon(new ImageIcon("src/Imagenes/Arma_Orco.png")); 
    }
    
}
