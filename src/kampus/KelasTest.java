package kampus;

public class KelasTest {

    public static void main(String[] args) {
        Kelas kelas = new Kelas();

        // test TAMBAH
        kelas.kode = "A1";
        kelas.dosenNid = "111";
        kelas.status = "AKTIF";
        if (kelas.tambah()) {
            System.out.println("TAMBAH OK");
        } else {
            System.out.println("TAMBAH GAGAL");
            System.out.println(kelas.getErrMsg());
        }

        // test BACA
        kelas.baca("111");
        if (!kelas.kode.isEmpty()) {
            System.out.println("BACA OK");
        } else {
            System.out.println("BACA GAGAL");
            System.out.println(kelas.getErrMsg());
        }

        // test UPDATE
        kelas.status = "SELESAI";
        if (kelas.update()) {
            System.out.println("UPDATE OK");
        } else {
            System.out.println("UPDATE GAGAL");
            System.out.println(kelas.getErrMsg());
        }
    }
}
