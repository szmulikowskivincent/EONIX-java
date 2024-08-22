package org.example.Classe;

public class Spectateur {
    public void reagir(Tour tour, int numeroSinge) {
        if (tour.getType() == Tour.Type.ACROBATIE) {
            System.out.println("Spectateur applaudit pendant le tour d'acrobatie '" + tour.getNom() + "' du singe " + numeroSinge);
        } else if (tour.getType() == Tour.Type.MUSIQUE) {
            System.out.println("Spectateur siffle pendant le tour de musique '" + tour.getNom() + "' du singe " + numeroSinge);
        }
    }
}

