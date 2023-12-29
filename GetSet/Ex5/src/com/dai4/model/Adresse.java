package com.dai4.model;

public class Adresse {

    private String rue;
    private int  codePostale;
    private String ville;

    public Adresse() {
    }

    public Adresse(String rue, int  codePostale, String ville) {
        this.rue = rue;
        this.codePostale = codePostale;
        this.ville = ville;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCodePostale() {
        return codePostale;
    }

    public void setCodePostale(int codePostale) throws Exception {
        if(codePostale<10000){
            throw new Exception("Le code postale n'est pas valide, veuillez introduire les 5 chiffre du code postale");
        }else if(codePostale>99999){
            throw new Exception("veuillez introduire les 5 chiffres du code postale");
        }else
        this.codePostale = codePostale;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) throws Exception {
        if (ville==null){
            throw new Exception("veuillez saisir le nom de la ville");
        }else
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "rue='" + rue + '\'' +
                ", codePostale=" + codePostale +
                ", ville='" + ville + '\'' +
                '}';
    }
}
