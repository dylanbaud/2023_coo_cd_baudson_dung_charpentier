package main;

import donnees.CD;

public class ComparateurNbPistes implements ComparateurCd {

    public boolean etreAvant(CD cd1, CD cd2) {
        if(cd1.getPiste().size() > cd2.getPiste().size()){
            return true;
        }
        return false;
    }

}
