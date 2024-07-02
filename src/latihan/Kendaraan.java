package latihan;

// contoh abstraksi
// class abstract tidak bisa dibuat objek, tapi dia bisa diturunkan.
abstract class Kendaraan {
    
    // public & private menandakan jenis akses
    // merupakan penerapan dari prinsip encapsulation
    // fungsi/property public bisa diakses diluar class
    public int x;
    public int y;
    
    // fungsi/property private hanya bisa diakses dari dalam class
    // untuk membaca property private dibutuhkan fungsi
    private int panjang; // dibaca menggunakan fungsi getPanjang()
    private int lebar;   // dibaca menggunakan fungsi getLebar()
    private String nama;
    
    // constructor
    // method yang dijalankan ketika objek dibuat
    public Kendaraan(String nama) {
        // kata kunci: this
        // mengacu pada 'diri sendiri'.
        this.x = 0;  // mengacu pada property x yang dimiliki class ini
        this.y = 0;
        this.panjang = 0; // panjang adalah property private, bisa diakses dari dalam class
        this.lebar = 0;
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
    
    // disini 'bergerak' adalah method abstract
    // artinya, kalau class kendaraan di turunkan, maka class turunannya
    // harus mendefinisikan method 'bergerak'
    abstract public void bergerak(int moveX, int moveY);
    
    public void tampilkanInfo() {
        System.out.print("Kendaraan:");
        System.out.println(this.getNama());
    }
    
}
