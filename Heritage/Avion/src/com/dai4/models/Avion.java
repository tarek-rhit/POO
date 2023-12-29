package com.dai4.models;

public class Avion extends  Vehicule{

    private String typeMoteur;
    private int nbrHeursVol;



    public Avion(String marque, int dateAchat, float prixDAchat, String typeMoteur, int nbrHeursVol) {
        super(marque, dateAchat, prixDAchat);
        this.typeMoteur = typeMoteur;
        this.nbrHeursVol = nbrHeursVol;
    }

    @Override
    public float calculePrix(int anneActuelle) throws Exception{
        float newPrice=super.calculePrix(anneActuelle);
        if(this.getTypeMoteur().equalsIgnoreCase("helices")){
            newPrice-=(newPrice*0.1f)*(this.nbrHeursVol/100);
        }else{
            newPrice-= (newPrice*0.1f)*(this.nbrHeursVol/1_000);
        }
        if(newPrice<0){
            newPrice=0;
        }
        return newPrice ;
    }

    public String getTypeMoteur() {
        return typeMoteur;
    }

    public void setTypeMoteur(String typeMoteur) {
        this.typeMoteur = typeMoteur;
    }

    public int getNbrHeursVol() {
        return nbrHeursVol;
    }

    public void setNbrHeursVol(int nbrHeursVol) {
        this.nbrHeursVol = nbrHeursVol;
    }


    @Override
    public String toString() {
        return "Avion{" +
                "typeMoteur='" + typeMoteur + '\'' +
                ", nbrHeursVol=" + nbrHeursVol +
                '}';
    }
}
