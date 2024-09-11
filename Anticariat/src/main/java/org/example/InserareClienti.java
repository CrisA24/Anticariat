package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Creez clasa InserareClienti cu metoda statica adaugaClient
public class InserareClienti {
    public static void adaugaClient(Connection conexiune, Client client) throws SQLException {
        //Definesc un obiect de tip conection con pentru conexiunea la baza de date
        Connection con = ConexiuneDB.conexiune();
        String sql = "INSERT INTO clienti (nume, prenume, telefon, email) VALUES (?, ?, ?, ?)";

        //creez un obiect de tip statement pentru a crea a comanda de inserare a elementelor in baza de date
        PreparedStatement statement = con.prepareStatement(sql);

        try (con; statement) {
            statement.setString(1, client.getNume());
            statement.setString(2, client.getPrenume());
            statement.setString(3, client.getTelefon());
            statement.setString(4, client.getEmail());
            statement.executeUpdate();
        }
    }
}

