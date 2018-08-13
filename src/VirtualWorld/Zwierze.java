package VirtualWorld;

public class Zwierze extends Organizm{
    public Zwierze(Wspolrzedne coords, Swiat world) {
        super(coords, world);
    }
    
    @Override
    protected void rozmnazanie(){                               //rozmnazanie zwierzat
        Wspolrzedne newLoc = world.moveOnEmpty(cords, 1);
        if(newLoc.Rowne(this.cords))return;
        world.addOrganism(newLoc, this.getName());
    }
            
    
    @Override
    public void akcja()                                         //wywolanie ruch zwierzat
    {
        this.sprRuch=true;
        ruch(world.move(cords,1));
    }
     
    protected void ruch (Wspolrzedne newCoords)
    {
        if(newCoords.Rowne(cords))return;
        if(!world.krawedzie(newCoords))return;
        if(world.isEmpty(newCoords))
        {
            cords=newCoords;
            return;
        }
        Organizm enemy = world.szukajOrg(newCoords);
        
        if(!enemy.isKilled())kolizja(this, enemy);
        
        if(!this.zabity && this.sprRuch)cords=newCoords;
    }
    
}
