/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kampus;

/**
 *
 * @author En Tay
 */
public class DosenUpdate1 {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.baca("4443432");
        dosen.status = "AKTIF";
        dosen.update();
        System.out.println("OK");
    }
}
