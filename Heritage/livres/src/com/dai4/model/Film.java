package com.dai4.model;

public class Film extends Livre{

    private int duree;

    public Film(String titre, String nomAuteur, float prix, int nbrePages, String propre, int duree) {
        super(titre, nomAuteur, prix, nbrePages, propre);
        this.duree = duree;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    @Override
    public String toString() {
        return "Film{" +
                "duree=" + duree +
                '}';
    }
}
