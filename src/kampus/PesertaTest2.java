package kampus;

import java.util.List;

public class PesertaTest2 {
    public static void main(String[] args) {
        List<Peserta> daftar = Peserta.getList("A1");
        
        for(Peserta row:daftar) {
            System.out.println(row.nim + " " + row.getMahasiswaNama());
        }
    }
}
