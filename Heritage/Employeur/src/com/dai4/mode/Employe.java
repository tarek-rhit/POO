package com.dai4.mode;

public class Employe {

    private int matricule;
    private String nom;
    private String prenom;

    private int indiceSalarial;
    private int multiplicaterSalaire=50;

    public Employe() {
    }

    public Employe(int matricule, String nom, String prenom, int indiceSalarial, int multiplicaterSalaire) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.indiceSalarial = indiceSalarial;
        this.multiplicaterSalaire = multiplicaterSalaire;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getIndiceSalarial() {
        return indiceSalarial;
    }

    public void setIndiceSalarial(int indiceSalarial) {
        this.indiceSalarial = indiceSalarial;
    }

    public int getMultiplicaterSalaire() {
        return multiplicaterSalaire;
    }

    public void setMultiplicaterSalaire(int multiplicaterSalaire) {
        this.multiplicaterSalaire = multiplicaterSalaire;
    }

    @Override
    public String toString() {
        return "employe{" +
                "matricule=" + matricule +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", indiceSalarial=" + indiceSalarial +
                ", multiplicaterSalaire=" + multiplicaterSalaire +
                '}';
    }

    public int salire(){
        return this.indiceSalarial*multiplicaterSalaire;


    }
}
