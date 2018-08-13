/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisplayPackage;
import VirtualWorld.Coords;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import VirtualWorld.WorldManager;
import VirtualWorld.Human;
/**
 *
 * @author Olek
 */
public class Frame extends JFrame{
    
    private WorldManager worldManager;
    
    public WorldManager getWorldManager()
    {
        return worldManager;
    }
    
    private Human human;
    
    public Human getHuman()
    {
        return human;
    }
    
    private final SimulatorArea poleGry; 
    
    public Frame(int x, int y, WorldManager worldManager)
    {
        super("Virtual World");
        this.worldManager=worldManager;
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000, 1000);
        setLayout(new FlowLayout());
        KeyListenerFrame escExit = new KeyListenerFrame();
        addKeyListener(escExit);
        poleGry = new SimulatorArea(x, y, worldManager);
        add(poleGry);
        poleGry.setBackground(new Color(0, 102, 0));
        poleGry.setLocation(0, 100);
        poleGry.setPreferredSize(new Dimension(1000,1000));
	setVisible(true);
    }
    
    public void setFieldText(String text, int x, int y)
    {
        poleGry.setFieldText(text, x, y);
    }
    
    public void clearSimArea()
    {
        poleGry.clearArea();
    }
}
