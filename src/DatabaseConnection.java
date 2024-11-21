
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
        try {
            return DriverManager.getConnection("jdbc:sqlite:keuangan.db");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
