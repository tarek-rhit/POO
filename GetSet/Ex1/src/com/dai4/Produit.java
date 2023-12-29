package com.dai4;

public class Produit {

    private String codeBarre;
    private String titre;
    private String description;
    private float prix;
    private int qtte;

    public Produit() {
    }

    public Produit(String codeBarre, String titre, String description, float prix, int qtte) {
        this.codeBarre = codeBarre;
        this.titre = titre;
        this.description = description;
        this.prix = prix;
        this.qtte = qtte;
    }

    public String getCodeBarre() {
        return codeBarre;
    }

    public void setCodeBarre(String codeBarre) {
        this.codeBarre = codeBarre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getQtte() {
        return qtte;
    }

    public void setQtte(int qtte) {
        this.qtte = qtte;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "codeBarre='" + codeBarre + '\'' +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                ", qtte=" + qtte +
                '}';
    }
}
