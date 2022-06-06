package com.company;

import java.util.Scanner;

public class Login {
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu();
    private String gebruikersNummer;
    private String wachtwoord;
    public void startLogin() {
        System.out.println("Welkom bij het login scherm.");
        System.out.println("Voer uw gebruikersnummer in: ");
        gebruikersNummer = scanner.nextLine();
        System.out.println("Voer uw wachtwoord in: ");
        wachtwoord = scanner.nextLine();

        if (wachtwoord.equals(DBF.getValue("Gebruikersnaam", gebruikersNummer, wachtwoord, "dbLogin"))){
            System.out.println("U bent succesvol ingelogd!");
            menu.startMenu();
        }
    }
}
