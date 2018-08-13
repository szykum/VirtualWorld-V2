package VirtualWorld;
import java.util.Random;

public class Zolw extends Zwierze{
    public Zolw(Wspolrzedne coords, Swiat world) {
        super(coords, world);
        this.nazwa="Zolw";
        this.inicjatywa=1;
        this.sila=2;
    }
    
    @Override 
    public void akcja(){                    //prawdopodobienstwo na ruch = 25%
        Random random = new Random();
        if(random.nextInt(4)==0)ruch(world.move(cords, 1));
        else return;
        
    }
    
    @Override
    public boolean specjalnaKolizja(Organizm org){  //odpieranie atakow o sile mniejszej jak 5
        if(org.wSile()<5){
            org.sprRuch=false;
            this.sprRuch=false;
            return false;
        }
        return true;       
        }
    }
