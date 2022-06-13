public class kuoli {
    public static void hirtetty(int hp){
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
