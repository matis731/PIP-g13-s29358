import java.util.Random;
import java.util.Scanner;

public class zad1 {
    public static int[] createArray() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj n: ");

        int n = scanner.nextInt();

        int[] array = new int[n];
        Random los = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = los.nextInt(101);
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static int[] sortArray(int[] sortedArr) {
        int[] sortedArray = sortedArr.clone(); // kopia tablicy

        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = 0; j < sortedArray.length - i - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    // zamiana miejscami
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }

        return sortedArray;

    }

    public static int[] reverseArray(int[] revArray) {
        int[] reversedArray = revArray.clone();
        int left = 0;
        int right = reversedArray.length - 1;

        while (left < right) {
            int temp = reversedArray[left];
            reversedArray[left] = reversedArray[right];
            reversedArray[right] = temp;
            left++;
            right--;
        }
        return reversedArray;
    }

    public static boolean equalsReverse(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[array2.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] array = createArray();
        printArray(array);

        int[] sortedArr = sortArray(array);
        printArray(sortedArr);

        int[] revArray = reverseArray(sortedArr);
        printArray(revArray);

        System.out.println(equalsReverse(sortedArr,revArray));
    }



}
