
package DisplayPackage;
import VirtualWorld.ObslugaSwiata;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PrawyPrzycisk extends MouseAdapter{                //obsługa PPM
    
    private int x;
    private int y;
    private ObslugaSwiata worldManager;
    
    public PrawyPrzycisk(int x, int y, ObslugaSwiata worldManager){
        this.worldManager=worldManager;
        this.x=x;
        this.y=y;
    }
    
    @Override
    public void mouseClicked(MouseEvent event){                 //rozwijanie menu
        if(MouseEvent.BUTTON3==event.getButton()){
            MenuLista menu=new MenuLista(x,y,worldManager);
            menu.show(event.getComponent(),event.getX(),event.getY());
        }
    }
    
}
