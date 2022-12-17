import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            n -= 1;
        }

        wzor(n);
    }
    public static void wzor(int n) {

        int wiersze = ((n + 1) / 2);
        for (int wiersz = 0; wiersz < wiersze; wiersz++) {

            int odstepy = wiersze - wiersz - 1;
            int gwiazdy = n - 2 * odstepy;

                int i = 0;
                if ((n - i) % 2 != 0) {
                    for (i = 0; i < odstepy; i++) {
                        System.out.print(" ");
                    }
                    for (i = 0; i < gwiazdy; i++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
        }

    }
}

