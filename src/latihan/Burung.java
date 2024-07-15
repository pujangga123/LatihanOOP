package latihan;

public class Burung {
    private int ketinggian;
    private int berat;
    
    public Burung() {
        this.ketinggian = 4;
        this.berat = 2;
    }
    
    public void terbang() {
        this.ketinggian += 1;
    }
    
    public void menukik() {
        this.ketinggian -= 1;
    }
    
    public void tampilkanData() {
        System.out.println("Posisi: "+this.ketinggian);
    }
}
