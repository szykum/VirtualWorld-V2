
package VirtualWorld;
import java.util.ArrayList;
import DisplayPackage.Plansza;
import java.util.Random;

public class Swiat {
    
    Wspolrzedne size;
    protected ArrayList <ArrayList <Organizm>> organisms;               //listy w ktorych sa przechowywane organizmy
    protected Plansza mainFrame;                                        //tworzymy plansze
    
    public Swiat(int x, int y){
        size=new Wspolrzedne(x,y);
        organisms = new ArrayList <>();
        for(int i=0;i<10;i++) organisms.add(new ArrayList <>());        //tworzymy listy wg inicjatyw
        
    }
    
    public Organizm addOrganism(Wspolrzedne coords, String name){       //dodawanie organizmow do list wg inicjatyw
        if(!isEmpty(coords))return null;
        Organizm newOrganism;
        if("Antylopa".equals(name))newOrganism = new Antylopa(coords,this);
        else if ("Lis".equals(name))newOrganism = new Lis(coords,this);
        else if ("Owca".equals(name))newOrganism = new Owca(coords,this);
        else if ("Zolw".equals(name))newOrganism = new Zolw(coords,this);
        else if ("Wilk".equals(name))newOrganism = new Wilk(coords,this);
        else if ("Czlowiek".equals(name))newOrganism = new Czlowiek(coords,this);
        else if ("Trawa".equals(name))newOrganism = new Trawa(coords,this);
        else if ("Mlecz".equals(name))newOrganism = new Mlecz(coords,this);
        else if ("Guarana".equals(name))newOrganism = new Guarana(coords,this);
        else if ("Jagody".equals(name))newOrganism = new WJagody(coords,this);
        else return null;
        organisms.get(newOrganism.wInicj()).add(newOrganism);
        return newOrganism;
    }
    
    public boolean isEmpty(Wspolrzedne coords){
        for(ArrayList <Organizm> organism : organisms){
            for(Organizm actual : organism){
                if(actual.cords.Rowne(coords))return false;
            };
        }
        return true;
    }
    
    public boolean krawedzie(Wspolrzedne coords){                   //sprawdzanie czy nie wykraczamy poza krawedzie mapy
        if(coords.x >= 0 && coords.x <size.x && coords.y >=0 && coords.y<size.y)return true;
        return false;
    }
    
    public Organizm szukajOrg(Wspolrzedne coords){
        for(ArrayList <Organizm> organism : organisms){
            for(Organizm actual : organism){
                if(actual.cords.Rowne(coords))return actual;
            };
        }
        return null;
    }
    
    public Wspolrzedne move(Wspolrzedne center, int range){         //poruszanie zwierzat
        Random random = new Random();
        Wspolrzedne newCoords = new Wspolrzedne(center.x+(random.nextInt(3)-1)*range,center.y+(random.nextInt(3)-1)*range);
        while(!krawedzie(newCoords) || newCoords.equals(center)){
            newCoords = new Wspolrzedne(center.x+(random.nextInt(3)-1)*range,center.y+(random.nextInt(3)-1)*range);
        }
        return newCoords;
    }
    
    public Wspolrzedne moveOnEmpty(Wspolrzedne center, int range){  //poruszanie sie na wolne miejsce w poblizu
        int triesCounter=50;
        Random random = new Random();
        Wspolrzedne newCoords = new Wspolrzedne(center.x+(random.nextInt(3)-1)*range,center.y+(random.nextInt(3)-1)*range);
        while(!krawedzie(newCoords) || newCoords.equals(center) || !isEmpty(newCoords)){
            if(triesCounter==0)return center;
            newCoords = new Wspolrzedne(center.x+(random.nextInt(3)-1)*range,center.y+(random.nextInt(3)-1)*range);
            triesCounter--;
        }
        return newCoords;
    }
    
}
