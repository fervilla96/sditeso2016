package pozolesVerdesTests;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleType;
import mx.iteso.factory.stores.AllPozolesStore;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by fernando on 8/10/16.
 */
public class PozoleVerdeCacheteTest {
    AllPozolesStore allStore;

    @Before
    public void setup() {
        allStore = new AllPozolesStore();
    }

    @Test
    public void testMenudo() {
        Pozole pozoleVerdeCachete = allStore.createPozole(PozoleType.POZOLE_VERDE, PozoleType.CACHETE);
        Assert.assertEquals(
                PozoleType.POZOLE_VERDE.getName() + " with "
                        + PozoleType.COL.getName() + " with "
                        + PozoleType.LECHUGA.getName() + " with "
                        + PozoleType.RABANOS.getName() + " with "
                        + PozoleType.CACHETE.getName(),
                pozoleVerdeCachete.getName()
        );
    }

}

