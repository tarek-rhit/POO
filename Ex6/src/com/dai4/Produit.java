package com.dai4;

import java.util.List;

public class Produit {
    String nom;
    float prix;
    String description;
    int stock;

    Categorie categorie;
    Couleur color;
    List<Caracteristique> caracteristiqueList;

    @Override
    public String toString() {
        return "Produit{" +
                "nom='" + nom + '\'' +
                ", prix=" + prix +
                ", description='" + description + '\'' +
                ", stock=" + stock +
                ", categorie=" + categorie +
                ", color=" + color +
                ", caracteristiqueList=" + caracteristiqueList +
                '}';
    }
}
