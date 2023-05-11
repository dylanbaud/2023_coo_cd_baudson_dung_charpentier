import XML.ChargeurMagasin;
import donnees.Magasin;
import org.junit.jupiter.api.Test;

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

}
