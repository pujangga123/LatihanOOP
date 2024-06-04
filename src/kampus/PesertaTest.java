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
        peserta.nim = "1111";
        if(peserta.tambah()) {
            System.out.println("Tambah OK");
        } else {
            System.out.println("GAGAL: "+peserta.getErrMsg());
        }
    }
}
