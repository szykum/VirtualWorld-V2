
package DisplayPackage;
import VirtualWorld.Wspolrzedne;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import VirtualWorld.ObslugaSwiata;
import VirtualWorld.Czlowiek;

public class Plansza extends JFrame{
    
    private ObslugaSwiata worldManager;
    private Czlowiek Player;
    private final Wykonaj poleGry; 
    public ObslugaSwiata getWorldManager(){
        return worldManager;
    }
    public Czlowiek getPlayer(){
        return Player;
    }
    
////////////////////////////////////////////////////////////////////////////////   
    
    public Plansza(int x, int y, ObslugaSwiata worldManager)
    {
        super("Najlepszy swiat ze w kosmosie");                 //wyglad planszy
        this.worldManager=worldManager;
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1200, 900);
       // setLayout(new FlowLayout());
        ObslugaKlawiszy escExit = new ObslugaKlawiszy();
        addKeyListener(escExit);
        poleGry = new Wykonaj(x, y, worldManager);
        add(poleGry);
        poleGry.setBackground(new Color(0, 102, 0));
        poleGry.setLocation(0, 100);
        poleGry.setPreferredSize(new Dimension(800,800));
	setVisible(true);
    }
    
    public void ustawIkone (String text, int x, int y){
        poleGry.setIcon(text, x, y);
    }
    
    public void czyszczenie(){
        poleGry.CzyscWszystko();
    }
}
