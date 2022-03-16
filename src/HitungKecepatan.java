import java.util.Scanner;

public class HitungKecepatan {
    public static void main(String[] args) {
        System.out.println("Menghitung Kecepatan");

        Scanner InputAngka = new Scanner(System.in);
        int s, t, v;
        System.out.print("Masukkan Jarak (km): ");
        s = InputAngka.nextInt();
        System.out.print("Masukkan Waktu (jam): ");
        t = InputAngka.nextInt();

        v = s / t;
        System.out.println("Kecepatannya adalah " + v + " km/jam");

        System.out.println("end of program");
    }
}
