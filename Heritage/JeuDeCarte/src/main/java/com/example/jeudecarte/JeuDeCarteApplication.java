package com.example.jeudecarte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class JeuDeCarteApplication {

    private static final List<String> COULEURS = Arrays.asList("Carreaux", "Coeur", "Pique", "Trèfle");
    private static final List<String> VALEURS = Arrays.asList("As", "5", "10", "8", "6", "7", "4", "2", "3", "9", "Dame", "Roi", "Valet");

    public static void main(String[] args) {
        SpringApplication.run(JeuDeCarteApplication.class, args);

        /* Construction de l'ordre aléatoire des couleurs **/
        List<String> ordreCouleurs = new ArrayList<>(COULEURS);
        Collections.shuffle(ordreCouleurs);

        /* Construction de l'ordre aléatoire des valeurs **/
        List<String> ordreValeurs = new ArrayList<>(VALEURS);
        Collections.shuffle(ordreValeurs);

        /* Construction de la main de 10 cartes **/
        List<Carte> main = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String couleur = ordreCouleurs.get(i % COULEURS.size());
            String valeur = ordreValeurs.get(i % VALEURS.size());
            Carte carte = new Carte(couleur, valeur);
            main.add(carte);
        }

        /* Affichage de la main non triée **/
        System.out.println("Main non triee :");
        for (Carte carte : main) {
            System.out.println(carte);
        }
        System.out.println("***********************************************juste pour sépare******************************************************");

        /* Tri de la main selon l'ordre défini **/
        Collections.sort(main);

        System.out.println("******************************************juste pour séparer *********************************************************");
        /* Affichage de la main triée **/
        System.out.println("Main triee :");
        for (Carte carte : main) {
            System.out.println(carte);
        }
    }

        /*
         *C'est la classe carte qui posséde deux attributs couleur et valeur
         * J'ai implémenter l'interface comprable dans cette classe pour pouvoir faire le trie des cartes pour obtenir la main triée et une main non triée
         * **/
        public static class Carte implements Comparable<Carte> {
            private String couleur;
            private String valeur;

            /* Le constructeur parametré **/
            public Carte(String couleur, String valeur) {
                this.couleur = couleur;
                this.valeur = valeur;
            }

            /* Les getters et setters des attributs de la classe **/
            public String getCouleur() {
                return couleur;
            }

            public String getValeur() {
                return valeur;
            }


            /*
            J'ai utilisé la méthode de l'interface Comparable qui compare la carte courante avec une autre carte en se basant sur l'ordre défini par
            les couleurs et les valeurs. Cette méthode est utilisée pour trier les cartes.
            **/
            @Override
            public int compareTo(Carte autreCarte) {
                int comparaisonCouleur = COULEURS.indexOf(this.couleur) - COULEURS.indexOf(autreCarte.getCouleur());
                if (comparaisonCouleur == 0) {
                    return VALEURS.indexOf(this.valeur) - VALEURS.indexOf(autreCarte.getValeur());
                }
                return comparaisonCouleur;
            }

            /* La méthode toString pour afficher tout l'objet " Carte"**/
            @Override
            public String toString() {
                return valeur + " de " + couleur;
            }
        }
    }









