package com.dai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Donner le nombre d'enfant");
        int nbr = sc.nextInt();

        List<Enfant> enfants=new ArrayList<>();


        for (int i=0;i< nbr; i++){

            System.out.println("Veuillez sasir les données de l'enfant n°"+i);
            Enfant enfant = new Enfant();
            enfant.nom=sc.next();
            enfant.prenom=sc.next();
            enfant.anneeNaissance=sc.nextInt();

            System.out.println("Veuillez indiquer le nombre de juets de l'enfant n°"+i);
            int nbJouet = sc.nextInt();
            enfant.jouets=new ArrayList<>();
            for (int j=0;j<nbJouet;j++){


                Jouet jouet = new Jouet();
                jouet.name=sc.next();
                jouet.anneeFabrication=sc.nextInt();
                jouet.color=sc.next();

                enfant.jouets.add(jouet);


            }

            enfants.add(enfant);

        }
        for (int i=0; i< nbr;i++){
            System.out.println(enfants.get(i));
        }
    }
}
