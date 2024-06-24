package latihan;

abstract class MahlukHidup {
    protected String nama;
    
    public MahlukHidup(String nama) {
        this.nama = nama;
    }
    
    abstract void perkenalan();
    
    public void mati() {
        System.out.println(this.nama+" mati");
    }
}
