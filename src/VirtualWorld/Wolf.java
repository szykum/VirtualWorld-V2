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
public class Wolf extends Animal{

    public Wolf(Coords coords, World world) {
        super(coords, world);
        this.name="Wolf";
        this.initiative=5;
        this.strength=9;
    }
    
}
