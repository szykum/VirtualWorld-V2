
package DisplayPackage;
import VirtualWorld.Wspolrzedne;
import VirtualWorld.ObslugaSwiata;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class MenuLista extends JPopupMenu{                      //menu z ktorego dodajemy nowe organizmy
    
    public int ilosc;
    JMenuItem[] menuItems;
    
    public MenuLista(int x, int y, ObslugaSwiata worldManager)
    {
        this.ilosc = 9;
        menuItems = new JMenuItem[ilosc];
        menuItems[0] = new JMenuItem("Antylopa");
        menuItems[1] = new JMenuItem("Lis");
        menuItems[2] = new JMenuItem("Owca");
        menuItems[3] = new JMenuItem("Zolw");
        menuItems[4] = new JMenuItem("Wilk");
        menuItems[5] = new JMenuItem("Trawa");
        menuItems[6] = new JMenuItem("Mlecz");
        menuItems[7] = new JMenuItem("Jagody");
        menuItems[8] = new JMenuItem("Guarana");
        for(int i=0;i<ilosc;i++){
            add(menuItems[i]);
            menuItems[i].addActionListener(new NewOrganismActionListener(x,y,worldManager,menuItems[i].getText()));
        }
    }
}
