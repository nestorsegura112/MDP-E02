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
public class FabricaOrco implements FabricaAbstracta{

    @Override
    public Arma CrearArma() {
        return new ArmaOrco();
    }

    @Override
    public Armadura CrearArmadura() {
        return new ArmaduraOrco();
    }

    @Override
    public Personaje CrearPersonaje() {
        return new Orco();
    }

    @Override
    public Montura CrearMontura() {
        return new MonturaOrco();
    }
    
}
