package org.example.Classe;

public class Tour {
    public enum Type { ACROBATIE, MUSIQUE }

    private String nom;
    private Type type;

    public Tour(String nom, Type type) {
        this.nom = nom;
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public Type getType() {
        return type;
    }
}
