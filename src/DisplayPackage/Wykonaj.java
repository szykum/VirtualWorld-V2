
package DisplayPackage;
import VirtualWorld.ObslugaSwiata;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class Wykonaj extends JPanel{
    
    private ObslugaPlanszy[][] animalMatrix;
    private final int szer;
    private final int wys;
    
    public Wykonaj(int xBeg, int yBeg, ObslugaSwiata worldManager){
        szer=xBeg;
        wys=yBeg;
        setLayout(new GridLayout(xBeg,yBeg,5,5));
        this.animalMatrix= new ObslugaPlanszy[xBeg][yBeg];
        
        
        for(int y=0;y<wys;y++){                                     //dodawanie przycisków
            for(int x=0;x<szer;x++){
                animalMatrix[x][y]=new ObslugaPlanszy(x,y,worldManager);
                add(animalMatrix[x][y]);
            }
        }  
    }
    
    public void setIcon(String text, int x, int y){
        animalMatrix[x][y].ustawIkone(text);
    }
    
    public void CzyscWszystko(){
        for(int i=0;i<wys;i++){
            for(int j=0;j<szer;j++){
                animalMatrix[j][i].Czysc();
            }
        }
    }
    
}
