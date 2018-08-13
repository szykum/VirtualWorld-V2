
package VirtualWorld;


public class Guarana  extends Roslina{
    
    public Guarana(Wspolrzedne coords, Swiat world){
        super(coords, world);
        this.nazwa="Guarana";
    }
    
    @Override
    public boolean specjalnaKolizja(Organizm org){
        org.uSile(org.wSile()+3);                                   //zwiekszanie sily o 3 po zjedzeniu
        return true;
    }
    
}
