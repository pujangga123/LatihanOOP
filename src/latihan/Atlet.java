package latihan;

public class Atlet extends Manusia {
    
    protected String club;

    public Atlet(String nama) {
        super(nama);
        this.tinggi = 150;
        this.berat = 60;
    }
    
    public void berlari() {
        System.out.println(this.nama+" berlari");
    }
    
    @Override
    public void makan(int banyak) {
        this.berat = this.berat + banyak * 2;
    }

    
}
