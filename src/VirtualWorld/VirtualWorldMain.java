/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualWorld;
import java.awt.EventQueue;

/**
 *
 * @author Olek
 */
public class VirtualWorldMain {
    
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
                            new WorldManager(15,15);
			}
        });
    }
}
