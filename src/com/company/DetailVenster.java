package com.company;

public abstract class DetailVenster {

    public void getInformatie() {

        getVoorraad();

        if (getVoorraad() == true) {
            getHuurPrijs();
        }

        getVerhuurd();

        if (getVerhuurd() == true) {
            getMedewerker();
            getKlant();
            retour();
        }
    }

    abstract void getMedewerker();
    abstract void getKlant();
    abstract void retour();
    abstract void getHuurPrijs();
    abstract boolean getVerhuurd();

    boolean getVoorraad(){
     return true;
    }



}
