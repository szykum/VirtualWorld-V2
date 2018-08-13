/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualWorld;

import java.io.Serializable;

/**
 *
 * @author Olek
 */
public class Coords implements Serializable{
    
    public int x;
    
    public int y;
    
    static Coords zeroCoords()
    {
        return new Coords(0,0);
    }
    
    public Coords(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    
    public boolean isEqual(Coords c)
    {
        if(this.x==c.x && this.y==c.y)return true;
        return false;
    }
}
