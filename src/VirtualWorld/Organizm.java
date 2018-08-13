package VirtualWorld;
import java.io.Serializable;

public class Organizm implements Serializable{
    protected String nazwa;
    protected int sila;
    protected int inicjatywa;
    protected int wiek;
    protected boolean sprRuch=true;
    protected Wspolrzedne cords; 
    protected Swiat world;    
    boolean zabity=false;
    
    public Organizm(Wspolrzedne coords, Swiat world){
        this.wiek=0;
        this.cords=coords;
        this.world=world;
    }
       
    public void zabij(){
       zabity=true;
    }
        
    public boolean isKilled(){
        return zabity;
    }
    
    public int wSile(){
        return this.sila;
    }
    
    public void uSile(int s) {
        this.sila=s;
    }
    
    public void akcja(){
        
    };
    
    public boolean specjalnaKolizja(Organizm org){
        return true;
    }
    
    public int wWiek(){
        return this.wiek;
    }
    
    public void kolizja(Organizm Atk, Organizm Obr){                //wywoływanie kolizji
        if(Atk.getName()==Obr.getName()){                           //dla organizmow, rozmnazanie
            this.rozmnazanie();
            Atk.sprRuch=false;
            return;
        }
        
        if(!this.specjalnaKolizja(Obr))return;                      //sprawdzanie specjalnych kolizji
        if(!Obr.specjalnaKolizja(this))return;
        
        if(Atk.wSile()>=Obr.wSile()){                               //zabijanie
            Obr.zabij();
            return;
        }
        Atk.zabij();
        return;
    }
    
    public String getName(){
        return this.nazwa;
    }
    
    public int wInicj(){
        return this.inicjatywa;
    }
    
    public void uWiek(int w){
        this.wiek=w;
    }
    
    public Wspolrzedne getLocation(){
        return this.cords;
    }

    protected void rozmnazanie() {
    }
    
    }
