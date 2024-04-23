package kampus;

import java.sql.*;

public class Mahasiswa {

    public String nim;
    public String nama;
    public String angkatan;
    public Double ipk;
    public Date lahirTanggal;
    public String lahirTempat;
    public String jurusan;


    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.ipk = 0.0;
    }

    public void baca(String nim) {
        // deklarasi variable yang bisa diakses di seluruh halaman
        Connection connection = null;
        ResultSet rs = null;

        try {
            String connectionURL = "jdbc:mysql://localhost/test";
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(connectionURL, "root", "");

            if (!connection.isClosed()) {
                // prepare select statement
                String sql = "SELECT * FROM mahasiswa";
                PreparedStatement st = connection.prepareStatement(sql);
                rs = st.executeQuery(sql);
                
                if(rs.next()) {
                    this.nim = rs.getString("nim");
                    this.nama = rs.getString("nama");
                    this.angkatan = rs.getString("angkatan");
                }
                
            }
        } catch (Exception ex) {
            System.out.println("Error "+ex.toString());
        }
    }

    public Boolean tambah() {
        // deklarasi variable yang bisa diakses di seluruh halaman
        Connection connection = null;
        ResultSet rs = null;

        try {
            String connectionURL = "jdbc:mysql://localhost/test";
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(connectionURL, "root", "");

            if (!connection.isClosed()) {
                // prepare select statement
                String sql = "INSERT INTO mahasiswa (nim,nama,nilai) values (?,?,?)";
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, this.nim);
                st.setString(2, this.nama);
                st.setInt(3, this.nilai);
                st.executeUpdate();
            }
            connection.close();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    // melakukan data dengan cara seperti tambah() dan baca(), memiliki redudansi
    // kode untuk membuat koneksi. Hal ini tidak efisien.
    // Masalah lain adalah, jika ada perubahan konfigurasi database (username/
    // password/database) maka perubahan harus dilakukan di banyak bagian.
    // Untuk mengatasi masalah ini, kita membuat class DatabaseTest, sehingga
    // setting dan perubahan konfigurasi database dilakukan di satu tempat.
    public Boolean hapus() {
        Connection connection = null;
        try {
            connection = DatabaseTest.connect();

            if (!connection.isClosed()) {
                // prepare select statement
                String sql = "DELETE FROM mahasiswa WHERE nim=?";
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, this.nim);
                st.executeUpdate();
            }
            connection.close();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
