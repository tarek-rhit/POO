package com.dai4;

public class Personnage {
    private String nom;
    private Role role;

    public Personnage() {
    }

    public Personnage(String nom, Role role) {
        this.nom = nom;
        this.role = role;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "nom='" + nom + '\'' +
                ", role=" + role +
                '}';
    }
}
