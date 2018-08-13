
package DisplayPackage;
import VirtualWorld.BladRozmiaru;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import VirtualWorld.Wspolrzedne;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ObslugaKlawiszy implements KeyListener{
    @Override
    public void keyPressed(KeyEvent event){
        Plansza father=(Plansza)event.getSource();                        //obsluga klawszy w grze
////////////////////////////////////////////////////////////////////////////////   
        if(event.getKeyCode()== KeyEvent.VK_ESCAPE){
            father.dispose();
            return;
        }
        else if(event.getKeyCode()== KeyEvent.VK_UP)
            father.getWorldManager().wykonajTure(new Wspolrzedne(0,-1));
        else if(event.getKeyCode()== KeyEvent.VK_DOWN)
            father.getWorldManager().wykonajTure(new Wspolrzedne(0,1));           
        else if(event.getKeyCode()== KeyEvent.VK_LEFT)
            father.getWorldManager().wykonajTure(new Wspolrzedne(-1,0));
        else if(event.getKeyCode()== KeyEvent.VK_RIGHT)
            father.getWorldManager().wykonajTure(new Wspolrzedne(1,0));
        else if(event.getKeyCode()== KeyEvent.VK_P)
            father.getWorldManager().wykonajTure(new Wspolrzedne(0,0));
        else if(event.getKeyCode()== KeyEvent.VK_S){
            try {
                father.getWorldManager().zapisz();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ObslugaKlawiszy.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(event.getKeyCode()== KeyEvent.VK_L){
            try {
                father.getWorldManager().wczytaj();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ObslugaKlawiszy.class.getName()).log(Level.SEVERE, null, ex);
            } catch (BladRozmiaru ex) {
                Logger.getLogger(ObslugaKlawiszy.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
////////////////////////////////////////////////////////////////////////////////
    }
    
    @Override
    public void keyReleased(KeyEvent event){
        
    }
    
    @Override
    public void keyTyped(KeyEvent event)
    {
        
    }
}
