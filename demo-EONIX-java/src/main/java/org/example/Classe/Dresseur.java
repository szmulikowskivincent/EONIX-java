package org.example.Classe;

public record Dresseur(Singe singe) {

    public void demanderTours() {
        for (Tour tour : singe.getTours()) {
            singe.executerTour(tour);
        }
    }
}

