import java.util.Scanner;

public class ExSwitchCase {
    public static void main(String[] args) {

        System.out.println("Contoh Switch Case");

        String inputNilai;
        Scanner inputan = new Scanner(System.in);

        System.out.print("Nilai (A/B/C/D) : ");
        inputNilai = inputan.next();

        switch (inputNilai) {
            case "A":
                System.out.println("Sangat Baik");
                break;
            case "B":
                System.out.println("Baik");
                break;
            case "C":
                System.out.println("Cukup");
                break;
            case "D":
                System.out.println("Kurang Baik");
                break;
            default:
            System.out.println("Invalid");
        }
    }
}

