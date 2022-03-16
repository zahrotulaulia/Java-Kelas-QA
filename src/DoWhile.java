public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Perulangan Do While Loop");

        // while, do while, for loop

        // do {aksi} while (kondisi)

        int a = 1;
        boolean kondisi = true;

        do {
            a++;
            System.out.println("Do While Loop ke-" + a);
            if (a == 30) {
                kondisi = false;
            }
        } while (kondisi);

        System.out.println("END");
    }
}

