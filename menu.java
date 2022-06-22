
import java.util.Scanner;

public class menu {
    

    public static void main(String[] args){
        Scanner lukija = new Scanner(System.in);
        Hirsipuu h = new Hirsipuu(lukija);
        int valittu;
        do {
            valittu = mainMenu();
            switch (valittu) {
                case 1:
                    System.out.println("Aloitetaan peli");
                    h.hirtto();
                    break;
                case 2:
                    System.out.println("Hyvästi");
                    break;
            }
        }
        while(valittu > 2);
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