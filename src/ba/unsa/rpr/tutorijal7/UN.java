package ba.unsa.rpr.tutorijal7;

import java.io.Serializable;
import java.util.ArrayList;

public class UN implements Serializable {
    ArrayList<Drzava> drzave;


    public UN() {
        drzave = null;
    }

    public UN(ArrayList<Drzava> drzave) {
        this.drzave = drzave;
    }

    public ArrayList<Drzava> getDrzave() {
        return drzave;
    }

    public void setDrzave(ArrayList<Drzava> drzave) {
        this.drzave = drzave;
    }


}
