package com.dai4;

public class Jouet {

    String name;
    int anneeFabrication;
    String color;

    @Override
    public String toString() {
        return "Jouet{" +
                "name='" + name + '\'' +
                ", anneeFabrication=" + anneeFabrication +
                ", color='" + color + '\'' +
                '}';
    }
}
