import XML.ChargeurMagasin;
import donnees.Magasin;
import main.ComparateurAlbum;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ChargerMagasinTest {

    @Test
    public void testChargerMagasinValide() throws FileNotFoundException{
        String repertoire = "src/musicbrainzSimple/";
        ChargeurMagasin charge = new ChargeurMagasin(repertoire);
        Magasin resultat = charge.chargerMagasin();
        assertEquals(12, resultat.getNombreCds(), "Il devrait y avoir 12 pistes");

    }

    @Test
    public void testChargerMagasinNonValide(){
        String repertoire = "src/mauvais/";
        ChargeurMagasin charge = new ChargeurMagasin(repertoire);
        FileNotFoundException exception = assertThrows(
                FileNotFoundException.class, () -> {
                    charge.chargerMagasin();
                }
        );
    }

    @Test
    void trier() throws FileNotFoundException {
        String repertoire = "src/musicbrainzSimple/";
        ChargeurMagasin charge = new ChargeurMagasin(repertoire);
        Magasin magasin = charge.chargerMagasin();
        magasin.trier(new ComparateurAlbum());
        assertEquals("Believe", magasin.getCd(0).getNomCD(), "ça devrait être Believe");
        assertEquals("Whitney Houston", magasin.getCd(magasin.getNombreCds()-1).getNomCD(), "ça devrait être Whitney Houston");
    }
}
