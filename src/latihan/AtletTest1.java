package latihan;

public class AtletTest1 {

    public static void main(String args[]) {
        Atlet a = new Atlet("Yudi");
        
        a.berjalan();
        a.berlari();
        a.makan(4);
        
        a.club = "FF";
        
        a.info();
        
    }
}
