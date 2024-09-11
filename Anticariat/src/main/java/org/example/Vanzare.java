package org.example;

import java.util.Date;
//definesc clasa Vanzare si o encapsulez cu proprietatile private client, carte, data, cantitate, pretTotal
public class Vanzare {
    private Client client;
    private Carte carte;
    private Date data;
    private int cantitate;
    private double pretTotal;

////Creez constructorul utilizand toti parametrii
    public Vanzare(Client client, Carte carte, Date data, int cantitate, double pretTotal) {
        this.client = client;
        this.carte = carte;
        this.data = data;
        this.cantitate = cantitate;
        this.pretTotal = pretTotal;
    }

    //creez getters pentru fiecare proprietate
    public Client getClient() {
        return client;
    }

    public Carte getCarte() {
        return carte;
    }

    public Date getData() {
        return data;
    }

    public int getCantitate() {
        return cantitate;
    }

    public double getPretTotal() {
        return pretTotal;
    }

}