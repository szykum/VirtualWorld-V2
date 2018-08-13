package VirtualWorld;

public class WJagody  extends Roslina{
    
    public WJagody(Wspolrzedne coords, Swiat world) {
        super(coords, world);
        this.nazwa="Jagody";
        this.sila=99;
    }
    
    @Override
    public boolean specjalnaKolizja(Organizm org){      //zabija i znika
        org.zabij();
        this.zabij();
        return false;
    }
    
}
