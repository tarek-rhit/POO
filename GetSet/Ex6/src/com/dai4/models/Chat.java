package com.dai4.models;

import java.util.List;

public class Chat {

    private String nom;
    private Race race;
    private String couleur;

    private float prix;
    private Adoption adoption;


    private List<Comportement> comportements;


    public Chat() {
    }

    public Chat(String nom, Race race, String couleur, float prix, Adoption adoption, List<Comportement> comportements) {
        this.nom = nom;
        this.race = race;
        this.couleur = couleur;
        this.prix = prix;
        this.adoption = adoption;
        this.comportements = comportements;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Adoption getAdoption() {
        return adoption;
    }

    public void setAdoption(Adoption adoption) {
        this.adoption = adoption;
    }

    public List<Comportement> getComportements() {
        return comportements;
    }

    public void setComportements(List<Comportement> comportements) {
        this.comportements = comportements;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "nom='" + nom + '\'' +
                ", race=" + race +
                ", couleur='" + couleur + '\'' +
                ", prix=" + prix +
                ", adoption=" + adoption +
                ", comportements=" + comportements +
                '}';
    }
}
