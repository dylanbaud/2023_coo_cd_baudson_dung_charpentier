import XML.ChargeurMagasin;
import donnees.Magasin;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChargerMagasinTest {

    @Test
    public void testChargerMagasinValide() throws FileNotFoundException{
        String repertoire = "../../musicbrainzSimple/musicbrainzSimple/";
        ChargeurMagasin charge = new ChargeurMagasin(repertoire);
        Magasin resultat = charge.chargerMagasin();
        assertEquals(12, resultat.getNombreCds(), "Il devrait y avoir 12 pistes");

    }
}
