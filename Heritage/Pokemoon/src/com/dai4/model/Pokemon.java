package com.dai4.model;

public class Pokemon {

    private String nom;
    private int hp;
    private int atk;

    public Pokemon() {
    }

    public Pokemon(String nom, int hp, int atk) {
        this.nom = nom;
        this.hp = hp;
        this.atk = atk;
    }

    public boolean isDead(){
        boolean death = false;
        if(hp==0){
            death=true;
        }else {
            death = false;
        }
        return death;
    }

    public void attaquer(Pokemon p){
        p.setHp(p.getHp()-this.getAtk());
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nom='" + nom + '\'' +
                ", hp=" + hp +
                ", atk=" + atk +
                '}';
    }
}
