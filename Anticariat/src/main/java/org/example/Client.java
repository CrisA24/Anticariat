package org.example;

public class Client {
    private String nume;
    private String prenume;
    private String telefon;
    private String email;

    public Client(String nume, String prenume, String telefon, String email) {
        this.nume = nume;
        this.prenume = prenume;
        this.telefon = telefon;
        this.email = email;
    }

    public String toString() {
        return "Clienti{nume='" + this.nume + "', prenume='" + this.prenume + "', telefon='" + this.telefon + "', email='" + this.email + "'}";
    }

    public String getNume() {
        return this.nume;
    }

    public String getPrenume() {
        return this.prenume;
    }

    public String getTelefon() {
        return this.telefon;
    }


    public String getEmail() {
        return this.email;
    }



}

