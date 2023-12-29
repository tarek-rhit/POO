package com.dai4.models;

public class Volaille {

    private int id;
    private int poids;

    public Volaille() {
    }

    public Volaille(int id, int poids) {
        this.id = id;
        this.poids = poids;
    }

    public float calculerPrixDuJour(){
        return
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    @Override
    public String toString() {
        return "Volaille{" +
                "id=" + id +
                ", poids=" + poids +
                '}';
    }
}
