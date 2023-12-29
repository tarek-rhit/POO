package com.dai4;

import com.dai4.models.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // write your code here


        List<Chat> chatList = new ArrayList<>();

        Chat chatton = new Chat();
        chatton.setNom("Kiry");
        chatton.setCouleur("noire");
        chatton.setRace(Race.American_shorthair);
        chatton.setAdoption(Adoption.Impossible);
        chatton.setPrix(250.4F);

        List<Comportement> comportements = new ArrayList<>();
        Comportement c1 = new Comportement();
        c1.setName("ChatMignon");
        c1.setDescription("adorable chat");
        c1.setEtat(Etat.Supportable);
        comportements.add(c1);

        Comportement c2 = new Comportement();
        c2.setName("Caresse");
        c2.setDescription("il te caresse bien");
        c2.setEtat(Etat.Pas_Grave);
        comportements.add(c2);
        chatton.setComportements(comportements);
        chatList.add(chatton);

        Chat chatton1 = new Chat();
        chatton1.setNom("Pirry");
        chatton1.setCouleur("NoIrE");
        chatton1.setRace(Race.American_curl);
        chatton1.setAdoption(Adoption.Possible);
        chatton1.setPrix(150.4F);

        List<Comportement> comporList = new ArrayList<>();
        Comportement c3 = new Comportement();
        c3.setName("ChatBrave");
        c3.setDescription("adorable chat et inteligent");
        c3.setEtat(Etat.Supportable);
        comporList.add(c3);

        Comportement c4 = new Comportement();
        c4.setName("Ecout");
        c4.setDescription("il t'ecoute bien");
        c4.setEtat(Etat.Pas_Grave);
        comporList.add(c4);

        Comportement c5 = new Comportement();
        c5.setName("Obeissant");
        c5.setDescription("il t'ecoute bien ");
        c5.setEtat(Etat.Grave);
        comporList.add(c5);
        chatton1.setComportements(comporList);
        chatList.add(chatton1);

        Chat chatton2 = new Chat();
        chatton2.setNom("Dida");
        chatton2.setCouleur("Beige");
        chatton2.setRace(Race.American_wirehair);
        chatton2.setAdoption(Adoption.Possible);
        chatton2.setPrix(250.4F);

        List<Comportement> comporListe = new ArrayList<>();
        Comportement c6 = new Comportement();
        c6.setName("ChatJoli");
        c6.setDescription("adorable chat et inteligent");
        c6.setEtat(Etat.Pas_Grave);
        comporListe.add(c6);

        Comportement c7 = new Comportement();
        c7.setName("Ecoute");
        c7.setDescription("il t'ecoute bien et joli");
        c7.setEtat(Etat.Supportable);
        comporListe.add(c7);

        Comportement c8 = new Comportement();
        c8.setName("Obeissante");
        c8.setDescription("il t'ecoute bien et rapide ");
        c8.setEtat(Etat.Grave);
        comporList.add(c8);
        chatton2.setComportements(comporListe);
        chatList.add(chatton2);

        Chat chatton3 = new Chat();
        chatton3.setNom("Morgan");
        chatton3.setCouleur("Marron");
        chatton3.setAdoption(Adoption.Possible);
        chatton3.setPrix(150.4F);

        List<Comportement> comportListe = new ArrayList<>();
        Comportement c9 = new Comportement();
        c9.setName("ChatJolie");
        c9.setDescription("adorable chat et inteligente");
        c9.setEtat(Etat.Grave);
        comportListe.add(c9);

        Comportement c10 = new Comportement();
        c10.setName("Ecoute");
        c10.setDescription("il t'ecoute bien et jolie");
        c10.setEtat(Etat.Pas_Grave);
        comporListe.add(c10);

        Comportement c11 = new Comportement();
        c11.setName("Obeissante");
        c11.setDescription("il t'ecoute bien et rapide ");
        c11.setEtat(Etat.Grave);
        comportListe.add(c11);
        chatton3.setComportements(comportListe);
        chatList.add(chatton3);


//Q1: afficher les chat noire
        for (Chat tmp : chatList) {
            if (tmp.getCouleur().equalsIgnoreCase("noire")) {
                System.out.println(tmp);
            }

        }

        System.out.println("*****************************************************************************************************************************");

//Q2: afficher les chats sans race aavec un prix inferieurs à 200

        // |chat1|chat2|chat3|
        for (Chat chatTmp : chatList) {
            if (chatTmp.getRace() == null && chatTmp.getPrix() < 200) {

                System.out.println(chatTmp);
            }
        }
        System.out.println("*****************************************************************************************************************************");

//Q3: afficher les noms des chats avec le comportements grave

        for (Chat cTmp : chatList) {
            for (int i = 0; i < comportements.size(); i++) {
                if (cTmp.getComportements().get(i).getEtat() == Etat.Grave) {
                    System.out.println(cTmp);
                    break;
                }
            }

        }
//Q4: afficher le nbre des chat grave et les trier selon leurs prix
        System.out.println("*******************************************le nombre des chats graves**********************************************************************************");


        int cpt = 0;
        for (int i = 0; i < chatList.size(); i++) {
            for (int j = 0; j < comportements.size(); j++) {
                if (chatList.get(i).getComportements().get(j).getEtat() == Etat.Grave) {
                    cpt = cpt + 1;
                    System.out.println(cpt);
                }

            }

        }
        System.out.println("********************************* Trie des chats graves selon le prix ********************************************************************************************");
        Chat cTmp = new Chat();
        cTmp = chatList.get(0);
        for (int i = 0; i < chatList.size(); i++) {
            for (int j = 1; j < chatList.size(); j++) {
                if (chatList.get(i).getPrix() < chatList.get(j).getPrix()) {
                    cTmp = chatList.get(i);
                    chatList.set(i, chatList.get(j));
                    chatList.set(j, cTmp);
                }
            }


        }
        for (Chat tmp: chatList
             ) {
            System.out.println(tmp);
        }
    }
}
