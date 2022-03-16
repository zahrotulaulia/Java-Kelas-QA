//class contains 2 (data member, method (data function))

class Mahasiswa {
    //data
    String nama;
    String NIM;

    //constructor
    Mahasiswa(String nama, String NIM) {
        this.nama = nama;
        this.NIM = NIM;
        System.out.println("ini constructor");
    }

    //method tanpa return tanpa parameter
    void show() {
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.NIM);
    }

    //method tanpa return dengan parameter
    //setter - edit data
    void setNama(String nama) {
        this.nama = nama;
    }

    //method dengan return tanpa parameter
    //getter - ambil data
    String getNama() {
        return this.nama;
    }
    String getNIM() {
        return this.NIM;
    }

    //method dengan return dengan parameter
    String Halo(String Pesan) {
        return Pesan + " nama saya adalah " + this.nama;
    }
}

public class OOP2 {

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Akram", "123423464634");
        Mahasiswa mahasiswa2 = new Mahasiswa("Kevin", "852356387353");
        mahasiswa1.show();
        System.out.println("======================");
        mahasiswa2.show();
        mahasiswa2.setNama("Krissy");
        mahasiswa2.show();
        System.out.println("======================");
        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa2.getNama());
        System.out.println("======================");
        String data = mahasiswa2.Halo("nama kamu siapa?");
        System.out.println(data);
    }
}
