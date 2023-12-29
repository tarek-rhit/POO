package com.dai4;

import java.util.List;

public class Enfant {

    String nom;
    String prenom;
    int anneeNaissance;


    List<Jouet> jouets;

    @Override
    public String toString() {
        return "Enfant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", anneeNaissance=" + anneeNaissance +
                ", jouets=" + jouets +
                '}';
    }
}
