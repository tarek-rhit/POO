package com.dai4;

import java.util.ArrayList;
import java.util.List;

public class Produit {
    String nom;
    float prix;
    String description;
    int qtt;


    List<Caracteristique> caracteristiques ;


    @Override
    public String toString() {
        return "Produit{" +
                "nom='" + nom + '\'' +
                ", prix=" + prix +
                ", description='" + description + '\'' +
                ", qtt=" + qtt +
                ", caracteristiques=" + caracteristiques +
                '}';
    }
}
