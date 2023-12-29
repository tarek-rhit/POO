package com.dai4;

import com.dai4.model.Adresse;
import com.dai4.model.Client;
import com.dai4.model.Etat;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Client> clientList = new ArrayList<>();

        Client c1 = new Client();
        c1.setId(0012);
        c1.setNom("HEU");
        c1.setPrenom("Alix");
        c1.setEtat(Etat.Active);
        c1.setSolde(128.5F);
        try {
            c1.setEmail("alixheu@test.com");
            c1.setPassword("alix!heu");
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<Adresse> adresseList =  new ArrayList<>();

        Adresse a1 = new Adresse();
        a1.setRue("Rue Haxo");
        try {
            a1.setVille("Paris");
            a1.setCodePostale(75012);
        } catch (Exception e) {
            e.printStackTrace();
        }

        adresseList.add(a1);


        Adresse a2 = new Adresse();
        a2.setRue("Rue Molliére");
        try {
            a2.setVille("Lyon");
            a2.setCodePostale(35116);
        } catch (Exception e) {
            e.printStackTrace();
        }

        adresseList.add(a2);

        c1.setAdresseList(adresseList);
        clientList.add(c1);


        Client c2 = new Client();
        c2.setId(0013);
        c2.setNom("BOUGENNA");
        c2.setPrenom("Naoufel");
        c2.setEtat(Etat.Inactive);
        c2.setSolde(745.5F);
        try {
            c2.setEmail("naoufelbougena@test.com");
            c2.setPassword("naoufel?bougena13");
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<Adresse> adresseListe =  new ArrayList<>();

        Adresse a3 = new Adresse();
        a3.setRue("Rue Madrid");
        try {
            a3.setVille("Paris");
            a3.setCodePostale(75014);
        } catch (Exception e) {
            e.printStackTrace();
        }

        adresseListe.add(a3);


        Adresse a4 = new Adresse();
        a4.setRue("Rue Hugo");
        try {
            a4.setVille("Marseille");
            a4.setCodePostale(17200);
        } catch (Exception e) {
            e.printStackTrace();
        }

        adresseListe.add(a4);


        Adresse a5 = new Adresse();
        a5.setRue("Rue Rousseau");
        try {
            a5.setVille("Angers");
            a5.setCodePostale(39710);
        } catch (Exception e) {
            e.printStackTrace();
        }

        adresseListe.add(a5);


        c2.setAdresseList(adresseListe);
        clientList.add(c2);


        Client c3 = new Client();
        c3.setId(0015);
        c3.setNom("HEU");
        c3.setPrenom("Steff");
        c3.setEtat(Etat.En_cours);
        c3.setSolde(117.5F);
        try {
            c3.setEmail("steffheu@test.com");
            c3.setPassword("steff!heu");
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<Adresse> adresses =  new ArrayList<>();

        Adresse a6 = new Adresse();
        a6.setRue("Rue Alger");
        try {
            a6.setVille("Paris");
            a6.setCodePostale(75013);
        } catch (Exception e) {
            e.printStackTrace();
        }

        adresses.add(a6);


        Adresse a7 = new Adresse();
        a7.setRue("Rue La Fontaine");
        try {
            a7.setVille("Bordeau");
            a7.setCodePostale(40716);
        } catch (Exception e) {
            e.printStackTrace();
        }

        adresses.add(a7);

        c3.setAdresseList(adresses);
        clientList.add(c3);


        Client c4 = new Client();
        c4.setId(0020);
        c4.setNom("BOUGENNA");
        c4.setPrenom("Sony");
        c4.setEtat(Etat.Active);
        c4.setSolde(55.5F);
        try {
            c4.setEmail("sonnybougena@test.com");
            c4.setPassword("sonny?bougena13");
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<Adresse> adress =  new ArrayList<>();

        Adresse a8 = new Adresse();
        a8.setRue("Rue Andalous");
        try {
            a8.setVille("Paris");
            a8.setCodePostale(75017);
        } catch (Exception e) {
            e.printStackTrace();
        }

        adress.add(a8);


        Adresse a9 = new Adresse();
        a9.setRue("Rue Charles Degaul");
        try {
            a9.setVille("Montpelier");
            a9.setCodePostale(29200);
        } catch (Exception e) {
            e.printStackTrace();
        }

        adress.add(a9);


        Adresse a10 = new Adresse();
        a10.setRue("Rue Monteschieu");
        try {
            a10.setVille("Nice");
            a10.setCodePostale(56010);
        } catch (Exception e) {
            e.printStackTrace();
        }

        adress.add(a10);


        c4.setAdresseList(adress);
        clientList.add(c4);




        //Afficher les clients qui habitent à paris
        for (int i = 0; i <clientList.size() ; i++) {
            for (int j = 0; j <adresseList.size() ; j++) {
                if(adresseList.get(j).getVille().equalsIgnoreCase("Paris")){
                    System.out.println(clientList.get(i));
                }


            }

        }

        //afficher les prenoms des clients qui ont les meme noms

        Map<String, String>  doublantNom = new HashMap<>();
        for( Client clientTmp : clientList){
            String cle = clientTmp.getNom();
            if(doublantNom.containsKey(cle)){
                doublantNom.put(cle,clientTmp.getPrenom());
            }
        }

        // Afficher le contenu du MAP
        Set listCle = doublantNom.keySet(); // Obtenir la liste des clés
        Iterator it = listCle.iterator();

        // Parcourir les clés et afficher les entrées de chaque clé
        while (it.hasNext()){
            Object cle= it.next();
            System.out.println(cle+"=>"+doublantNom.get(cle));
        }

    }


}
