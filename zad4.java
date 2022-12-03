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


        switch (operator) {
            case "ADD" -> System.out.println("Wynik: " + (a + b));
            case "SUB" -> System.out.println("Wynik: " + (a - b));
            case "MUL" -> System.out.println("Wynik: " + (a * b));
            case "DIV" -> System.out.println("Wynik: " + (a / b));
        }
    }
}