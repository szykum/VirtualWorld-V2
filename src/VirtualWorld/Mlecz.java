package VirtualWorld;

public class Mlecz  extends Roslina{
    public Mlecz(Wspolrzedne coords, Swiat world) {
        super(coords, world);
        this.nazwa="Mlecz";
    }
    
    @Override
    public void akcja(){                                //3 proby rozprzestrzeniania
        rozmnazanie();                                  //podczas jednej tury
        rozmnazanie();
        rozmnazanie();
    }  
}
