import java.util.Scanner;

public class zad4 {

    public static void main(String[] args) {

        String operator;
        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadz operator ( ADD, SUB, MUL, DIV): ");
        operator = scanner.next();

        System.out.println("Wprowadz a i b: ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        scanner.close();


        switch (operator) {
            case "ADD" -> {
                int x = a+b;
                System.out.println("Wynik: " + x);
                absoluteValue(x);
            }
            case "SUB" -> {
                int x = a-b;
                System.out.println("Wynik: " + x);
                absoluteValue(x);
            }
            case "MUL" -> {
                int x = a*b;
                System.out.println("Wynik: " + x);
                absoluteValue(x);
            }
            case "DIV" -> {
                int x = a/b;
                System.out.println("Wynik: " + x);
                absoluteValue(x);
            }
        }
    }
    private static void absoluteValue(int x) {
        
        int z = Math.abs(x);

        System.out.println(x + " => " + z);
    }

}
