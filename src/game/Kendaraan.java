package game;
public class Kendaraan {
    String nama;
    String jenis;
    Double berat;
    Double panjang;
    Double lebar;
    
    public void maju(Double jarak) {
        System.out.println(this.nama+" maju sejauh"+jarak);
    }
    
}
