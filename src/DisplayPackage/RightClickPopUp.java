/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisplayPackage;
import VirtualWorld.Coords;
import VirtualWorld.WorldManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
/**
 *
 * @author Olek
 */
public class RightClickPopUp extends JPopupMenu{
    
    public int menuLength;
    
    JMenuItem[] menuItems;
    
    public RightClickPopUp(int x, int y, WorldManager worldManager)
    {
        this.menuLength = 9;
        
        menuItems = new JMenuItem[menuLength];
        menuItems[0] = new JMenuItem("Antelope");
        menuItems[1] = new JMenuItem("Fox");
        menuItems[2] = new JMenuItem("Sheep");
        menuItems[3] = new JMenuItem("Turtle");
        menuItems[4] = new JMenuItem("Wolf");
        menuItems[5] = new JMenuItem("Grass");
        menuItems[6] = new JMenuItem("Sow Thistle");
        menuItems[7] = new JMenuItem("Belladonna");
        menuItems[8] = new JMenuItem("Guarana");
        for(int i=0;i<menuLength;i++)
        {
            add(menuItems[i]);
            menuItems[i].addActionListener(new NewOrganismActionListener(x,y,worldManager,menuItems[i].getText()));
        }
    }
}
