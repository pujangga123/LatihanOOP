package kampus;  // rubah nama paket sesuai dengan paket yang Anda miliki

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Mahasiswa {

    public String nim;
    public String nama;
    public String alamat;
    public String angkatan;
    public Date lahirTanggal;
    public String lahirTempat;
    public String status;
    public String usersId;
    protected Double ipk;
    protected String errMsg = "";

    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.alamat = "";
        this.angkatan = "2024";
        this.lahirTanggal = null;
        this.lahirTempat = "";
        this.status = "AKTIF";
        this.usersId = "";
        this.ipk = 0.0;
    }

    public void baca(String nim) {
        // deklarasi variable yang bisa diakses di seluruh halaman
        Connection connection = null;
        ResultSet rs = null;

        try {
            connection = DatabaseTest.connect();

            if (!connection.isClosed()) {
                // prepare select statement
                String sql = "SELECT * FROM mahasiswa where nim=?";
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, nim);
                rs = st.executeQuery();

                if (rs.next()) {
                    this.nim = rs.getString("nim");
                    this.nama = rs.getString("nama");
                    this.alamat = rs.getString("alamat");
                    this.angkatan = rs.getString("angkatan");
                    this.lahirTanggal = rs.getDate("lahirTanggal");
                    this.lahirTempat = rs.getString("lahirTempat");
                    this.usersId = rs.getString("usersId");
                    this.status = rs.getString("status");
                    this.ipk = rs.getDouble("ipk");
                }

            }
        } catch (Exception ex) {
            this.errMsg = ex.toString();
        }
    }

    public boolean tambah() {
        // deklarasi variable yang bisa diakses di seluruh halaman
        Connection connection = null;

        try {

            connection = DatabaseTest.connect();

            if (!connection.isClosed()) {
                // prepare select statement
                String sql = "INSERT INTO mahasiswa (nim,nama,alamat, angkatan, lahirTanggal, lahirTempat, status, usersId, ipk) "
                        + "values (?,?,?,?,?,?,?,?,0)";
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, this.nim);
                st.setString(2, this.nama);
                st.setString(3, this.alamat);
                st.setString(4, this.angkatan);
                st.setDate(5, this.lahirTanggal);
                st.setString(6, this.lahirTempat);
                st.setString(7, this.status);
                st.setDouble(8, this.ipk);
                st.executeUpdate();
                connection.close();
                return true;
            }
            connection.close();
            this.errMsg = "Koneksi ke database gagal";
            return false;
        } catch (Exception ex) {
            this.errMsg = ex.toString();
            return false;
        }
    }

    public boolean update() {
        Connection connection = null;
        try {
            connection = DatabaseTest.connect();

            if (!connection.isClosed()) {
                // prepare select statement
                String sql = "UPDATE mahasiswa SET nama=?, alamat=?, angkatan=?, lahirTanggal=?, lahirTempat=?, status=?"
                        + "WHERE nim=?";
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, this.nama);
                st.setString(2, this.alamat);
                st.setString(3, this.angkatan);
                st.setDate(4, this.lahirTanggal);
                st.setString(5, this.lahirTempat);
                st.setString(6, this.status);

                st.setString(7, this.nim);

                st.executeUpdate();
                connection.close();
                return true;
            }
            connection.close();
            this.errMsg = "Koneksi ke database gagal";
            return false;
        } catch (Exception ex) {
            this.errMsg = ex.toString();
            return false;
        }
    }

    public void rekalkulasiIpk() {
        // lakukan perhitungan IPK
        // sementara pakai angka random dulu
        this.ipk = Math.random() * 4;
        
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
    
    static public List<Mahasiswa> getList() {
        // deklarasi variable yang bisa diakses di seluruh halaman
        Connection connection = null;
        ResultSet rs = null;
        List<Mahasiswa> result = new ArrayList<>();


        try {
            connection = DatabaseTest.connect();

            if (!connection.isClosed()) {
                // prepare select statement
                String sql = "SELECT * FROM mahasiswa";
                PreparedStatement st = connection.prepareStatement(sql);
                rs = st.executeQuery();

                while(rs.next()) {
                    Mahasiswa m = new Mahasiswa();
                    m.baca(rs.getString("nim"));
                    result.add(m);
                }                
            }
            return result;
        } catch (Exception ex) {
            return null;
        }
    }

    public Double getIpk() {
        return this.ipk;
    }

    public String getErrMsg() {
        return this.errMsg;
    }
}
