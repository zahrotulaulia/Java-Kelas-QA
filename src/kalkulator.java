import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        System.out.println("Kalkulator");

        float a,b,hasil;
        String operator;

        Scanner inputan = new Scanner(System.in);

        System.out.print("Angka Pertama (a): ");
        a = inputan.nextFloat();
        System.out.print("Operator (+,-,x,/): ");
        operator = inputan.next();
        System.out.print("Angka Kedua (b): ");
        b = inputan.nextFloat();

        switch (operator) {
            case "+":
                hasil = a + b;
                System.out.println("Hasil penjumlahan antara a dan b adalah " + hasil);
                break;
            case "-":
                hasil = a - b;
                System.out.println("Hasil pengurangan antara a dan b adalah " + hasil);
                break;
            case "x":
                hasil = a * b;
                System.out.println("Hasil perkalian antara a dan b adalah " + hasil);
                break;
            case "/":
                hasil = a / b;
                System.out.println("Hasil pembagian antara a dan b adalah " + hasil);
                break;
            default:
                System.out.println("Operator " + operator + "tidak ditemukan.");
        }
    }
}
