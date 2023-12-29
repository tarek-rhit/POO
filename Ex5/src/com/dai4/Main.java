package com.dai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner sc = new Scanner(System.in);
        System.out.println("Donner le nombre du produit");
        int nbr = sc.nextInt();


        List<Produit> produits=new ArrayList<>();
        for (int i=0;i<nbr;i++){

            System.out.println("donner le infos du votre produit n°"+i);
            Produit produit = new Produit();
            produit.nom=sc.nextLine();
            produit.prix=sc.nextFloat();
            produit.description=sc.nextLine();
            produit.qtt=sc.nextInt();

            System.out.println("veuillez indiquer le nombre des caractéristique du produit n°"+i);
            int nbrCara=sc.nextInt();

            produit.caracteristiques=new ArrayList<>();

            for (int j=0;j<nbrCara;j++){

                Caracteristique carac = new Caracteristique();
                carac.name=sc.nextLine();
                carac.description=sc.nextLine();

                produit.caracteristiques.add(carac);
            }

            produits.add(produit);
        }
        for (int i=0;i<nbr;i++){
            System.out.println(produits.get(i));
        }
    }
}
