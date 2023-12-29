package com.dai4;

import java.util.ArrayList;
import java.util.List;

public class Livre {
    private int codeBarre;
    private String auteur;
    private String nom;
    private int nbrPages;
    private double prix;
    private Theme theme;
    private String resume;
    private List<Personnage> personnage= new ArrayList<>();

    public Livre() {
    }

    public Livre(int codeBarre, String auteur, String nom, int nbrPages, double prix, Theme theme, String resume, List<Personnage> personnage) {
        this.codeBarre = codeBarre;
        this.auteur = auteur;
        this.nom = nom;
        this.nbrPages = nbrPages;
        this.prix = prix;
        this.theme = theme;
        this.resume = resume;
        this.personnage = personnage;
    }

    public int getCodeBarre() {
        return codeBarre;
    }

    public void setCodeBarre(int codeBarre) {
        this.codeBarre = codeBarre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrPages() {
        return nbrPages;
    }

    public void setNbrPages(int nbrPages) {
        this.nbrPages = nbrPages;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public List<Personnage> getPersonnage() {
        return personnage;
    }

    public void setPersonnage(List<Personnage> personnage) {
        this.personnage = personnage;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "codeBarre=" + codeBarre +
                ", auteur='" + auteur + '\'' +
                ", nom='" + nom + '\'' +
                ", nbrPages=" + nbrPages +
                ", prix=" + prix +
                ", theme=" + theme +
                ", resume='" + resume + '\'' +
                ", personnage=" + personnage +
                '}';
    }
}
