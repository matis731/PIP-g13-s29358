import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = scanner.nextInt();

        if (n >= 0) {
            for (int i = 0; i < n; i++) {
                double a = Math.random(),
                        b = Math.random();
                System.out.println(i + a + b);
            }
        } else {
            for (int i = 0; i > n; i--) {
                double a = Math.random(),
                        b = Math.random();
                System.out.println(i + a + b);
            }
        }
    }
}



