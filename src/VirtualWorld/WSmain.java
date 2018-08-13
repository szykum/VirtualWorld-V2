package VirtualWorld;
import java.awt.EventQueue;

public class WSmain {
    
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
                            new ObslugaSwiata(20,20);
			}
        });
    }
}
