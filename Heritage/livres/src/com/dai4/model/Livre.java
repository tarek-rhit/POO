package com.dai4.model;

public class Livre {

    private String titre;
    private String nomAuteur;
    private float prix;
    private int nbrePages;
    private String propre;

    public Livre(String titre, String nomAuteur, float prix, int nbrePages,String propre) {
        this.titre = titre;
        this.nomAuteur = nomAuteur;
        this.prix = prix;
        this.nbrePages = nbrePages;

        this.propre=propre;
    }


    public void vendre( String prop) {
        if (this.propre.isEmpty()) {
            this.setPropre("prop");
            System.out.println("Ce livre est à vendre");
        } else if ( this.propre.equalsIgnoreCase("prop")){
            System.out.println("Le livre à un proprétaire");
        }else{
            System.out.println("Ce livre est à vendre");
        }
    }



    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getNbrePages() {
        return nbrePages;
    }

    public void setNbrePages(int nbrePages) {
        this.nbrePages = nbrePages;
    }

    public String getPropre() {
        return propre;
    }

    public void setPropre(String propre) {
        this.propre = propre;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", nomAuteur='" + nomAuteur + '\'' +
                ", prix=" + prix +
                ", nbrePages=" + nbrePages +
                ", propre='" + propre + '\'' +
                '}';
    }
}

