import java.util.Scanner;

public class Menu {
    

    public static void main(String[] args){
        int valittu;
        do {
            valittu = mainMenu();
            switch (valittu) {
                case 1:
                    System.out.println("Aloitetaan peli");
                    break;
                case 2:
                    System.out.println("Vaikeustasoja");
                    break;
                case 3:
                    System.out.println("Hyvästi");
                    break;
            }
        }
        while(valittu > 3);
    }

    public static int mainMenu(){
        int valinta;
        Scanner lukija = new Scanner (System.in);
        System.out.println("Menu");
        System.out.println("1 - Käynnistä peli");
        System.out.println("2 - Valitse vaikeustaso");
        System.out.println("3 - Poistu pelistä");

        valinta = lukija.nextInt();
        lukija.close();
        return valinta;
    }
}