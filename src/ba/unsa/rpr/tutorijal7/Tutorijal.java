package ba.unsa.rpr.tutorijal7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Tutorijal implements Serializable {

    public static void main(String[] args) {
	// write your code here
    }

    public static ArrayList<Grad> ucitajGradove() throws FileNotFoundException {
        ArrayList<Grad> data = new ArrayList<>();
        try {
            Scanner rd = new Scanner(new FileReader("mjerenja.txt")).useDelimiter("[\\r\\n,]");
            while(rd.hasNext()) {
                String naziv = rd.next();
                int brojac = 0;
                ArrayList<Double> mjerenja = new ArrayList<>();
                while(rd.hasNextDouble()) {
                    double vrijednost = rd.nextDouble();
                    if(brojac < 1000)
                        mjerenja.add(vrijednost);
                    brojac++;
                }
                if(rd.hasNext()) rd.next();
                Grad grad = new Grad(naziv,0,mjerenja);
                data.add(grad);
            }

            rd.close();
        }
        catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return data;
    }
}
