package latihan;

public class Mamalia {
    private String nama;
    
    // constructor
    public Mamalia(String nama) {
        this.nama = nama;
        System.out.println(nama+" terlahir");
    }
    
    public void tampilkanData() {
        System.out.println("Nama: "+this.nama);
    }
}
