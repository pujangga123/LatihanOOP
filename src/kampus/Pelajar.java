/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kampus;

/**
 *
 * @author En Tay
 */
public class Pelajar extends Mahasiswa {
    
    public Double getScore() {
        return this.getIpk() * 10 / 4;
    }
    
}
