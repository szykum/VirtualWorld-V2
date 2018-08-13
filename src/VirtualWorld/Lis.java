
package VirtualWorld;

public class Lis extends Zwierze{
    public Lis(Wspolrzedne coords, Swiat world){
        super(coords, world);
        this.nazwa="Lis";
        this.inicjatywa=7;
        this.sila=3;
    }
    
    @Override
    public void akcja(){
        Wspolrzedne newCoords;
        int counter=20;
        do{                                                     //lis nie wchodzi na organizmy
            if(counter==0)return;                               //silniejsze od siebie
            newCoords = world.move(cords, 1);
            counter--;
        } while(!world.isEmpty(newCoords) && world.szukajOrg(newCoords).wSile()>this.sila);
        ruch(newCoords);
    }
    
}
