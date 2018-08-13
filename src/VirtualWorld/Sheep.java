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
public class Sheep extends Animal{

    public Sheep(Coords coords, World world) {
        super(coords, world);
        this.name="Sheep";
        this.initiative=4;
        this.strength=4;
    }
    
}
