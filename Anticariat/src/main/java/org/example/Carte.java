package org.example;
////definesc clasa Carte si o encapsulez cu proprietatile private titlu, autor, pret, stoc
public class Carte {
    private String titlu;
    private String autor;
    private double pret;
    private String stoc;

    ///Creez constructorul pentru Carte cu parametrii titlu, autor, pret, stoc
    public Carte(String titlu, String autor, double pret, String stoc) {
        this.titlu = titlu;
        this.autor = autor;
        this.pret = pret;
        this.stoc = stoc;
    }

    //Aplic metoda toString
    public String toString() {
        return "Carte{titlu='" + this.titlu + "', autor='" + this.autor + "', pret=" + this.pret + ", stoc='" + this.stoc + "'}";
    }

    public String getTitlu() {
        return this.titlu;
    }

    public String getAutor() {
        return this.autor;
    }

    public double getPret() {
        return this.pret;
    }

    public String getStoc() {
        return this.stoc;
    }
}
