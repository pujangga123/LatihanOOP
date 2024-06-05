/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kampus;

/**
 *
 * @author En Tay
 */
public class UsersDosenTest {
    public static void main(String[] args) {
        UsersDosen o = new UsersDosen();
        
        o.id = "1111";
        o.tipe = "DOSEN";
        o.status = "AKTIF";
        if(o.tambah()) {
            System.out.println("TAMBAH OK");
        } else {
            System.out.println("GAGAL");
        }
        
        
    }
}
