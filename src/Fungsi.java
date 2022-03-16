public class Fungsi {
    public static void main(String[] args) {
        // Fungsi dirancang untuk melakukan tugas tertentu (bagian dari program utama)

        int x, y;
        x = 2;
        y = hitung(x);
        System.out.println("x = " + x + " , y = " + y);

        x = hitung(y);
        y = hitung2(x);
        System.out.println("x = " + x + " , y = " + y);
    }
    // fungsi hitung
    public static int hitung(int input) {

        int hasil;

        hasil = input * input;

        return hasil;
    }

    public static int hitung2 (int input) {
        int hasil;
        hasil = input+100;
        return hasil;
    }
}
