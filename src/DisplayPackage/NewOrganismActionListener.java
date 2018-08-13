
package DisplayPackage;

import VirtualWorld.Wspolrzedne;
import VirtualWorld.ObslugaSwiata;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NewOrganismActionListener implements ActionListener{
    private String nazwa;
    private int x;
    private int y;
    ObslugaSwiata worldManager;
    
          public NewOrganismActionListener(int x, int y, ObslugaSwiata worldManager, String nazwa){
            this.nazwa=nazwa;
            this.x=x;
            this.y=y;
            this.worldManager=worldManager;
        }
    
        @Override
        public void actionPerformed(ActionEvent event){
                    worldManager.addOrganism(new Wspolrzedne(x,y),nazwa);
                    worldManager.rysuj();
                }
}
