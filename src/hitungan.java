import java.util.Scanner;

public class hitungan {
    public static void main(String[] args) {
        System.out.println("Menghitung Luas Bangun Persegi Panjang");

        Scanner InputAngka = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;
        System.out.print("Masukkan Panjang: ");
        panjang = InputAngka.nextInt();
        System.out.print("Masukkan Lebar: ");
        lebar = InputAngka.nextInt();

        System.out.println(panjang);
        System.out.println(lebar);

        luas = panjang * lebar;
        System.out.println("Luasnya adalah " + luas);

        // volume = luas * tinggi
        System.out.println("Menghitung Volume Bangun Persegi Panjang");
        System.out.print("Masukkan Tinggi: ");
        tinggi = InputAngka.nextInt();

        volume = luas * tinggi;
        System.out.println("Volumenya adalah " + volume);

        System.out.println("end of program");
    }
}
