package com.mathys;

import java.util.Scanner;

public final class App {

    public static void main(String[] args) {

        System.out.println("Bienvenue dans le BlackJack du Casino Virtuelle !");
        System.out.println("Sélectionnez le nombre de jetons pour votre partie: ");
        Scanner sc = new Scanner(System.in);
        String choixJetons = sc.nextLine();
        int valeurJetons = Integer.parseInt(choixJetons);

        Joueur joueur1 = new Joueur("joueur 1", valeurJetons);

        joueur1.affichageJoueur();

    }
}
