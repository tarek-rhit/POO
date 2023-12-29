package com.dai4;

public class Ecrivain {

    private String nom;
    private int nbrLivre;
    private double prixTotal;

    public Ecrivain() {
    }

    public Ecrivain(String nom, int nbrLivre, double prixTotal) {
        this.nom = nom;
        this.nbrLivre = nbrLivre;
        this.prixTotal = prixTotal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrLivre() {
        return nbrLivre;
    }

    public void setNbrLivre(int nbrLivre) {
        this.nbrLivre = nbrLivre;
    }

    public double getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(double prixTotal) {
        this.prixTotal = prixTotal;
    }

    @Override
    public String toString() {
        return "Ecrivain{" +
                "nom='" + nom + '\'' +
                ", nbrLivre=" + nbrLivre +
                ", prixTotal=" + prixTotal +
                '}';
    }
}
