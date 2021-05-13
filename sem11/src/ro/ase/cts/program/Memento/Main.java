package ro.ase.cts.program.Memento;

import ro.ase.cts.clase.Memento.ManagerMemento;
import ro.ase.cts.clase.Memento.MeciJucat;

public class Main {

	public static void main(String[] args) {
		MeciJucat m1=new MeciJucat("BoTosani", "Astra", 70, 100, 80, 20);
		
		ManagerMemento manager=new ManagerMemento();
		manager.adaugaMemento(m1.creareMemento());
		
		m1.setNumeGazda("steaua");
		m1.setNumeOaspeti("dinamo");
		m1.setNrSpectatori(40);
		
		manager.adaugaMemento(m1.creareMemento());
		
		System.out.println(m1.toString());
		
		//revine la starea initiala
		m1.setMemento(manager.getMemento(0));
		System.out.println(m1.toString());
		

	}

}
