class Student {
    //data
    String Nama;
    Integer NIS;
    Integer Nilai;

    //constructor
    Student(String Nama, Integer NIS, Integer Nilai) {
        this.Nama = Nama;
        this.NIS = NIS;
        this.Nilai = Nilai;
    }

    //method tanpa return tanpa parameter
    void show() {
        System.out.println("Nama\t: " + this.Nama);
        System.out.println("NIS\t\t: " + this.NIS);
        System.out.println("Nilai\t: " + this.Nilai);
    }

    //getter - ambil data
    String getNama() {
        return this.Nama;
    }
    Integer getNilai() {
        return this.Nilai;
    }
}

public class TugasJavaAulia {

    public static void main(String[] args) {
        Student student1 = new Student("Ana Khalifah", 111, 95);
        Student student2 = new Student("Ani Latifah", 112, 65);
        Student student3 = new Student("Badrul Rojak", 113, 70);
        Student student4 = new Student("Deva Renanggu", 114, 82);
        Student student5 = new Student("Laila Nur Fatimah", 115, 90);
        student1.show();
        student2.show();
        student3.show();
        student4.show();
        student5.show();
        Integer Nilai1 = student1.getNilai();
        Integer Nilai2 = student2.getNilai();
        Integer Nilai3 = student3.getNilai();
        Integer Nilai4 = student4.getNilai();
        Integer Nilai5 = student5.getNilai();

        System.out.println("\nKeterangan masing-masing student kelas A :\n");

        //Student 1
        if (Nilai1 >= 75) {
            System.out.println("1. Nilai akhir " + student1.getNama() + " adalah " + Nilai1 + ", maka dinyatakan LULUS.");
        } else {
            System.out.println("1. Nilai akhir " + student1.getNama() + " adalah " + Nilai1 + ", maka dinyatakan TIDAK LULUS.");
        }
        //Student 2
        if (Nilai2 >= 75) {
            System.out.println("2. Nilai akhir " + student2.getNama() + " adalah " + Nilai2 + ", maka dinyatakan LULUS.");
        } else {
            System.out.println("2. Nilai akhir " + student2.getNama() + " adalah " + Nilai2 + ", maka dinyatakan TIDAK LULUS.");
        }
        //Student 3
        if (Nilai3 >= 75) {
            System.out.println("3. Nilai akhir " + student3.getNama() + " adalah " + Nilai3 + ", maka dinyatakan LULUS.");
        } else {
            System.out.println("3. Nilai akhir " + student3.getNama() + " adalah " + Nilai3 + ", maka dinyatakan TIDAK LULUS.");
        }
        //Student 4
        if (Nilai4 >= 75) {
            System.out.println("4. Nilai akhir " + student4.getNama() + " adalah " + Nilai4 + ", maka dinyatakan LULUS.");
        } else {
            System.out.println("4. Nilai akhir " + student4.getNama() + " adalah " + Nilai4 + ", maka dinyatakan TIDAK LULUS.");
        }
        //Student 5
        if (Nilai5 >= 75) {
            System.out.println("5. Nilai akhir " + student5.getNama() + " adalah " + Nilai5 + ", maka dinyatakan LULUS.");
        } else {
            System.out.println("5. Nilai akhir " + student5.getNama() + " adalah " + Nilai5 + ", maka dinyatakan TIDAK LULUS.");
        }

        nilai(Nilai1,Nilai2,Nilai3,Nilai4,Nilai5);
    }

    // Fungsi Mencari rata-rata nilai dari 5 mahasiswa
    public static float rataRata (Integer Nilai1, Integer Nilai2, Integer Nilai3, Integer Nilai4, Integer Nilai5) {
        float rerataan = (Nilai1 + Nilai2 + Nilai3 + Nilai4 + Nilai5) / 5;
        return rerataan;
    }

    // Fungsi Menampilkan Nilai
    public static void nilai (Integer Nilai1, Integer Nilai2, Integer Nilai3, Integer Nilai4, Integer Nilai5) {
        System.out.println("\nRata - Rata Nilai 5 Student Kelas A adalah " + rataRata(Nilai1,Nilai2,Nilai3,Nilai4,Nilai5));
    }
}
