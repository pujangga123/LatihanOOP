package kampus;

import java.util.List;
import java.util.ArrayList;

public class KelasTest {

    public static void main(String[] args) {
        Kelas kelas = new Kelas();
        
        //mempersiapkan data mahasiswa 
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nim = "222";
        mahasiswa.nama = "GEGES";
        mahasiswa.tambah();
        
        //mempersiapkan data dosen
        Dosen dosen = new Dosen();
        dosen.nid = "2222";
        dosen.nama = "GUNAWAN";
        dosen.status = "AKTIF";
        dosen.tambah();

        // test TAMBAH
        kelas.kode = "A02";
        kelas.dosenNid = "2222";
        kelas.status = "AKTIF";
        if (kelas.tambah()) {
            System.out.println("TAMBAH OK");
        } else {
            System.out.println("TAMBAH GAGAL");
            System.out.println(kelas.getErrMsg());
        }

        // test BACA
        kelas.baca("A02"); // 
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
        
        // tambah peserta
        if(kelas.pesertaTambah("222")) {
            System.out.println("TAMBAH PESERTA OK");
        } else {
            System.out.println("TAMBAH PESERTA GAGAL: "+kelas.getErrMsg());
        }
        
        System.out.println("MENAMPILKAN DAFTAR PESERTA KELAS A02");
        List<Peserta> daftar = kelas.getListPeserta();
        for(Peserta row: daftar) {
            System.out.println(row.nim+" "+row.getMahasiswaNama()+" "+row.kehadiran+" "+row.tugas+" "+row.ujian);
        }
    }
}
