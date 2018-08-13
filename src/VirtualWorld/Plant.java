/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualWorld;

import java.util.Random;

/**
 *
 * @author Olek
 */
public class Plant extends Organism{
    
    public Plant(Coords coords, World world)
    {
        super(coords,world);
        this.strength=0;
        this.initiative=0;
    }
    
    @Override
    public void multiply()
    {
        Random random = new Random();
        Coords newCoords = world.freeRandomAround(location, 1);
        if(newCoords.isEqual(location))return;
        if(random.nextInt(10)==0)
        {
            world.addOrganism(newCoords, name);
        }
    }
    
    public void action()
    {
        multiply();
    }
    
}
