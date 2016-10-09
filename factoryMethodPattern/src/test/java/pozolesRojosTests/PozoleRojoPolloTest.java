package pozolesRojosTests;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleType;
import mx.iteso.factory.stores.AllPozolesStore;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by fernando on 8/10/16.
 */
public class PozoleRojoPolloTest {
    AllPozolesStore allStore;

    @Before
    public void setup() {
        allStore = new AllPozolesStore();
    }

    @Test
    public void testMenudo() {
        Pozole pozoleRojoPollo = allStore.createPozole(PozoleType.POZOLE_ROJO, PozoleType.POLLO);
        Assert.assertEquals(
                PozoleType.POZOLE_ROJO.getName() + " with "
                        + PozoleType.COL.getName() + " with "
                        + PozoleType.OREGANO.getName() + " with "
                        + PozoleType.RABANOS.getName() + " with "
                        + PozoleType.POLLO.getName(),
                pozoleRojoPollo.getName()
        );
    }

}

