/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;


public class Felis extends Mamalia {
    
    private Double berat;
    
    public Felis(String nama, Double berat) {
        super(nama);
        this.berat = berat;
    }
    
    public void makan(Double banyak) {
        this.berat = this.berat + banyak;
    }
    
    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Berat: "+berat);
    }
    
}
