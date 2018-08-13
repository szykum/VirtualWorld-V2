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
public class Antelope extends Animal{

    public Antelope(Coords coords, World world) {
        super(coords, world);
        this.name="Antelope";
        this.initiative=4;
        this.strength=4;
    }
    
    @Override
    public void action()
    {
        move(world.randomAround(location,2));
    }
    
    @Override
    public boolean specialCollision(Organism other)
    {
        Random random = new Random();
        if(random.nextBoolean())
        {
            Coords newLocation = world.freeRandomAround(location, 1);
            if(newLocation==this.location)return true;
            this.move(newLocation);
            return false;
        }
        return true;
    }
    
}
