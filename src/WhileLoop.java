public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("Perulangan While");

        // while, do while, for loop

        // while (kondisi){aksi}

        int a = 1;
        boolean kondisi = true;

        while (kondisi) {
            System.out.println("While Loop ke-" + a);

            if (a == 50) {
                kondisi = false;
            }
            a++;
        }
        System.out.println("END");
    }
}
