package ro.ase.cts.program.facade;

import ro.ase.cts.clase.facade.Facade;
import ro.ase.cts.clase.facade.Persoana;

public class Main {

	public static void main(String[] args) {
		Persoana persoana=new Persoana("6000219558893","Mihai");
		 if(Facade.esteEligibil(persoana)) {
			 System.out.println("Oferim creditul!");
		 }else {
			 System.out.println("Nu oferim creditul");
		 }
	}

}
