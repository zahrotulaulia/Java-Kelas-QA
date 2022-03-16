public class TipeString {
    public static void main(String[] args) {
        // String
        String namaDepan = "Zahrotul";
        String namaBelakang = "Aulia";
        System.out.println(namaDepan);
        System.out.println(namaBelakang);

        // Menggabungkan string
        String namaLengkap = namaDepan + " " + namaBelakang;
        System.out.println(namaLengkap);

        // String text block
        String CeritaPanjang = """
                halo nama saya adalah
                aulia
                belajar di Binar Academy
                """;
        System.out.println(CeritaPanjang);
    }
}
