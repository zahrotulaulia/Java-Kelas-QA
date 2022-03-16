import java.util.Scanner;

public class ExFungsi {

    // Fungsi Memasukkan Nilai
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Harga Beli: ");
        int HargaBeli = userInput.nextInt();
        System.out.print("Harga Jual: ");
        int HargaJual = userInput.nextInt();

        nilai(HargaBeli, HargaJual);
    }

    // Fungsi Untung
    public static int untung (int HargaBeli, int HargaJual) {
        int untung = HargaJual - HargaBeli;
        return untung;
    }

    // Fungsi Rugi
    public static int rugi (int HargaBeli, int HargaJual) {
        int rugi = HargaBeli - HargaJual;
        return rugi;
    }

    // Fungsi Persentase Keuntungan
    public static float persentaseUntung (int HargaBeli, int HargaJual) {
        float pu = (HargaJual - HargaBeli) * 100 / HargaBeli;
        return pu;
    }

    // Fungsi Persentase Kerugian
    public static float persentaseRugi (int HargaBeli, int HargaJual) {
        float pr = (HargaBeli - HargaJual) * 100 / HargaBeli;
        return pr;
    }

    // Fungsi Menampilkan Nilai
    public static void nilai (int HargaBeli, int HargaJual) {
        System.out.println("\nUntung atau Rugi ?");

        if (HargaJual > HargaBeli) {
            System.out.println("\nKeuntungan yang diperoleh sebesar Rp " + untung(HargaBeli, HargaJual));
            System.out.println("Persentase keuntungan yang diperoleh sebesar " + persentaseUntung(HargaBeli, HargaJual) + " %");
        } else if (HargaBeli > HargaJual) {
            System.out.println("\nKerugian yang diperoleh sebesar Rp " + rugi(HargaBeli, HargaJual));
            System.out.println("Persentase kerugian yang diperoleh sebesar " + persentaseRugi(HargaBeli, HargaJual) + " %");
        } else {
            System.out.println("\nTidak mengalami untung maupun rugi");
        }
    }
}
