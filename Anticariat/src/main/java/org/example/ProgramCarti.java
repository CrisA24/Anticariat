package org.example;

import java.util.List;

/*Aplicatia de Gestionare a Cartilor dintr-un Anticariat permite  inregistrarea cartilor, clientilor si autorilor.
Gestionarea vanzarilor si a stocurilor.
Cautarea cartilor dupa titlu sau autor.
Salvarea datelor intr-un fisier/Baza de date.
Citirea datelor de la tastatura pentru gestionarea cartilor*/


public class ProgramCarti {
    public static void main(String[] args) {


        Anticariat anticariat = GenereazaAnticariat.genereaza();

        anticariat.salveazaCartiInFisier("Carti.txt");

        System.out.println("----------------------------");

        System.out.println("Afiseaza toate cartile :");
        anticariat.afiseazaCarti();

        System.out.println("----------------------------");

        System.out.println("Cartea cautata dupa autor este :");
        List<Carte> carti= anticariat.cautaCarteDupaAutor("Mircea Eliade");
        System.out.println(carti);

        System.out.println("----------------------------");

        System.out.println("Cartea cautata dupa titlu este :");
       List<Carte> carti2= anticariat.cautaCarteDupaTitlu("Morometii");
        System.out.println(carti2);

        System.out.println("----------------------------");

        System.out.println("Cartile disponibile sunt : ");
        anticariat.arataCartiDisponibile();

    }
}
