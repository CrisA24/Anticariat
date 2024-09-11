package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Definesc clasa Anticariat cu proprietatile de tip lista : carte, client, vanzare, autor
public class Anticariat {
    private List<Carte> carti;
    private List<Client> clienti;
    private List<Vanzare> vanzari;
    private List<Autor> autori;

    //Definesc constructorul Anticariat si initializez fiecare lista cu un Array gol
    public Anticariat() {
        this.carti = new ArrayList<>();
        this.clienti = new ArrayList<>();
        this.vanzari = new ArrayList<>();
        this.autori = new ArrayList<>();

    }

    //Creez metoda prin care adaug cartea in lista de carti
    public void adaugaCarte(Carte carte) {
        this.carti.add(carte);
    }

    //Creez metoda prin care adaug clienti in lista de clienti
    public void adaugaClienti(Client client) {
        this.clienti.add(client);
    }

    //Creez metoda prin care adaug autori in lista de autori
    public void adaugaAutori(Autor autor) {
        this.autori.add(autor);
    }

    //Creez metoda prin care adaug autori in lista de vanzari
    public void adaugaVanzare(Vanzare vanzare) {
        this.vanzari.add(vanzare);
    }

    //Creez metoda prin care afisez toate cartile
    public void afiseazaCarti() {
        for (Carte c : this.carti) {
            System.out.println(c);
        }
    }

    //Creez metoda prin care caut o carte dupa un anumit autor definit prin "String autor",
    //utilizand for each pentru a face cautarea
    public List<Carte> cautaCarteDupaAutor(String autor) {
        List<Carte> cartiGasite = new ArrayList<>();
        for (Carte carte : this.carti) {
            if (carte.getAutor().equals(autor)) {
                cartiGasite.add(carte);
            }
        }
        return cartiGasite;
    }

    //Creez metoda prin care caut o carte dupa un anumit titlu definit prin "String titlu",
    //utilizand for each pentru a face cautarea
    public List<Carte> cautaCarteDupaTitlu(String titlu) {
        List<Carte> cartiGasite = new ArrayList<>();
        for (Carte carte : this.carti) {
            if (carte.getTitlu().equals(titlu)) {
                cartiGasite.add(carte);
            }
        }
        return cartiGasite;
    }

    //Creez metoda prin care salvez cartile in fisierul "Carti.txt"
    // utilizand Buffered Writter si for each pentru a adauga fiecare carte si try-catch pentru a prinde erorile
    public void salveazaCartiInFisier(String numeFisier) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Carti.txt"))) {
            for (Carte carte : carti) {
                writer.write(carte.getTitlu() + "," + carte.getAutor() + "," + carte.getPret() + "," + carte.getStoc());
                writer.newLine();
            }
            System.out.println("Cartile au fost salvate in fișierul " + numeFisier);
        } catch (IOException e) {
            System.out.println("Eroare la salvarea cartillor: " + e.getMessage());
        }
    }


    //Metoda prin care caut cartile disponibile si preturile acestora ordonate crescator
    public void arataCartiDisponibile() {
        this
                .carti
                .stream()
                .filter(carte -> carte.getStoc().equalsIgnoreCase("disponibil"))
                .sorted(Comparator.comparingDouble(Carte::getPret))
                .forEach(System.out::println);
    }

    //Creez metoda prin care salvez autorii in fisierul "Autori.txt"
    // utilizand Buffered Writter si for each pentru a adauga fiecare carte
    public void salveazaAutoriInFisier(String numeFisier) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Autori.txt"))) {
            for (Autor autor : autori) {
                writer.write("Nume: " + autor.getNume() + "," + "Prenume: " + autor.getPrenume() + ","
                        + "Nationalitate: " + autor.getNationalitate());
                writer.newLine();
            }
            System.out.println("Autorii au fost salvati in fisierul " + numeFisier);
        } catch (IOException e) {
            System.out.println("Eroare la salvarea cartilor: " + e.getMessage());
        }
    }

    // Creez metoda pentru a afisa autorii filtrati si sortati iar rezultatele sunt colectate intr-o lista
    public void arataAutorDupaNationalitate(String nationalitate) {
        List<Autor> autoriFiltrati = this.autori.stream()
                .filter(autor -> autor.getNationalitate().equalsIgnoreCase(nationalitate))
                .sorted(Comparator.comparing(Autor::getNume))
                .collect(Collectors.toList());


        autoriFiltrati.forEach(autor -> System.out.println(autor.getNume() + " - " + autor.getNationalitate()));
    }

    //Creez metoda pentru a afisa vanzarile inregistrate
    public void afiseazaVanzari() {
        System.out.println("Vanzari inregistrate:");
        for (Vanzare vanzare : vanzari) {
            System.out.println("Client" + vanzare.getClient() +
                    ", Carte: " + vanzare.getCarte() +
                    ", Data: " + vanzare.getData() +
                    ", Cantitate: " + vanzare.getCantitate() +
                    ", Preț Total: " + vanzare.getPretTotal());
        }
    }

    //Creez metoda prin care caut un client dupa nume predefinit prin "String numeClient"
    public List<Client> cautaClientDupaNume(String numeClient) {
        List<Client> clientiGasiti = new ArrayList<>();
        for (Client client : this.clienti) {
            if (client.getNume().equals(numeClient)) {
                clientiGasiti.add(client);
            }
        }
        return clientiGasiti;
    }


}
