package com.dai4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Livre> livres = new ArrayList<>();
        Livre livre =new Livre();
        livre.setCodeBarre(00120);
        livre.setAuteur("Alix");
        livre.setNom("Chokolat");
        livre.setNbrPages(250);
        livre.setPrix(145.15);
        livre.setResume("Meilleur livre");
        livre.setTheme(Theme.amour);
        List<Personnage> personnage= new ArrayList<>();
        personnage.add(new Personnage("Steff", Role.Principale));
        personnage.add(new Personnage("Sony", Role.Secondaire));
        personnage.add(new Personnage("Naoufel", Role.Figurant));
        livre.setPersonnage(personnage);
        livres.add(livre);

        Livre livre1 =new Livre();
        livre1.setCodeBarre(00121);
        livre1.setAuteur("Naoufel");
        livre1.setNom("Fromage");
        livre1.setNbrPages(265);
        livre1.setPrix(156.25);
        livre1.setResume("Excellent livre");
        livre1.setTheme(Theme.policier);
        List<Personnage> p1= new ArrayList<>();
        p1.add(new Personnage("Mounir", Role.Principale));
        p1.add(new Personnage("Moussa", Role.Secondaire));
        p1.add(new Personnage("Andrea", Role.Principale));
        livre1.setPersonnage(p1);
        livres.add(livre1);

        Livre livre2 =new Livre();
        livre2.setCodeBarre(00122);
        livre2.setAuteur("Faker");
        livre2.setNom("Beure");
        livre2.setNbrPages(275);
        livre2.setPrix(189.99);
        livre2.setResume("Manefique livre");
        livre2.setTheme(Theme.tragidie);
        List<Personnage> p2= new ArrayList<>();
        p2.add(new Personnage("Naoufel", Role.Principale));
        p2.add(new Personnage("Moussa", Role.Secondaire));
        p2.add(new Personnage("Vectorine", Role.Principale));
        livre2.setPersonnage(p2);
        livres.add(livre2);


        Livre livre3 =new Livre();
        livre3.setCodeBarre(00123);
        livre3.setAuteur("Sony");
        livre3.setNom("Confiture");
        livre3.setNbrPages(235);
        livre3.setPrix(123.54);
        livre3.setResume("Trés Courageux livre");
        livre3.setTheme(Theme.policier);
        List<Personnage> p3= new ArrayList<>();
        p3.add(new Personnage("Naoufel", Role.Principale));
        p3.add(new Personnage("Moussa", Role.Secondaire));
        p3.add(new Personnage("Vectorine", Role.Principale));
        livre3.setPersonnage(p3);
        livres.add(livre3);


        Livre livre4 =new Livre();
        livre4.setCodeBarre(00126);
        livre4.setAuteur("Faker");
        livre4.setNom("Asperge");
        livre4.setNbrPages(268);
        livre4.setPrix(110.55);
        livre4.setResume("Magnefique livre");
        livre4.setTheme(Theme.scienceFiction);
        List<Personnage> p4= new ArrayList<>();
        p4.add(new Personnage("Naoufel", Role.Principale));
        p4.add(new Personnage("Moussa", Role.Secondaire));
        p4.add(new Personnage("Vectorine", Role.Principale));
        livre4.setPersonnage(p4);
        livres.add(livre4);

//afficher le theme policier
        for(int i=0;i<livres.size();i++){
            if(livres.get(i).getTheme().equals(Theme.policier)){
                System.out.println(livres.get(i));
            }

        }

        System.out.println("**************************************************************************************");
// afficher le livre max pages
        Livre maxNbrPages=livres.get(0);
        for(int i=0;i<livres.size();i++){
            if(livres.get(i).getNbrPages()> maxNbrPages.getNbrPages()){
                maxNbrPages=livres.get(i);
            }
        }
        System.out.println(maxNbrPages);


        System.out.println("**************************************************************************************");
///Q4 afficher les principaux et le nom
        for (int i =0; i<livres.size();i++){
            for (int j = 0; j <personnage.size() ; j++) {
                if(livres.get(i).getPersonnage().get(j).getRole() == (Role.Principale)) {
                    System.out.println(livres.get(i).getPersonnage().get(j).getNom());
            }

           }
            System.out.println(livres.get(i).getNom());
        }

        System.out.println("*********************************************************************************");
//Diminuer le prix des doublants     A B C C B B A
        //String tmp=livres.get(0).getAuteur();
        for (int i = 0; i < livres.size() ; i++) {
            for (int j = 1; j < livres.size(); j++) {
                if(livres.get(i).getAuteur().equals(livres.get(j).getAuteur())){
                    livres.get(j).setPrix((livres.get(j).getPrix()*(1-0.05)));
            }
          }

        }

        System.out.println(livres);

        System.out.println("*********************************************************************************");
//afficher liste auteurs et le nbrLivre + le prixTotal


        List<Ecrivain> auteurs = new ArrayList<>();
        /*
        J'ai : tableau livres qui contient : auteur prix
        le nouveau tab il va contenir pour chaque auteur nbrLivre + prix total des livres
         */

        for (int i = 0; i < livres.size(); i++) { // parcourir la liste des livres
            /*
            auteur à partir du livre .get(i)
            1- stocker le nom + 1 + prix => si le nom n'existe pas dans le tableau
            2- si le nom existe : récuperer l'objet à partir du nom, +1 , +prix
             */
            boucle chercher le nom dans le tableau
            if(nom n'existe pas'){
                Ecrivain e1= new Ecrivain();
                e1.setNom("Alix");
                e1.setNbrLivre(3);
                e1.setPrixTotal(389.75);
                auteurs.add(e1);
            }else{

            }

        }




        System.out.println(auteurs);
    }
}
