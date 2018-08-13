package VirtualWorld;
import DisplayPackage.Plansza;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class ObslugaSwiata extends Swiat{
    
public ObslugaSwiata(int x, int y){
        super(x,y);
        mainFrame = new Plansza(x, y, this);                        //tworzymy plansze
        stworzSwiat();                                              //inicjujemy losowanie swiata
    }  
    private void stworzSwiat(){                             
        int a,b,c;
        human=(Czlowiek)this.addOrganism(new Wspolrzedne(0,0), "Czlowiek");
        
        for (int i = 0; i < 30; i++){                               //tworzymy losowo organizmy do 
            Random r = new Random();                                //swiata w pierwszej turze
            a = r.nextInt(9);
            b = r.nextInt(20);
            c = r.nextInt(20);
            if (a==0)  this.addOrganism(new Wspolrzedne(b,c), "Lis");
            else if (a == 1)this.addOrganism(new Wspolrzedne(b,c), "Antylopa");
            else if (a == 2)this.addOrganism(new Wspolrzedne(b,c), "Guarana");
            else if (a == 3)this.addOrganism(new Wspolrzedne(b,c), "Mlecz");
            else if (a == 4)this.addOrganism(new Wspolrzedne(b,c), "Owca");
            else if (a == 5)this.addOrganism(new Wspolrzedne(b,c), "Trawa");
            else if (a == 6)this.addOrganism(new Wspolrzedne(b,c), "Jagody");
            else if (a == 7)this.addOrganism(new Wspolrzedne(b,c), "Wilk");
            else if (a == 8)this.addOrganism(new Wspolrzedne(b,c), "Zolw");	

        }
    }

    public void zapisz() throws FileNotFoundException{              //zapisywanie do pliku stanu gry
        this.zniszczOrg();
        PrintWriter zapis = new PrintWriter("zapis.txt");
        for(ArrayList <Organizm> initiative : organisms){
            for(Organizm actual : initiative){
                zapis.print(actual.getName()+" "+actual.getLocation().x+" "+actual.getLocation().y+" "+actual.wWiek()+" "+actual.wSile()+String.format("%n"));
            }
        }
        zapis.close();
    }
    
    public void wczytaj() throws FileNotFoundException, BladRozmiaru{       //wczytywanie ostatnio
        for(ArrayList list : organisms){                                    //zapisanej gry
            list.clear();
        }
        File file = new File("zapis.txt");
        Scanner scanner;
        try{
            scanner = new Scanner(file);
        }
        catch(FileNotFoundException ex){
            return;
        }
        while( scanner.hasNext()) {
                String name=scanner.next();
                Wspolrzedne coords = new Wspolrzedne(scanner.nextInt(),scanner.nextInt());
                Organizm newOrg = addOrganism(coords, name);
            if(newOrg == null)System.out.println("abcssz");
                newOrg.uWiek(scanner.nextInt());
                if(newOrg.getName()!="Czlowiek") {
                } else {
                    this.human=(Czlowiek) newOrg;
                }
                newOrg.uSile(scanner.nextInt());
                if(coords.x>=size.x || coords.y>=size.y){
                    throw new BladRozmiaru();
        }
        this.rysuj();
    }
    }
    private Czlowiek human;
    /**
     *
     * @param humanMove
     */
    public void wykonajTure(Wspolrzedne humanMove){
        for(int i=organisms.size()-1;i>=0;i--){
            for(int j=0;j<organisms.get(i).size();j++){
                Organizm actual = organisms.get(i).get(j);
                if(actual.isKilled())continue;
                if("Czlowiek".equals(actual.getName())){
                    human.akcja(humanMove);
                    human.uWiek(human.wWiek()+1);
                    continue;
                }
                actual.akcja();
                actual.uWiek(actual.wWiek()+1);
            }
        }
        zniszczOrg();
        rysuj();
    }
    
    private void zniszczOrg(){                                  //kasowanie organizmu
        for(int i=0;i<organisms.size();i++){
            for(int j=0;j<organisms.get(i).size();j++){
                Organizm actual = organisms.get(i).get(j);
                if(actual.isKilled()) organisms.get(i).remove(j); 
            }
        }
    }
    
    public void rysuj(){                                        //rysowanie interfejsu
        mainFrame.czyszczenie();
        organisms.stream().forEach((organism) -> {
            organism.stream().forEach((actual) -> {
                mainFrame.ustawIkone(actual.getName(), actual.getLocation().x, actual.getLocation().y);
            });
        });
    }
}
