package latihan;

public class Manusia extends MahlukHidup {
    int berat;
    int tinggi;
    String jeniskelamin;
    
    public Manusia(String nama) {
        super(nama);
        this.berat = (int)Math.round(Math.random() * 50 ) + 20;    
        this.tinggi = (int)Math.round(Math.random() * 120 ) + 90; 
        
        int jk = (int)Math.round(Math.random());
        if(jk==0) {
            this.jeniskelamin = "Laki-laki";
        } else {
            this.jeniskelamin = "Perempuan";
        }
        
        System.out.println(nama+" lahir");
    }
    
    public void perkenalan() {
        System.out.println(this.nama+" adalah manusia");
        System.out.println("- Jenis Kelamin: "+this.jeniskelamin);
        System.out.println("- Berat "+this.berat);
        System.out.println("- Tinggi "+this.tinggi);
    }
    
}
