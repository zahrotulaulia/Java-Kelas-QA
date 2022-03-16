import java.sql.SQLOutput;

public class Fungsi2 {
    public static void main(String[] args) {
        // void = kosong = hampa

        FungsiLagi("test input");
        HelloWorld("Aulia");
        HelloWorld("Cindy");
        System.out.println(test());
    }

    public static void HelloWorld(String nama) {
        System.out.println("Halo Selamat Pagi " + nama);
    }


    public static void FungsiLagi(String input) {
        System.out.println(input);
    }

    public static float test() {
        return 15.5f;
    }
}
