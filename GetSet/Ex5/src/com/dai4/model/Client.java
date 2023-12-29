package com.dai4.model;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String password;
    private float solde;

    private Etat etat;

    private List<Adresse> adresseList ;

    public Client() {
    }

    public Client(int id, String nom, String prenom, String email, String password, float solde, Etat etat, List<Adresse> adresseList) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.solde = solde;
        this.etat = etat;
        this.adresseList =  new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        if(email.isEmpty()){
            throw new Exception("veuillez saisir votre adress mail ");
        }else if(!email.contains("@")){
            throw new Exception("veuillez saisir votre adress mail valide ");
        }else
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws Exception {
        if(password.isEmpty()){
            throw new Exception("veuillez saisir votre mot de passe");
        }else if(!password.equals(this.password)){
            throw new Exception("veuillez saisir votre mot de passe valide");
        }else
        this.password = password;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public List<Adresse> getAdresseList() {
        return adresseList;
    }

    public void setAdresseList(List<Adresse> adresseList) {
        this.adresseList = adresseList;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", solde=" + solde +
                ", etat=" + etat +
                ", adresseList=" + adresseList +
                '}';
    }
}

