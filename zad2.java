import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz n: ");

        int n = scanner.nextInt();

        fibonacci(n);
    }
    public static void fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 0;

        switch (n) {
            case 0 -> System.out.println("F0 = 0");
            case 1 -> System.out.println("F1 = 1");
            default -> {
                int i = 2;
                while (i <= n) {
                    c = a + b;
                    a = b;
                    b = c;
                    i++;
                }

                System.out.println("F" + n + "=" + c);
            }
        }
    }
}
