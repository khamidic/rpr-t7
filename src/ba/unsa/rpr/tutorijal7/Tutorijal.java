package ba.unsa.rpr.tutorijal7;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
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

    public static UN ucitajXML(ArrayList<Grad> gradovi) {
        ArrayList<Drzava> drzave = new ArrayList<>();

        Document xmldoc = null;
        try {
            DocumentBuilder docReader = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            xmldoc = docReader.parse(new File("drzava.xml"));

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Element root = xmldoc.getDocumentElement();
        Element mjerenja = xmldoc.createElement("temperature");
        root.normalize();
        NodeList children = root.getChildNodes();

        for(int i = 0; i < children.getLength(); i++) {
            Node drzavaNode = children.item(i);
            if(drzavaNode.getNodeType() == Node.ELEMENT_NODE) {
                Drzava novaDrzava = new Drzava();
                Grad noviGrad = new Grad();
                Element drzavaElement = (Element) drzavaNode;
                NodeList glavniGradElementi = ((Element) ((Element) drzavaNode).getElementsByTagName("glavnigrad"));
                if(glavniGradElementi.getLength() >= 1) {

                }
            }
        }
    }
}
