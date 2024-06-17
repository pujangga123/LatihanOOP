/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kampus;

/**
 *
 * @author Lenovo
 */
public class PesertaTest {

    public static void main(String[] args) {
        Peserta peserta = new Peserta();

        peserta.kelasKode = "A01";
        peserta.nim = "111";
        if (peserta.tambah()) {
            System.out.println("Tambah OK");
        } else {
            System.out.println("GAGAL: " + peserta.getErrMsg());
        }
        System.out.println();

        // baca data
        System.out.println("BACA DATA");
        if (peserta.baca("A01", "111")) {
            System.out.println(peserta.kelasKode + " " + peserta.nim + " " + peserta.kehadiran + " " + peserta.tugas + " " + peserta.ujian);
        } else {
            System.out.println("GAGAL BACA:"+peserta.getErrMsg());
        }

        System.out.println("UPDATE");
        peserta.kehadiran = 2.3;
        peserta.tugas = 3.2;
        peserta.ujian = 3.8;
        if (peserta.update()) {
            System.out.println("UPDATE OK");
        }
        System.out.println(peserta.kelasKode + " " + peserta.nim + " " + peserta.kehadiran + " " + peserta.tugas + " " + peserta.ujian);

    }
}
