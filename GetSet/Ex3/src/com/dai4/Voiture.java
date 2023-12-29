package com.dai4;

import java.util.ArrayList;
import java.util.List;

public class Voiture {

    private String marque;
    private String color;
    private String matricule;
    private String vitesseMax;

    private List<Conducteur> conducteurs = new ArrayList<>();

    public Voiture() {
    }

    public Voiture(String marque, String color, String matricule, String vitesseMax, List<Conducteur> conducteurs) {
        this.marque = marque;
        this.color = color;
        this.matricule = matricule;
        this.vitesseMax = vitesseMax;
        this.conducteurs = conducteurs;
    }


    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(String vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    public List<Conducteur> getConducteurs() {
        return conducteurs;
    }

    public void setConducteurs(List<Conducteur> conducteurs) {
        this.conducteurs = conducteurs;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "marque='" + marque + '\'' +
                ", color='" + color + '\'' +
                ", matricule='" + matricule + '\'' +
                ", vitesseMax='" + vitesseMax + '\'' +
                ", conducteurs=" + conducteurs +
                '}';
    }
}


