package com.dai4.models;

public class Vehicule {

    private  String marque;
    private int dateAchat;
    private float prixDAchat;


    public Vehicule() {
    }

    public Vehicule(String marque, int dateAchat, float prixDAchat) {
        this.marque = marque;
        this.dateAchat = dateAchat;
        this.prixDAchat = prixDAchat;
    }

    public float calculePrix(int anneActuelle) throws Exception{
        if (anneActuelle<this.dateAchat){
            throw new Exception("La date actuelle est inférieur de la date d'achat");
        }
        int defAnne = anneActuelle-this.getDateAchat();
        this.setPrixDAchat((this.getPrixDAchat()*(1-0.01f))*defAnne);
        return this.getPrixDAchat();

    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(int dateAchat) {
        this.dateAchat = dateAchat;
    }

    public float getPrixDAchat() {
        return prixDAchat;
    }

    public void setPrixDAchat(float prixDAchat) {
        this.prixDAchat = prixDAchat;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "marque='" + marque + '\'' +
                ", dateAchat=" + dateAchat +
                ", prixDAchat=" + prixDAchat +
                '}';
    }

}
