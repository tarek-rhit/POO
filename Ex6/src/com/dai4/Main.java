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
        for (int i=0;i<nbr;i++) {

            System.out.println("donner le infos du votre produit n°" + i);
            Produit produit = new Produit();
            produit.nom=sc.nextLine();
            produit.prix=sc.nextFloat();
            produit.description=sc.nextLine();
            produit.stock=sc.nextInt();
            produit.color.nom=sc.nextLine();
            produit.color.codeCouleur=sc.nextLine();
            produit.categorie.libele=sc.nextLine();
            produit.categorie.image=sc.nextLine();


            System.out.println("veuillez indiquer le nombre des caractéristique du produit n°"+i);
            int nbrCara=sc.nextInt();

            produit.caracteristiqueList=new ArrayList<>();

            for (int j= 0;j<nbrCara;j++){

                Caracteristique caracteristique = new Caracteristique();

                caracteristique.name=sc.nextLine();
                caracteristique.description=sc.nextLine();

                produit.caracteristiqueList.add(caracteristique);
            }

            produits.add(produit);
        }

        for (int i=0;i<produits.size();i++){
            if(produits.get(i).color.nom.equalsIgnoreCase("Bleu")){
                System.out.println(produits.get(i));
            }
        }

        for (int i=0;i<produits.size();i++){
            for (int j=i+1;j<produits.size();j++){
                Produit produitTmp =produits.get(i);
                produits.set(i,produits.get(j));
                produits.set(j,produitTmp);
            }
        }
        System.out.println("le produit le plus cher est "+produits.get(0));
        System.out.println("le produit le moins cher est "+produits.get(produits.size()-1));

        float TOT=0;

        for (int i=0;i<produits.size();i++){
            TOT+=produits.get(i).prix*produits.get(i).stock;
        }

        System.out.println("le total est :"+TOT);

    }
}
