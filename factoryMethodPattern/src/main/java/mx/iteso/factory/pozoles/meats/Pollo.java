package mx.iteso.factory.pozoles.meats;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleType;

/**
 * Created by a-rmz on 10/7/16.
 */
public class Pollo extends Pozole {
    Pozole pozole;

    public Pollo(Pozole pozole) {
        this.pozole = pozole;
    }


    @Override
    public String serve() {
        return pozole.serve();
    }

    @Override
    public String prepare() {
        return pozole.prepare() + "\nAdding " + PozoleType.POLLO.getName();
    }

    @Override
    public String getName() {
        return pozole.getName() + " with " + PozoleType.POLLO.getName();
    }
}
