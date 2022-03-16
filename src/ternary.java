import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        // ternary operator

        int input, a;

        Scanner inputan = new Scanner(System.in);

        System.out.print("Masukkan Nilai: ");
        input = inputan.nextInt();

        a = (input == 10) ? (input*input) : (input-2);

        System.out.println("Maka nilai a adalah " + a);

        System.out.println("================================");

        int x = 10;
        if (x == 10) {
            x += 5; // aksi 1
        } else {
            x -= 2; // aksi 2
        }
        System.out.println("Nilai x adalah " + x);
    }
}
