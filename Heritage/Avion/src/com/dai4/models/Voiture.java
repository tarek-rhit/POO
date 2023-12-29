package com.dai4.models;

public class Voiture extends Vehicule{

    private int cylindre;
    private int nbrPortes;
    private int puissance;
    private float kilometrage;



    public Voiture(String marque, int dateAchat, float prixDAchat, int cylindre, int nbrPortes, int puissance, float kilometrage) {
        super(marque, dateAchat, prixDAchat);
        this.cylindre = cylindre;
        this.nbrPortes = nbrPortes;
        this.puissance = puissance;
        this.kilometrage = kilometrage;
    }

    @Override
    public float calculePrix(int anneActuelle) throws Exception{
        int defAnne = anneActuelle-this.getDateAchat();
        float newPrix = super.calculePrix(anneActuelle);
        int defKilo = (int) (this.getKilometrage() / 10000);
        if(defKilo>0){
            newPrix = (this.getPrixDAchat()*(1-0.05f))*defKilo;
        }

        if (this.getMarque().equalsIgnoreCase("FIAT")|| this.getMarque().equalsIgnoreCase("RENAULT")){
            newPrix = this.getPrixDAchat()*(1-0.10f);
        }

        return newPrix;
    }

    public int getCylindre() {
        return cylindre;
    }

    public void setCylindre(int cylindre) {
        this.cylindre = cylindre;
    }

    public int getNbrPortes() {
        return nbrPortes;
    }

    public void setNbrPortes(int nbrPortes) {
        this.nbrPortes = nbrPortes;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public float getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(float kilometrage) {
        this.kilometrage = kilometrage;
    }


    @Override
    public String toString() {
        return "Voiture{" +
                "cylindre=" + cylindre +
                ", nbrPortes=" + nbrPortes +
                ", puissance=" + puissance +
                ", kilometrage=" + kilometrage +
                '}';
    }
}
