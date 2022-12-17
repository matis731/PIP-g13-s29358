public class zad1 {
    public static void main(String[] args) {
        boolean czyPada = false;
        boolean czySwieciSlonce = false;

        if (czyPada && czySwieciSlonce) {
            System.out.println("tecza");

        } else if (czyPada == true && czySwieciSlonce == false) {
            System.out.println("plucha");

        } else if (czyPada == false && czySwieciSlonce == false) {
            System.out.println("pochmurno");

        } else if (czyPada == false && czySwieciSlonce == true) {
            System.out.println("slonecznie");
        }
    }

}

