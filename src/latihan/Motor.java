package latihan;

// contoh penerapan prinsip inheritance
// class Motor diturunkan dari class Kendaraan
public class Motor extends Kendaraan{
    
    private int roda;
    
    // constructor
    public Motor(String nama, int x, int y) {
        // super --> mengacu pada class parent
        super(nama); // bagian ini, menjalankan constructor parent (Kendaraan)
        this.x = x;
        this.y = y;
        
        this.roda = 2;
        
        System.out.println("Motor "+nama+" dibuat");
    }

    @Override
    public void bergerak(int moveX, int moveY) {
        this.x = moveX;
        this.y = moveY;
        System.out.println("Bergerak");
    }
    
    // penerapan prinsip polymorphism
    // class turunan bisa memiliki method yang sama dengan parent
    // tapi dengan kode yang berbeda
    @Override
    public void tampilkanInfo() {
        System.out.print("Motor:");
        // property private nama (dari class Kendaraan) hanya bisa dibaca menggunakan fungsi
        System.out.println(this.getNama()); 
        System.out.print("Lebar: ");
        System.out.println(this.getLebar());
        System.out.print("Panjang: ");
        System.out.println(this.getPanjang());
        System.out.print("Roda: ");
        // property private roda masih bisa dibaca dari dalam class
        System.out.println(this.roda);  
    }
    
    
    
}
