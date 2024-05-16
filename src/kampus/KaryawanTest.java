/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kampus;

/**
 *
 * @author Lenovo
 */
public class KaryawanTest {
    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan();
        
        // test TAMBAH
        karyawan.nim = "222";
        karyawan.nama = "GUNAWAN";
        karyawan.alamat = "JALAN ABC";
        if(karyawan.tambah()) {
            System.out.println("TAMBAH OK");
        } else {
            System.out.println(karyawan.getErrMsg());
        }
        
        // test BACA
        karyawan.baca("222");
        if(!karyawan.nim.isEmpty()) {
            System.out.println("BACA OK");
            System.out.println(karyawan.nim+" "+karyawan.nama+" "+karyawan.status);
            System.out.println("Rekalkulasi");
            karyawan.rekalkulasiIpk();
            karyawan.rekalkulasiScore();
            System.out.println("Score " + karyawan.getScore());
        } else {
            System.out.println("BACA GAGAL");
        }
        
        // test UPDATE
        karyawan.nama = "GUNAWAN UTOMO";
        karyawan.alamat = "JALAN LEUWIPANJANG";
        if(karyawan.update()) {
            System.out.println("UPDATE OK");
        } else {
            System.out.println(karyawan.getErrMsg());
        }
    }
}
