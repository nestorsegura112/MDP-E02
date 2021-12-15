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
public class FabricaElfo implements FabricaAbstracta{

    @Override
    public Arma CrearArma() {
        return new ArmaElfo();
    }

    @Override
    public Armadura CrearArmadura() {
        return new ArmaduraElfo();
    }

    @Override
    public Personaje CrearPersonaje() {
        return new Elfo();
    }

    @Override
    public Montura CrearMontura() {
        return new MonturaElfo();
    }
    
}
