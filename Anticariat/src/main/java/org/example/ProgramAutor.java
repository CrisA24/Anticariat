package org.example;

public class ProgramAutor {
    public static void main(String[] args) {

        Anticariat anticariat = new Anticariat();

        Autor autor1 = new Autor("Preda", "Marin", "Romana");
        Autor autor2 = new Autor(" De Balzac", "Honoré", "Franceza");
        Autor autor3 = new Autor("Eliade", "Mircea", "Romana");
        Autor autor4 = new Autor("Marcel", "Proust", "Franceza");
        Autor autor5 = new Autor("Charles", "Dickens", "Engleza");
        Autor autor6 = new Autor("Gabriel Garcia", "Marquez", "Spaniola");
        Autor autor7 = new Autor("Guillaume", "Musso", "Franceza");
        Autor autor8 = new Autor("Haruki", "Murakami", "Japoneza");

        anticariat.adaugaAutori(autor1);
        anticariat.adaugaAutori(autor2);
        anticariat.adaugaAutori(autor3);
        anticariat.adaugaAutori(autor4);
        anticariat.adaugaAutori(autor5);
        anticariat.adaugaAutori(autor6);
        anticariat.adaugaAutori(autor7);
        anticariat.adaugaAutori(autor8);

        anticariat.salveazaAutoriInFisier("Autori.txt");

        System.out.println("-------------------------------");

        //Afiseaza toti autorii cu o anumita nationalitate, sortandu-i după nume:
        anticariat.arataAutorDupaNationalitate("Franceza");

    }
}