
package DisplayPackage;
import VirtualWorld.ObslugaSwiata;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ObslugaPlanszy extends JPanel{

    private JLabel text;
    
    public ObslugaPlanszy(int x, int y, ObslugaSwiata worldManager){
        PrawyPrzycisk rigtMouseMenu = new PrawyPrzycisk(x,y,worldManager);
        addMouseListener(rigtMouseMenu);                         //dodawanie menu rozwijanego PPM
        setBackground(Color.gray);
        text=new JLabel();                                      //buttony
        add(text);
    }
    
    public void Czysc(){                                        //czyszczenie guzikow
        text.setText("");
        text.setIcon(null);
        setBackground(Color.gray);
    }
    
    public void ustawIkone(String newText)                      //zmienianie wygladu guzika
    {
        text.setText("");
        if("Czlowiek".equals(newText))text.setIcon(new ImageIcon("human.png"));
        else if("Wilk".equals(newText))text.setIcon(new ImageIcon("wolf.png"));
        else if("Lis".equals(newText))text.setIcon(new ImageIcon("fox.png"));
        else if("Zolw".equals(newText))text.setIcon(new ImageIcon("zolw.png"));
        else if("Antylopa".equals(newText))text.setIcon(new ImageIcon("anty.png"));
        else if("Mlecz".equals(newText))text.setIcon(new ImageIcon("mlecz.png"));
        else if("Owca".equals(newText))text.setIcon(new ImageIcon("owca.png"));
        else if("Trawa".equals(newText))text.setIcon(new ImageIcon("grass.png"));
        else if("Jagody".equals(newText))text.setIcon(new ImageIcon("wjag.png"));
        else if("Guarana".equals(newText))text.setIcon(new ImageIcon("gua.png"));
        
    }
}
