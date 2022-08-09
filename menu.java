import java.util.Scanner;

public class menu {

    
    

    public static void main(String[] args){
        
        Menu();    
    }

    public static void Menu(){
        Scanner lukija = new Scanner(System.in);
        Hirsipuu h = new Hirsipuu(lukija);
        int valittu = 3;
        while (true){
            valittu = mainMenu();
            if (valittu == 1){
                System.out.println("Aloitetaan peli");
                h.hirtto();
                break;
            } else if(valittu == 2) {
                System.out.println("Hyvästi");
                System.exit(0);
                break;
            }
        }
        }
        


    public static int mainMenu(){
        int valinta;
        Scanner lukija = new Scanner (System.in);
        System.out.println("Menu");
        System.out.println("1 - Käynnistä peli");
        System.out.println("2 - Poistu pelistä");

        valinta = lukija.nextInt();
        return valinta;
    }
}
