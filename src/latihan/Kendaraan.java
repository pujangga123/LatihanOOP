package latihan;

abstract class Kendaraan {
    // posisi
    public int x;
    public int y;
    
    private int panjang;
    private int lebar;
    private String nama;
    
    public Kendaraan(String nama) {
        this.x = 0;
        this.y = 0;
        this.panjang = panjang;
        this.lebar = lebar;
        this.nama = nama;
        
    }
    
    public int getLebar() {
        return this.lebar;
    }
    
    public int getPanjang() {
        return this.panjang;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    abstract public void bergerak(int moveX, int moveY);
    
    public void tampilkanInfo() {
        System.out.print("Kendaraan:");
        System.out.println(this.getNama());
    }
    
}
