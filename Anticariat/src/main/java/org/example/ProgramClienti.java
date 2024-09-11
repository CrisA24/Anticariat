package org.example;

import java.sql.Connection;
import java.sql.SQLException;
//Creez clasa ProgramClienti, instantiez obiectele de tip client si le adaug in tabela "clienti" cu ajutorul clasei InserareClienti
public class ProgramClienti {
    public static void main(String[] args) throws SQLException {

        Client C1 = new Client("Ionescu", "Maria", "0723456797", "maria.ionescu@gmail.com");
        Client C2 = new Client("Popescu", "Andrei", "0789345676", "Andrei.popescu@gmail.com");
        Client C3 = new Client("Gheorghe", "Alexandru", "078569007", "gheorghe.andrei@gmail.com");
        Client C4 = new Client("Ivan", "Andreea", "07689945", "andreea.ivan@gmail.com");

        Connection conexiune = ConexiuneDB.conexiune();

        InserareClienti.adaugaClient(conexiune, C1);
        InserareClienti.adaugaClient(conexiune, C2);
        InserareClienti.adaugaClient(conexiune, C3);
        InserareClienti.adaugaClient(conexiune, C4);

        CitireClienti.afiseazaTotiClientii();

    }
        }