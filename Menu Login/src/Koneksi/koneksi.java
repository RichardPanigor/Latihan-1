// Nama : Richard Panigor Sitompul
// Kelas : 2A-Sistem Informasi
// NIM : 11200930000025

package Koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private Connection koneksi;
    
    public Connection connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Berhasil Koneksi");
        } catch (ClassNotFoundException ex) {
            System.out.println("Gagal Koneksi" + ex);
        }
        
        String url ="jdbc:mysql://localhost:3306/latihan1";
        try {
            koneksi = DriverManager.getConnection(url,"root","");
            System.out.println("Berhasil Koneksi Database");
        } catch (SQLException ex){
            System.out.println("Gagal Koneksi Database" + ex);
        }
        return koneksi;
    }
    
}
