package donnees;

import main.ComparateurCd;

import java.util.ArrayList;

/**
 * La classe Magasin represente un magasin qui vend des CDs.</p>
 * <p>
 * cette classe est caracterisee par un ensemble de CDs correspondant aux CDS
 * vendus dans ce magasin.
 */
public class Magasin {

    /**
     * la liste des CDs disponibles en magasin
     */
    private ArrayList<CD> listeCds;

    /**
     * construit un magasin par defaut qui ne contient pas de CD
     */
    public Magasin() {
        listeCds = new ArrayList<CD>();
    }

    /**
     * ajoute un cd au magasin
     *
     * @param cdAAjouter le cd a ajouter
     */
    public void ajouteCd(CD cdAAjouter) {
        listeCds.add(cdAAjouter);
    }

    @Override
    /**
     * affiche le contenu du magasin
     */
    public String toString() {
        String chaineResultat = "";
        //parcours des Cds
        for (int i = 0; i < listeCds.size(); i++) {
            chaineResultat += listeCds.get(i);
        }
        chaineResultat += "nb Cds: " + listeCds.size();
        return (chaineResultat);

    }

    /**
     * @return le nombre de Cds du magasin
     */
    public int getNombreCds() {
        return listeCds.size();
    }

    /**
     * permet d'acceder à un CD
     *
     * @return le cd a l'indice i ou null si indice est non valide
     */
    public CD getCd(int i) {
        CD res = null;
        if ((i >= 0) && (i < this.listeCds.size()))
            res = this.listeCds.get(i);
        return (res);
    }

//    public void trierAriste() {
//        ArrayList<CD> listeCdsTri es = new ArrayList<CD>();
//        while (listeCds.size() > 0) {
//            int indicePetit = 0;
//            for (int i = 1; i < listeCds.size(); i++) {
//                if (listeCds.get(i).getNomArtiste().compareTo(listeCds.get(indicePetit).getNomArtiste()) < 0) {
//                    indicePetit = i;
//                }
//            }
//            listeCdsTries.add(listeCds.get(indicePetit));
//            listeCds.remove(indicePetit);
//        }
//        listeCds = listeCdsTries;
//    }
//
//    public void trierAlbum() {
//        ArrayList<CD> listeCdsTries = new ArrayList<CD>();
//        while (listeCds.size() > 0) {
//            int indicePetit = 0;
//            for (int i = 1; i < listeCds.size(); i++) {
//                if (listeCds.get(i).getNomCD().compareTo(listeCds.get(indicePetit).getNomCD()) < 0) {
//                    indicePetit = i;
//                }
//            }
//            listeCdsTries.add(listeCds.get(indicePetit));
//            listeCds.remove(indicePetit);
//        }
//        listeCds = listeCdsTries;
//    }

    public void trier(ComparateurCd cpcd) {
        ArrayList<CD> listeCdsTries = new ArrayList<CD>();
        while (this.listeCds.size() > 0) {
            int indicePetit = 0;
            for (int i = 1; i < this.listeCds.size(); i++) {
                if (cpcd.etreAvant(this.listeCds.get(i), this.listeCds.get(indicePetit))) {
                    indicePetit = i;
                }
            }
            listeCdsTries.add(this.listeCds.get(indicePetit));
            this.listeCds.remove(indicePetit);
        }
        this.listeCds = listeCdsTries;
    }


}
