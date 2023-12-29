package com.dai4.model;


import java.util.List;

public class Album extends Livre{

    private List<Integer> albumPages;


    public Album(String titre, String nomAuteur, float prix, int nbrePages, String propre) {
        super(titre, nomAuteur, prix, nbrePages, propre);

    }

    public List<Integer> getAlbumPages() {
        return albumPages;
    }

    public void setAlbumPages(List<Integer> albumPages) {
        this.albumPages = albumPages;
    }

    @Override
    public String toString() {
        return "Album{" +
                "albumPages=" + albumPages +
                '}';
    }
}
