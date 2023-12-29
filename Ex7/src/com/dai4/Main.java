package com.dai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Donner le nombre des formateurs");
        int nbr = sc.nextInt();


        List<Formateur> formateurList = new ArrayList<>();

        for (int i =0;i < nbr; i++){
            System.out.println("Donner les infos du formateur n°"+i);
            Formateur formateur= new Formateur();
            formateur.prenom=sc.nextLine();
            formateur.nom=sc.nextLine();
            formateur.age=sc.nextInt();
            formateur.salaire=sc.nextFloat();

            System.out.println("Donner le nombre d'experience de ce formateur n°"+i);
            int nbrExp = sc.nextInt();
            for(int j=0;j< nbrExp;j++){
                Experience experience= new Experience();
                System.out.println("Donner le nombre d'entreprise de ce formateur n°"+i);
                int nbrEp = sc.nextInt();
                for (int k=0;k<nbrEp;k++){
                    Entreprise entreprise = new Entreprise();
                }


            }
        }
    }
}
