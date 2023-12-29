package com.dai4.model;



public class BandeDessinee extends Livre{


    private Etat etat;


    public BandeDessinee(String titre, String nomAuteur, float prix, int nbrePages, String propre, Etat etat) {
        super(titre, nomAuteur, prix, nbrePages, propre);
        this.etat = etat;
    }

    public  void echangerBD(BandeDessinee bd ){
        if(this.getPrix()==bd.getPrix()){
            this.setPropre(bd.getPropre());
            bd.setPropre(this.getPropre());
            System.out.println("Le nouveau propriétaire du Bande dessinée"+bd +"est :"+bd.getPropre());
            System.out.println("Le nouveau propriétaire du Bande dessinée"+this.getClass() +"est :"+this.getPropre());
        }else
            System.out.println("La bande dessinée peut pas etre echanger");
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }


    @Override
    public String toString() {
        return "BandeDessinee{" +
                "etat=" + etat +
                '}';
    }
}
