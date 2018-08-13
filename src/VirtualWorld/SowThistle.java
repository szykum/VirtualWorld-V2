/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualWorld;

/**
 *
 * @author Olek
 */
public class SowThistle  extends Plant{
    
    public SowThistle(Coords coords, World world) {
        super(coords, world);
        this.name="Sow Thistle";
    }
    
    @Override
    public void action()
    {
        multiply();
        multiply();
        multiply();
    }
    
    
}
