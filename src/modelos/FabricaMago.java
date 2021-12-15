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
public class FabricaMago implements FabricaAbstracta{

    @Override
    public Arma CrearArma() {
        return new ArmaMago();
    }

    @Override
    public Armadura CrearArmadura() {
        return new ArmaduraMago();
    }

    @Override
    public Personaje CrearPersonaje() {
        return new Mago();
    }

    @Override
    public Montura CrearMontura() {
        return new MonturaMago();
    }
    
}
