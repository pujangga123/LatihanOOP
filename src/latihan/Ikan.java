package latihan;


public class Ikan extends MahlukHidup {
    
    private String jenisAir;
    
    public Ikan(String nama, String jenisAir) {
        super(nama, "Air");
        this.jenisAir = jenisAir;
    }
}
