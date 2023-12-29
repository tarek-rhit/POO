package com.dai4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here


        List<Voiture> voitureList= new ArrayList<>();
        Voiture v1 = new Voiture();
        v1.setMarque("BMW");
        v1.setColor("Noir");
        v1.setMatricule("kjh698");
        v1.setVitesseMax("220Km/h");
        v1.setConducteurs();
        voitureList.add(v1);
    }
}
