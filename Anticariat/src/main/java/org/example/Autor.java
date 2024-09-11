package org.example;
//definesc clasa Autor si o encapsulez cu proprietatile private nume, prenume, nationalitate
public class Autor {
    private String nume;
    private String prenume;
    private String nationalitate;

    //Creez constructorul pentru autor cu parametrii nume, prenume, nationalitate
    public Autor(String nume, String prenume, String nationalitate) {
        this.nume = nume;
        this.prenume = prenume;
        this.nationalitate = nationalitate;
    }
//creez getters si aplic metoda "toString"
    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }


    public String getNationalitate() {
        return nationalitate;
    }


    @Override
    public String toString() {
        return this.nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", nationalitate='" + nationalitate + '\'' +
                '}';
    }
}
