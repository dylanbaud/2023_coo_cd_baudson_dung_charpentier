package main;

import donnees.CD;

public class SelecteurArtiste implements Selecteur {
    private String nomArtiste;

    public SelecteurArtiste(String nom){
        this.nomArtiste=nom;
    }
    public boolean garderCd(CD cd) {
       if(cd.getNomArtiste().equals(this.nomArtiste)){
           return true;
       }
       return false;
    }
}
