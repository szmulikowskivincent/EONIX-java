package org.example.Classe;

import java.util.List;

public class Singe {
    private final List<Tour> tours;

    public Singe(List<Tour> tours) {
        this.tours = tours;
    }

    public List<Tour> getTours() {
        return tours;
    }

    public void executerTour(Tour tour) {
        System.out.println("Le singe exécute le tour '" + tour.getNom() + "'");
    }
}

