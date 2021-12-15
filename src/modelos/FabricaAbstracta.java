/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author jhosd
 */
public interface FabricaAbstracta {
    
    public Arma CrearArma();
    
    public Armadura CrearArmadura();

    public Personaje CrearPersonaje();
    
    public Montura CrearMontura();
}
