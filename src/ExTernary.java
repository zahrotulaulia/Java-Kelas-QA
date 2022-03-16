import java.util.Scanner;

public class ExTernary {
    public static void main(String[] args) {
        // ternary operator

        int input, a;

        Scanner inputan = new Scanner(System.in);

        System.out.print("Masukkan Nilai: ");
        input = inputan.nextInt();

        a = (input == 10) ? (input / input) : (input * input);

        System.out.println("Maka nilai a adalah " + a);

        System.out.println("================================");

        int x = 25;
        if (x == 25) {
            x *= 5; // aksi 1
        } else {
            x /= 5; // aksi 2
        }
        System.out.println("Nilai x adalah " + x);
    }
}
