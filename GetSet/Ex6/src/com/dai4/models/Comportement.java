package com.dai4.models;

public class Comportement {

    private String name;
    private String description;
    private Etat etat;

    public Comportement() {
    }

    public Comportement(String name, String description, Etat etat) {
        this.name = name;
        this.description = description;
        this.etat = etat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Comportement{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", etat=" + etat +
                '}';
    }
}
