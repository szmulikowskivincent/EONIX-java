package org.example;

import org.example.Classe.Dresseur;
import org.example.Classe.Singe;
import org.example.Classe.Spectateur;
import org.example.Classe.Tour;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Création des tours pour chaque singe
        Tour acrobatie1 = new Tour("Marcher sur les mains", Tour.Type.ACROBATIE);
        Tour acrobatie2 = new Tour("Faire un salto", Tour.Type.ACROBATIE);
        Tour musique1 = new Tour("Jouer du tambour", Tour.Type.MUSIQUE);
        Tour musique2 = new Tour("Siffler une chanson", Tour.Type.MUSIQUE);

        // Création des singes avec leur liste de tours
        Singe singe1 = new Singe(Arrays.asList(acrobatie1, musique1));
        Singe singe2 = new Singe(Arrays.asList(acrobatie2, musique2));

        // Création des dresseurs avec leurs singes respectifs
        Dresseur dresseur1 = new Dresseur(singe1);
        Dresseur dresseur2 = new Dresseur(singe2);

        // Création du spectateur
        Spectateur spectateur = new Spectateur();

        // Les dresseurs demandent à leurs singes d'exécuter les tours
        System.out.println("Dresseur 1 demande à son singe d'exécuter les tours:");
        for (Tour tour : dresseur1.singe().getTours()) {
            dresseur1.singe().executerTour(tour);
            spectateur.reagir(tour, 1);
        }

        System.out.println("\nDresseur 2 demande à son singe d'exécuter les tours:");
        for (Tour tour : dresseur2.singe().getTours()) {
            dresseur2.singe().executerTour(tour);
            spectateur.reagir(tour, 2);
        }
    }
}
