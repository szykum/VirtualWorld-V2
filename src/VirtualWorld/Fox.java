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
public class Fox extends Animal{

    public Fox(Coords coords, World world) {
        super(coords, world);
        this.name="Fox";
        this.initiative=7;
        this.strength=3;
    }
    
    @Override
    public void action()
    {
        Coords newCoords;
        int counter=20;
        do{
            if(counter==0)return;
            newCoords = world.randomAround(location, 1);
            counter--;
        } while(!world.isEmpty(newCoords) && world.findObject(newCoords).getStrength()>this.strength);
        move(newCoords);
    }
    
}
