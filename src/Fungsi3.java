import java.util.Scanner;

public class Fungsi3 {
    public static void main(String[] args) {
        // fungsi hitung

        Scanner userInput = new Scanner(System.in);
        System.out.print("Panjang: ");
        int inputPanjang = userInput.nextInt();
        System.out.print("Lebar: ");
        int inputLebar = userInput.nextInt();

        gambar(inputPanjang, inputLebar);

        System.out.println("Luas persegi panjang = " + luaspp(inputPanjang, inputLebar));
        System.out.println("Keliling persegi panjang = " + kelilingpp(inputPanjang, inputLebar));

        nilai(inputPanjang, inputLebar);
    }

    //fungsi menampilkan nilai
    public static void nilai (int panjang, int lebar) {
        System.out.println("Menghitung Luas dan Keliling Persegi Panjang");
        System.out.println("Luas Persegi Panjang = " + luaspp(panjang, lebar));
        System.out.println("Keliling Persegi Panjang = " + kelilingpp(panjang, lebar));
    }

    //fungsi luas
    public static int luaspp (int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }

    //fungsi keliling
    public static int kelilingpp (int panjang, int lebar) {
        int keliling = (panjang + lebar) * 2;
        return keliling;
    }

    //fungsi
    public static void gambar (int panjang, int lebar) {
        for (int i = 0; i < lebar; i++) {
            for ( int x = 0; x < panjang; x++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
