package main;

import donnees.CD;

public class SelecteurNbPistes implements Selecteur {
    private int nbPistes;

    public SelecteurNbPistes(int nb){
        this.nbPistes=nb;
    }

    @Override
    public boolean garderCd(CD cd) {
       if(cd.getPiste().size()==nbPistes){
           return true;
       }
       return false;
    }
}
