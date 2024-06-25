package latihan;

public class Manusia extends MahlukHidup {

    public Manusia(String nama) {
        super(nama, "Darat");
    }
    
    public void makan(int banyak) {
        this.berat = this.berat + banyak;
    }

    public void berjalan() {
        System.out.println(this.nama+" berjalan");
    }
    
    public void info() {
        System.out.println("Manusia");
        System.out.println("Nama: "+this.nama);
        System.out.println("Berat :"+this.berat);
        System.out.println("Tinggi:"+this.tinggi);
    }
}
