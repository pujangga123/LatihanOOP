package latihan;

public class MotorTest1 {
    public static void main(String[] args) {
        Motor m = new Motor("Yamaha", 1, 3); // objek m (class Motor) dibuat
        m.bergerak(3, 10);
        m.tampilkanInfo();
    }
}
