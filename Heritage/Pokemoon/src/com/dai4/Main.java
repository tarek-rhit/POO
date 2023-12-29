package com.dai4;

import com.dai4.model.Pokemon;
import com.dai4.model.PokemonEau;
import com.dai4.model.PokemonFeu;
import com.dai4.model.PokemonPlante;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Pokemon p1=new PokemonFeu("Steff",300,6);
        Pokemon p4=new PokemonFeu("Albien",600,10);
        Pokemon p2=new PokemonEau("Sony",400,7);
        Pokemon p5=new PokemonEau("Faker",700,8);
        Pokemon p3=new PokemonPlante("Alix",500,5);
        Pokemon p6=new PokemonPlante("Moussa",800,9);

        p1.attaquer(p2);
        System.out.println(p2.getHp());
        p2.attaquer(p1);
        System.out.println(p1.getHp());
        p3.attaquer(p6);
        System.out.println(p6.getHp());
        

    }
}
