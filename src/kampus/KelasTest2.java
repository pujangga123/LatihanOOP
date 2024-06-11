/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package kampus;

/**
 *
 * @author Lenovo
 */
public class KelasTest2 {
    public static void main(String[] args) {
        Kelas kelas = new Kelas();
        kelas.baca("A01");
        kelas.pesertaTambah("1111");
        
        
        Peserta peserta = new Peserta();
        peserta.kelasKode = "A01";
        peserta.nim = "1111";
        peserta.tambah();
    }
    
}
