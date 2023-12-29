package com.dai4;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Salarier s1=new Salarier();
        s1.setId(0001);
        s1.setNom("hhhh");
        s1.setPrenom("ffff");
        s1.setSalaire(2000.15);


        Salarier s2=new Salarier();
        s2.setId(0002);
        s2.setNom("hmlop");
        s2.setPrenom("jhgff");
        s2.setSalaire(3800);

        s1.setSalaire(s1.getSalaire()+(s1.getSalaire()*(0.1)));
        //s1.setSalaire(s1.getSalaire()*(0.1));

        System.out.println(s1.getSalaire());

        s1.setSalaire(s1.getSalaire()+(s1.getSalaire()*(0.1)));
        System.out.println(s1.getSalaire());

        s2.setSalaire(s2.getSalaire()+(s2.getSalaire()*(0.1)));
        System.out.println(s2.getSalaire());

    }
}
