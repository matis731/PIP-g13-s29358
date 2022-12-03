import java.util.Random;
import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz 2 liczby rzeczywiste: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if(a > b) {
            double z = a;
            a = b;
            b = z;
        }
        System.out.println("Wybrany przedzial: " + "[" + a + " , " + b + "]");
        Random generator = new Random();

        double d3 = generator.nextDouble() * (b - a) + a;
        double d2 = generator.nextDouble() * (d3 - a) + a;
        double d1 = generator.nextDouble() * (d2 - a) + a;

        System.out.println("Liczby wygenerowane losowo: ");
        System.out.println(d1 + " < " + d2 + " < " + d3);


    }
}
