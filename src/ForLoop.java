public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Perulangan For Loop");

        // for (inisialisasi; kondisi; step nilai){aksi}

        System.out.println("Perulangan Pertama");
        for (int nilai = 0; nilai <= 10; nilai++) {
            System.out.println("For Loop ke-" + nilai);
        }

        System.out.println("Perulangan Kedua");
        for (int nilai = 0; nilai < 10; nilai++) {
            System.out.println("For Loop ke-" + nilai);
        }

        System.out.println("Perulangan Ketiga");
        for (int nilai = 10; nilai >= 5; nilai--) {
            System.out.println("For Loop ke-" + nilai);
        }

        System.out.println("END");
    }
}

