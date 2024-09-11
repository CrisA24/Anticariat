package org.example;

import java.sql.*;

//Creez clasa Citire Clienti
public class CitireClienti {

    //creez metoda pentru afisarea tuturor clientilor din baza de date din tabelul "clienti"
    public static void afiseazaTotiClientii () throws SQLException {
        //creez un obiect de tipul Connection conxiune prin care obtin conexiunea la baza de date "bookstore"
        Connection conexiune = ConexiuneDB.conexiune();

        String sql = "SELECT * FROM clienti";
        PreparedStatement statement = conexiune.prepareStatement(sql);
        try (conexiune; statement) {
            ResultSet rezultat = statement.executeQuery(sql);
            System.out.println("Clienti inregistrati:");
            while (rezultat.next()) {
                System.out.println("Nume: " + rezultat.getString("nume") +
                        ", Prenume: " + rezultat.getString("prenume") + ", Telefon: " + rezultat.getString("telefon") +
                        ", Email: " + rezultat.getString("email"));
            }
        }
    }
}