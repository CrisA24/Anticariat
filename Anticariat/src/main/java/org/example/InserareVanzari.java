package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserareVanzari {
    public static void adaugaVanzariInDB(Connection conexiune, Vanzare vanzare) throws SQLException {
        Connection con = ConexiuneDB.conexiune();
        String sql = "INSERT INTO vanzari (client, titlu, data, cantitate, pret_total) VALUES (?, ?, ?, ?,?)";

        PreparedStatement statement = con.prepareStatement(sql);

        try (con; statement) {
            statement.setString(1, String.valueOf(vanzare.getClient()));
            statement.setString(2, String.valueOf(vanzare.getCarte()));
            statement.setString(3, String.valueOf(new java.sql.Date(vanzare.getData().getTime())));
            statement.setString(4, String.valueOf(vanzare.getCantitate()));
            statement.setString(5, String.valueOf(vanzare.getPretTotal()));

            statement.executeUpdate();

        }
    }
}

