
import java.sql.Connection; // Mengimpor kelas Connection dari paket java.sql, yang digunakan untuk membuat koneksi ke database.
import java.sql.DriverManager; // Mengimpor kelas DriverManager dari paket java.sql, yang digunakan untuk mengelola koneksi ke database dan memilih driver yang sesuai.
import java.sql.SQLException; // Mengimpor kelas SQLException dari paket java.sql, yang digunakan untuk menangani kesalahan terkait database, seperti kesalahan koneksi atau perintah SQL.

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class DatabaseConnection {
    // Mendeklarasikan metode statis connect() yang mengembalikan objek Connection.
    public static Connection connect() {
         // Inisialisasi variabel conn dengan nilai null. Variabel ini akan menyimpan koneksi ke database.
        Connection conn = null;
        try {
            // Memuat driver SQLite yang diperlukan untuk membuat koneksi ke database SQLite
            Class.forName("org.sqlite.JDBC");
            // Membuat koneksi ke database dengan menggunakan DriverManager dan URL database SQLite yang sesuai
            conn = DriverManager.getConnection("jdbc:sqlite:D:\\Documents\\SEMESTER 5\\PBO2\\MuhammadRiswanBadali-2210010039-UTS\\keuangan.db");
            // Menampilkan pesan jika koneksi berhasil dibuat
            System.out.println("Koneksi ke SQLite berhasil");
        } catch (ClassNotFoundException e) {
             // Menangani jika driver SQLite tidak ditemukan
            System.out.println("Driver SQLite tidak ditemukan: " + e.getMessage());
        } catch (SQLException e) {
             // Menangani jika terjadi kesalahan dalam membuat koneksi ke database SQLite
            System.out.println("Gagal terhubung ke database SQLite: " + e.getMessage());
        }
         // Mengembalikan objek Connection, yang dapat digunakan untuk menjalankan query SQL
        return conn;
    }
}
