package com.company;

public class DVAuto extends DetailVenster{
    boolean verzekering = true;
    double verzekeringsPrijs = 20.00;

    @Override
    void getMedewerker() {
        System.out.println("Medewerker Voornaam " + "Medewerker Achternaam");
    }

    @Override
    void getKlant() {
        System.out.println("Klant voornaam " + "Klant achternaam");
    }

    @Override
    void retour() {
        System.out.println("Deze auto is niet geretourneerd");
    }

    @Override
    void getHuurPrijs() {
       if (verzekering == true) {
           System.out.println("De huurprijs van een personen auto per dag is: €" + (verzekeringsPrijs + 60.00));
       }

       else {
           System.out.println("De huurprijs van een personen auto per dag is: €" + 60.00);
       }
    }

    @Override
    boolean getVerhuurd() {
        return true;
    }
}
