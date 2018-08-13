
package VirtualWorld;
import java.util.Random;

public class Antylopa extends Zwierze{                                //antylopa
    public Antylopa(Wspolrzedne coords, Swiat world){
        super(coords, world);
        this.nazwa="Antylopa";
        this.inicjatywa=4;
        this.sila=4;
    }
    
    @Override
    public void akcja(){                                              //poruszanie o 2 pola
        ruch(world.move(cords,2));
    }
    
    @Override
    public boolean specjalnaKolizja(Organizm other){                   //50% szans na ucieczke
        Random random = new Random();
        if(random.nextBoolean()){
            Wspolrzedne nowe = world.moveOnEmpty(cords, 1);
            if(nowe==this.cords)return true;
            this.ruch(nowe);
            return false;
        }
        return true;
    }
    
}
