package org.example;

//Creez clasa utilitara GenereazaAnticariat cu metoda "genereaza" pentru a afisa obiectele de tip carte
// si obiectele de tip client
public class GenereazaAnticariat {

    public static Anticariat genereaza(){

        Anticariat anticariat = new Anticariat();

        Carte carte1= new Carte("Morometii","Marin Preda",45.99,"disponibil");
        Carte carte2= new Carte("Morometii2","Marin Preda",55.99,"disponibil");
        Carte carte3= new Carte("Maytrey","Mircea Eliade",56.89,"stoc redus");
        Carte carte4= new Carte("Iluzii Pierdute" ,"Honoré De Balzac",35.99,"stoc redus");
        Carte carte5= new Carte("In cautarea timpului pierdut","Marcel Proust",64.99,"disponibil");
        Carte carte6= new Carte("Marile speranțe","Charles Dickens",44.99,"disponibil");
        Carte carte7= new Carte("Un veac de singurătate","Gabriel Garcia Marquez",36.40,"indisponibil");
        Carte carte8= new Carte("Un apartament la Paris","Guillaume Musso",41.54,"disponibil");
        Carte carte9= new Carte("1Q84.V1","Haruki Murakami",33.96,"disponibil");
        Carte carte10= new Carte("1Q84.V2","Haruki Murakami",40.99,"indisponibil");
        Carte carte11= new Carte("1Q84.V3","Haruki Murakami",45.87,"stoc redus");

        anticariat.adaugaCarte(carte1);
        anticariat.adaugaCarte(carte2);
        anticariat.adaugaCarte(carte3);
        anticariat.adaugaCarte(carte4);
        anticariat.adaugaCarte(carte5);
        anticariat.adaugaCarte(carte6);
        anticariat.adaugaCarte(carte7);
        anticariat.adaugaCarte(carte8);
        anticariat.adaugaCarte(carte9);
        anticariat.adaugaCarte(carte10);
        anticariat.adaugaCarte(carte11);

        Client C1 = new Client("Ionescu", "Maria", "0723456797", "maria.ionescu@gmail.com");
        Client C2 = new Client("Popescu", "Andrei", "0789345676", "Andrei.popescu@gmail.com");
        Client C3 = new Client("Gheorghe", "Alexandru", "078569007", "gheorghe.andrei@gmail.com");
        Client C4 = new Client("Ivan", "Andreea", "07689945", "andreea.ivan@gmail.com");


        anticariat.adaugaClienti(C1);
        anticariat.adaugaClienti(C2);
        anticariat.adaugaClienti(C3);
        anticariat.adaugaClienti(C4);

        return anticariat;

    }
}
