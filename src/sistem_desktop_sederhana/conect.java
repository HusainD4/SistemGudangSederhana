/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem_desktop_sederhana;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class conect {
    public static Connection Go() {
        try {
            MysqlDataSource m = new MysqlDataSource();
            m.setServerName("localhost"); 
            m.setDatabaseName("Gudang_Petani"); 
            m.setUser("root"); 
            m.setPassword(""); // Atau password yang sesuai
            m.setPortNumber(3307); // Periksa apakah MySQL mendengarkan pada port ini
            m.setServerTimezone("Asia/Jakarta"); 

            Connection C = m.getConnection();
            System.out.println("Koneksi sukses");
            return C;
        } catch (SQLException e) {
            System.err.println("Koneksi Gagal!\n" + e.getMessage());
        }
        return null;
    }
}
