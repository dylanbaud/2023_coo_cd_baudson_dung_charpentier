package main;

import donnees.CD;

public class ComparateurAlbum implements ComparateurCd {

    public boolean etreAvant(CD cd1, CD cd2) {
        if(cd1.getNomCD().compareTo(cd2.getNomCD()) < 0){
            return true;
        }
        return false;
    }
}
