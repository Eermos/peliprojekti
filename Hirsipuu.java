import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hirsipuu {
    
    public static void main(String[] args) throws FileNotFoundException{
        Scanner lukija = new Scanner(System.in);
        Scanner tiedostonLukija = new Scanner(new File("D:/hirsipuu/Sanat.txt"));
        
        List<String> sanat = new ArrayList<>();

        while(tiedostonLukija.hasNext()){
            sanat.add(tiedostonLukija.nextLine());
        }

        Random random = new Random();

        String sana = sanat.get(random.nextInt(sanat.size()));

        int ei = 0;
        System.out.println(sana);
        List<Character> arvaukset = new ArrayList<>();
        tulosta(sana, arvaukset);
        
        

        while(true){

            Arvaus(lukija,sana,arvaukset,ei);

        }

    }




    private static void Arvaus(Scanner lukija,String sana, List<Character> arvaukset,int ei) {
        System.out.println("Anna kirjain.");
        String arvaus = lukija.nextLine();
        arvaukset.add(arvaus.charAt(0));
        if(!(sana.contains(arvaus))){
            ei++;
            System.out.println("Väärin");
        }
        tulosta(sana, arvaukset);
        System.out.println(ei);
    }




    private static void tulosta(String sana, List<Character> arvaukset) {

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
}
