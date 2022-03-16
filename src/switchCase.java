import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {

        // tanpa break case dibawahnya akan muncul
        System.out.println("Belajar Switch Case");

        String inputNama;
        Scanner inputan = new Scanner(System.in);

        System.out.print("Panggil Nama: ");
        inputNama = inputan.next();

        switch (inputNama) {
            case "Sarah":
                System.out.println("Sarah hadir kak");
                break;
            case "Dei":
                System.out.println("Dei hadir");
                break;
            case "Aulia":
                System.out.println("Aulia hadir mbak");
                break;
            default:
                System.out.println("Cindy tidak hadir");
        }
    }
}
