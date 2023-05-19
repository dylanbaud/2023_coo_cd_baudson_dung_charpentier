package main;

import donnees.CD;
import donnees.InfoPiste;

public class SelecteurTitrePiste implements Selecteur {
    private String nomPiste;

    public SelecteurTitrePiste(String titre){
        this.nomPiste=titre;
    }
    @Override
    public boolean garderCd(CD cd) {
        for (InfoPiste piste : cd.getPiste()){
            if(piste.getNomPiste().equals(this.nomPiste)){
                return true;
            }
        }
        return false;
    }
}
