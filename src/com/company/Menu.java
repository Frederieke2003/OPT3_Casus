package com.company;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);


    public void startMenu() {
        System.out.println("Welkom in het menu!");
        System.out.println("1- Overzicht");
        System.out.println("2- Beheer");
        System.out.println("3- Uitloggen");
        System.out.println("Maak uw keuze: ");
        String keuze = scanner.nextLine();

        if(keuze.equals("1")) {
            Overzicht overzicht = new Overzicht();
            overzicht.startOverzicht();
        }

        if (keuze.equals("2")) {
            Beheer beheer = new Beheer();
            beheer.startBeheer();
        }

        if (keuze.equals("3")) {
            System.out.println("U wordt uitgelogd, tot ziens!");
            System.exit(0);
        }
    }
}
