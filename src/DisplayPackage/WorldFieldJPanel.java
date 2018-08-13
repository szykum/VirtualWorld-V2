/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisplayPackage;
import VirtualWorld.WorldManager;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
/**
 *
 * @author Olek
 */
public class WorldFieldJPanel extends JPanel{

    private JLabel text;
    
    public WorldFieldJPanel(int x, int y, WorldManager worldManager)
    {
        RightMouseMenu rigtMouseMenu = new RightMouseMenu(x,y,worldManager);
        addMouseListener(rigtMouseMenu);
        setBackground(Color.green);
        text=new JLabel();
        add(text);
    }
    
    public void clearField()
    {
        text.setText("");
        setBackground(Color.green);
    }
    
    public void setText(String newText)
    {
        text.setText(newText);
        if(newText=="Human")setBackground(Color.blue);
    }
}
