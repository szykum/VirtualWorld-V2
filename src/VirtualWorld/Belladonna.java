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
public class Belladonna  extends Plant{
    
    public Belladonna(Coords coords, World world) {
        super(coords, world);
        this.name="Belladonna";
        this.strength=99;
    }
    
    @Override
    public boolean specialCollision(Organism other)
    {
        other.kill();
        this.kill();
        return false;
    }
    
}
