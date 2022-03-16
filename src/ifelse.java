public class ifelse {
    public static void main(String[] args) {
        // if kondisi .. aksi

        // if else

        int x = 5;

        System.out.println("Ini nilai x: " + x);

        // kondisi
        if (x == 5) {
            System.out.println("Nilai x benar 5");
        } else if (x == 2) {
            System.out.println("Nilai x adalah 10");
        } else {
            System.out.println("Nilai x bukan 5");
        }
        System.out.println("end of program");

        // nested if else

        int a = 5;
        int b = 10;

        System.out.println("Ini nilai a: " + a);
        System.out.println("Ini nilai b: " + b);

        if (a == 5) {
            if (b == 10) {
                System.out.println("Nilai a dan b benar 5 dan 10");
            } else {
                System.out.println("Nilai a benar 5 dan b bukan 10");
            }
        }
        else {
            System.out.println("Nilai salah");
        }
        System.out.println("end of program");
    }
}
