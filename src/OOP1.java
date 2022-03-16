// Class = Template
class StudentBinar { // Class with constructor
    String nama;
    String stream;
    int usia;
    double nilai;

    StudentBinar(String inputNama, String inputStream) {
        nama = inputNama;
        stream = inputStream;

        System.out.println(nama);
        System.out.println(stream);
    }

    //constructor
    public StudentBinar() {
        this.nama = nama;
        this.stream = stream;
    }
}

class contoh { // Class without constructor
    String dataString;
    int dataInt;
}

public class OOP1 {
    // Class & Method

    public static void main(String[] args) {

        contoh objectContoh = new contoh();
        objectContoh.dataString = "string test";
        System.out.println(objectContoh.dataString);

        // Instansiasi Object
        StudentBinar Student1 = new StudentBinar();
        Student1.nama = "Akram";
        Student1.stream = "QA";
        Student1.usia = 20;
        Student1.nilai = 100;

        System.out.println(Student1.nama);
        System.out.println(Student1.stream);
        System.out.println(Student1.usia);
        System.out.println(Student1.nilai);

        StudentBinar Student2 = new StudentBinar();
        Student2.nama = "Aulia";
        Student2.stream = "QA";
        Student2.usia = 20;
        Student2.nilai = 100;

        System.out.println(Student2.nama);
        System.out.println(Student2.stream);
        System.out.println(Student2.usia);
        System.out.println(Student2.nilai);
    }
}