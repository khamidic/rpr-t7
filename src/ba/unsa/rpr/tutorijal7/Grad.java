package ba.unsa.rpr.tutorijal7;

import java.io.Serializable;
import java.util.ArrayList;

public class Grad implements Serializable {
    public String naziv;
    public int brojStanovnika;
    ArrayList<Double> temperature;

    public Grad(String naziv, int brojStanovnika, ArrayList<Double> temperature) {
        this.naziv = naziv;
        this.brojStanovnika = brojStanovnika;
        this.temperature = temperature;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojStanovnika() {
        return brojStanovnika;
    }

    public void setBrojStanovnika(int brojStanovnika) {
        this.brojStanovnika = brojStanovnika;
    }

    public ArrayList<Double> getTemperature() {
        return temperature;
    }

    public void setTemperature(ArrayList<Double> temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        String s = new String(naziv + " " + brojStanovnika);
        if(temperature != null) {
            s += "\nTemperature za " + naziv + ": ";
            for(Double d : temperature) s += d + ", ";
        }
        return s;
    }
}
