package ba.unsa.rpr.tutorijal7;

import java.io.Serializable;

public class Grad implements Serializable {
    public String naziv;
    public int brojStanovnika;
    public double[] temperatura = new double[1000];
    public int ukupanBrojMjerenja = 1000;
    public Grad(String ime, int broj, double[] t){
        this.naziv = ime;
        this.brojStanovnika = broj;
        this.temperatura = t;
        this.ukupanBrojMjerenja = temperatura.length;
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

    public double[] getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double[] temperatura) {
        this.temperatura = temperatura;
    }

    public int getUkupanBrojMjerenja() {
        return ukupanBrojMjerenja;
    }

    public void setUkupanBrojMjerenja(int ukupanBrojMjerenja) {
        this.ukupanBrojMjerenja = ukupanBrojMjerenja;
    }
}
