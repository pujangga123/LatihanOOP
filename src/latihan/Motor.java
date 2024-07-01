package latihan;

public class Motor extends Kendaraan{
    
    private int roda;
    
    public Motor(String nama, int x, int y) {
        super(nama);
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
    
    @Override
    public void tampilkanInfo() {
        System.out.print("Motor:");
        System.out.println(this.getNama());
        System.out.print("Lebar: ");
        System.out.println(this.getLebar());
        System.out.print("Panjang: ");
        System.out.println(this.getPanjang());
        System.out.print("Roda: ");
        System.out.println(this.roda);
    }
    
    
    
}
