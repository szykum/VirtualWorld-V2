package VirtualWorld;
import java.util.Random;

public class Roslina extends Organizm{
    public Roslina(Wspolrzedne coords, Swiat world){
        super(coords,world);
        this.sila=0;
        this.inicjatywa=0;
    }
    
    @Override
    public void rozmnazanie(){                                          //mechanizm rozmnazania roslin
        Random random = new Random();
        Wspolrzedne newCoords = world.moveOnEmpty(cords, 1);
        if(newCoords.Rowne(cords))return;
        if(random.nextInt(40)==0){
            world.addOrganism(newCoords, nazwa);
        }
    }
    
    public void akcja(){
        rozmnazanie();
    }
    
}
