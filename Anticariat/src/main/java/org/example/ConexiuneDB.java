package org.example;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//Creez clasa ConexiuneDB
//Creez conexiunea la baza de date prin conectarea aplicatiei Java la MySQL folosind JDBC (Java Database Connectivity)
// via Maven si XAMPP

public class ConexiuneDB {

    //creez o  metoda pentru a stabili conexiunea la baza de date "bookstore"
    //port Apache 8080
    //port MySQL 3306
    public static Connection conexiune() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bookstore";
        String user = "root";
        String pass = "";

        return DriverManager.getConnection(url, user, pass);

    }
}

