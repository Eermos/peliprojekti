import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hirsipuu {
    Scanner lukija;
    int hp = 5;
    public Hirsipuu(Scanner s){
        this.lukija = s;
    }
    
    public void hirtto(){
        hp = 5;
        Boolean gam = true;
        List<String> sanat = new ArrayList<>();
            String tiedosto = "Sanat.txt";
            
        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {
            while(tiedostonLukija.hasNext()){
                sanat.add(tiedostonLukija.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        Random random = new Random();

        String sana = sanat.get(random.nextInt(sanat.size()));

        
        List<Character> arvaukset = new ArrayList<>();
        tulosta(sana, arvaukset,gam);
        while(true){
            if(gam = false){
                
                break;
            }else{
                Arvaus(sana,arvaukset,gam);
            }
            
        }

    }

    private void Arvaus(String sana, List<Character> arvaukset,boolean gam) {
        
        if (gam = true){
            System.out.println("Anna kirjain.");
            String arvaus = lukija.nextLine();
            arvaukset.add(arvaus.charAt(0));
            if(!(sana.contains(arvaus))){
 
            hp--;
            System.out.println("Väärin");
            hirtetty(hp);
        }
            tulosta(sana, arvaukset, gam);
        }
    }

    private  void tulosta(String sana, List<Character> arvaukset,boolean gam) {
        
        String susburger = "";
        for(int i = 0; i < sana.length(); i++){
            if(arvaukset.contains(sana.charAt(i))){
                susburger += (sana.charAt(i));
            }
            else{
                susburger += ("-");
            }
        }
        System.out.println(susburger);
        if(!(susburger.contains("-"))){
            System.out.println("onnistuit jossain");
            gam = !gam;
            System.out.println(gam);
            menu.Menu();
        }
    }

    public void hirtetty(int hp){
        if (hp == 5){
            System.out.println("");
        }
        else if (hp == 4){
        System.out.println("|----------");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        }
        else if(hp == 3){
            System.out.println("|----------");
            System.out.println("|        |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if (hp == 2){
            System.out.println("|----------");
            System.out.println("|        |");
            System.out.println("|        O");
            System.out.println("|        |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if (hp == 1){
            System.out.println("|----------");
            System.out.println("|        |");
            System.out.println("|        O");
            System.out.println("|        |");
            System.out.println("|        |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if (hp == 0){
            System.out.println("|----------");
            System.out.println("|        |");
            System.out.println("|        O");
            System.out.println("|        |");
            System.out.println("|        |");
            System.out.println("|       /\\");
            System.out.println("|");
            System.out.println("|");
            System.out.println("Hävisit pelin lmao");
            
            menu.Menu();
            hp = 5;
        }
        
    }
}
