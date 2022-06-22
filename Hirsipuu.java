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

        int ei = 0;
        System.out.println(sana);
        List<Character> arvaukset = new ArrayList<>();
        tulosta(sana, arvaukset);
        while(true){

            Arvaus(sana,arvaukset,ei);

        }

    }

    private void Arvaus(String sana, List<Character> arvaukset,int ei) {
        System.out.println("Anna kirjain.");
        String arvaus = lukija.nextLine();
        arvaukset.add(arvaus.charAt(0));
        if(!(sana.contains(arvaus))){
            ei++;
            hp--;
            System.out.println("Väärin");
        }
        tulosta(sana, arvaukset);
        System.out.println(ei);
    }

    private  void tulosta(String sana, List<Character> arvaukset) {

        for(int i = 0; i < sana.length(); i++){
            if(arvaukset.contains(sana.charAt(i))){
                System.out.print(sana.charAt(i));
            }
            else{
                System.out.print("-");
            }
        }
        System.out.println();

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
        }
    }
}