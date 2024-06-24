package latihan;

public class Perenang extends Manusia{
    public Perenang (String nama) {
        super(nama);
        System.out.println("- Olah raga: Renang");
    }
    
    public void berenang() {
        System.out.println(this.nama+ " berenang");
    }
}
