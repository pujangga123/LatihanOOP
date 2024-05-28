package kampus;

import java.sql.Connection;
import java.sql.PreparedStatement;

// class Mahasiswa kelas karyawan, turunan dari class Mahasiswa
public class Karyawan extends Mahasiswa {
    
    private int score;
    
    public int getScore() {
        return this.score;
    }
    
    public void rekalkulasiScore() {
       this.score = (int) Math.round(super.getIpk() * 100 / 4);
    }
    
    public void rekalkulasiIpk() {
        // perbedaan rumus perhitungan Ipk untuk kelas Karyawan
        this.ipk = Math.random() * 3 + 1; 
        
        Connection connection = null;
        try {
            connection = DatabaseTest.connect();

            if (!connection.isClosed()) {
                // prepare select statement
                String sql = "UPDATE mahasiswa SET ipk=?"
                        + "WHERE nim=?";
                PreparedStatement st = connection.prepareStatement(sql);
                st.setDouble(1, this.ipk);
                st.setString(2, this.nim);

                st.executeUpdate();
                connection.close();
            }
            connection.close();
            this.errMsg = "Koneksi ke database gagal";
        } catch (Exception ex) {
            this.errMsg = ex.toString();
        }
    }
    
}
