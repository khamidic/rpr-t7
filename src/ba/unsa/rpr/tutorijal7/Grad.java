package ba.unsa.rpr.tutorijal7;

public class Grad {
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
}
