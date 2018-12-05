package ba.unsa.rpr.tutorijal7;

import java.io.Serializable;
import java.util.ArrayList;

public class UN implements Serializable {
    ArrayList<Drzava> lista;

    public UN(ArrayList<Drzava> lista) {
        this.lista = lista;
    }

    public ArrayList<Drzava> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Drzava> lista) {
        this.lista = lista;
    }
}
