
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class DatabaseConnection {
    public static Connection connect() {
        Connection conn = null;
        try {
            // Muat driver SQLite
            Class.forName("org.sqlite.JDBC");
            // Buat koneksi ke database
            conn = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite3\\keuangan.db");
            System.out.println("Koneksi ke SQLite berhasil");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver SQLite tidak ditemukan: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Gagal terhubung ke database SQLite: " + e.getMessage());
        }
        return conn;
    }
}
