
package latihan;

abstract class MahlukHidup {

    protected String habitat;
    protected int berat;
    protected int tinggi;
    protected String nama;
    
    public MahlukHidup(String nama, String habitat) {
        this.nama = nama;
        this.habitat = habitat;
        System.out.println(this.nama+" terlahir di "+habitat);
    }
    
    public void gantiHabitat(String habitat) {
        this.habitat = habitat;
        System.out.println(this.nama+" berganti habitat ke "+habitat);
    }
    
    public void mati() {
        System.out.println(this.nama+" mati");
    }
}
