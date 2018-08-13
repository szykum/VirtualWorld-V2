package VirtualWorld;
import java.io.Serializable;

public class Wspolrzedne implements Serializable{
    public int x;
    public int y;
    
    static Wspolrzedne zeroCoords(){
        return new Wspolrzedne(0,0);
    }
    public Wspolrzedne(int x, int y){
        this.x=x;
        this.y=y;
    }
    public boolean Rowne(Wspolrzedne c){
        if(this.x==c.x && this.y==c.y)return true;
        return false;
    }
}
