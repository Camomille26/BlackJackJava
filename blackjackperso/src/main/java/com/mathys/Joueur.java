package com.mathys;

import java.util.Scanner;

public class Joueur {
    int jetons;
    String nomJoueur;

    public Joueur(String nomJoueur, int jetons) {
        this.jetons = jetons;
        this.nomJoueur = nomJoueur;
    }

    public void affichageJoueur() {
        System.out.println(jetons);
    }

}