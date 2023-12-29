package com.dai4;

import com.dai4.model.Album;
import com.dai4.model.BandeDessinee;
import com.dai4.model.Etat;
import com.dai4.model.Livre;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Livre> livres = new ArrayList<>();
        Livre l1 = new Livre("Tata","Titi",115.4f,351,"Alix");livres.add(l1);
        Livre l2 = new Livre("Lala","Lili",125.4f,251,"Andrea");livres.add(l2);
        Livre l3 = new Livre("jaja","jiji",175.4f,751,"Steff");livres.add(l3);

        BandeDessinee bd= new BandeDessinee("Gaga","Gigi",168.14f,562,"Faker", Etat.Couleur);
        BandeDessinee bd1= new BandeDessinee("Fafa","Fifi",128.14f,321, "Vectorine",Etat.Noir_Blanc);
        BandeDessinee bd2= new BandeDessinee("Dada","Didi",128.14f,321, "Albien",Etat.Noir_Blanc);

        BandeDessinee bd3 =new BandeDessinee("Sasa","Sisi",145.18f,369,"Naoufel",Etat.Couleur);
        Album alb = new Album("Papa","Pipi",123.18f,565,"Magomed");
        alb.getAlbumPages().add(6);
        alb.getAlbumPages().add(53);
        alb.getAlbumPages().add(89);
        alb.getAlbumPages().add(541);

        bd1.echangerBD(bd2);

    }
}
