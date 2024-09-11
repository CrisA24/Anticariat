package org.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

//Creez clasa ProgramVanzari in care generez elemente din anticariat

public class ProgramVanzari {
    public static void main(String[] args) throws SQLException {

        Anticariat anticariat = GenereazaAnticariat.genereaza();
        Scanner scanner = new Scanner(System.in);
        Date dataVanzare = new Date();


//Creaza o comanda  de carte utilizand inputul de la utilizator si afisez comanda + pretul total

        int nrClientiGasiti = 0;
        String numeClient = "";

        while (nrClientiGasiti == 0) {
            System.out.print("Introdu numele clientului: ");
            numeClient = scanner.next();
            nrClientiGasiti = anticariat.cautaClientDupaNume(numeClient).size();
        }
        Client clientCautat = anticariat.cautaClientDupaNume(numeClient).getFirst();

        int nrCartiGasite = 0;
        String titlu = "";

        while (nrCartiGasite == 0) {
            System.out.print("Introdu cartea dorita: ");
            titlu = scanner.next();
            nrCartiGasite = anticariat.cautaCarteDupaTitlu(titlu).size();
        }
        Carte carteCautata = anticariat.cautaCarteDupaTitlu(titlu).getFirst();

        System.out.print("Introdu cantitatea: ");
        int cantitate = scanner.nextInt();

        Double pretTotal = cantitate * carteCautata.getPret();

        System.out.println("Comanda dumneavoastra este : " + titlu + ", " + "cantitate : " + cantitate + ", "
                + "la pretul de : " + pretTotal + " in data de : " + dataVanzare);

        scanner.close();

        //Instantiez un obiect nou de tip vanzare , adaug vanzarea in lista de vanzari si apoi o afisez
        Vanzare vanzare = new Vanzare(clientCautat, carteCautata, dataVanzare, cantitate, pretTotal);

        anticariat.adaugaVanzare(vanzare);
        anticariat.afiseazaVanzari();

        //Creez connexiunea cu baza de date iar apoi le voi salva in tabelul "vanzari"
        Connection conexiune = ConexiuneDB.conexiune();

        InserareVanzari.adaugaVanzariInDB(conexiune, new Vanzare(clientCautat, carteCautata, dataVanzare, cantitate, pretTotal));
    }
}