/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kampus;

/**
 *
 * @author En Tay
 */
public class DosenBaca1 {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.baca("4443432");
        if(!dosen.nid.equals("")) {
            System.out.println("NID: "+dosen.nid);
            System.out.println("Nama:"+dosen.nama);
        }
    }
}
