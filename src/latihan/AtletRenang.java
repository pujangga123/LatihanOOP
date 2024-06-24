package latihan;

public class AtletRenang extends Perenang {
    protected String klub;

    public AtletRenang(String nama, String klub) {
        super(nama);
        this.klub = klub;
    }
    
    @Override
    public void berenang() {
        System.out.println(this.nama+" berenang sangat cepat");
    }
    
    @Override
    public void perkenalan() {
        super.perkenalan();
        System.out.println("- Klub: "+this.klub);
    }
}
