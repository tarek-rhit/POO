package com.dai4.model;

public class PokemonFeu extends Pokemon{
    public PokemonFeu() {
    }

    public PokemonFeu(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }

    @Override
    public boolean isDead() {
        return super.isDead();
    }


    @Override
    public void attaquer(Pokemon p) {
        if(p.getClass().getName().equalsIgnoreCase("PokemonPlante")){
            p.setHp(p.getHp()-(super.getAtk()*2));
        }else if(p.getClass().getName().equalsIgnoreCase("PokemonFeu")||
                p.getClass().getName().equalsIgnoreCase("PokemonEau")){
            p.setHp((int) (p.getHp()-(super.getAtk()*0.5)));
        }else{
            p.setHp(p.getHp()-super.getAtk());
        }
    }
}
