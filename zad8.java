import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jaka jest poczatkowa waluta?: ");
        System.out.println("1 - PLN");
        System.out.println("2 - JPY");
        double kursJPY = 30.32;
        double kursPLN = 0.033;
        String waluta = scanner.next();
        System.out.println("Wprowadz kwote: ");
        double x = scanner.nextDouble();
        double y = x * kursJPY;
        double z = x * kursPLN;
        switch (waluta) {
            case "1" -> System.out.println(y);
            case "2" -> System.out.println(z);
        }
    }
}
