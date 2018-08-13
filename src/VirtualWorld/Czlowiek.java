
package VirtualWorld;

public class Czlowiek extends Zwierze{
    
    private int superMocLicz;
    private boolean superMoc;
    public Czlowiek(Wspolrzedne coords, Swiat world) {
        super(coords, world);
        this.superMoc = false;
        this.superMocLicz = 0;
        this.nazwa="Czlowiek";
        this.inicjatywa=4;
        this.sila=5;

    }
    
    public void akcja(Wspolrzedne delta){                           //mechanizm supermocy gracza
        if(delta.Rowne(new Wspolrzedne(0,0))){                      //tarcza alzura - odpiera ataki 
            if(superMocLicz==0){
                superMoc=true;
                superMocLicz++;
            }
        }
        if(superMocLicz>0){
            if(superMocLicz==10)superMocLicz=0;
            if(superMocLicz==5)superMoc=false;
            superMocLicz++;
        }
        ruch(new Wspolrzedne(cords.x+delta.x,cords.y+delta.y));
    }
    
    @Override
    public boolean specjalnaKolizja(Organizm org){
        if(superMoc){                                               //supermoc
            org.cords=world.moveOnEmpty(cords, 1);
            org.sprRuch=false;
            return false;
        }
        return true;
    }
    
    
}
