package ro.ase.cts.main.compositePr7Restaurante;

import java.awt.Component;

import ro.ase.cts.clase.composite.ComponentaMeniu;
import ro.ase.cts.clase.composite.Element;
import ro.ase.cts.clase.composite.Sectiune;

public class Main {

	public static void main(String[] args) throws Exception {
		ComponentaMeniu meniu=new Sectiune("meniu");
		ComponentaMeniu sectiuneBauturi=new Sectiune("bauturi");
		ComponentaMeniu sectiuneDesert=new Sectiune("desert");
		
		ComponentaMeniu elementCafea=new Element("cafea");
		ComponentaMeniu elementFrappe=new Element("Frappe");
		ComponentaMeniu elementTiramisu=new Element("Tiramisu");
		sectiuneBauturi.adaugaNod(elementCafea);
		sectiuneBauturi.adaugaNod(elementFrappe);
		sectiuneDesert.adaugaNod(elementTiramisu);
		
		meniu.adaugaNod(sectiuneDesert);
		meniu.adaugaNod(sectiuneBauturi);
		meniu.printeaza();
		
		//stergere
		sectiuneBauturi.stergeNod(elementFrappe);
		sectiuneDesert.adaugaNod(elementFrappe);
		meniu.printeaza();

	}

}
