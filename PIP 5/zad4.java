public class zad4 {
    public static void main(String[] args) {

        wyswietlWzor(5,3,8);
    }
    public static void wyswietlWzor(int x, int y, int z) {

        int max = Math.max(x, Math.max(y, z));

        for (int i = 0; i < Math.max(x, Math.max(y, z)); i++) {
            if (x >= max) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

            if (y >= max) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

            if (z >= max) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

            System.out.println(" ");
            max--;

        }

    }
}
