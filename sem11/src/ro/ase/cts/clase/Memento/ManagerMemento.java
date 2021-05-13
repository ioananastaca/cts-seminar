package ro.ase.cts.clase.Memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {

	private List<Memento>lista=new ArrayList<>();
	
	public void adaugaMemento(Memento m) {
		lista.add(m);
	}
	public Memento getMemento(int index) {
		if(index>=0 && index<=lista.size()) {
		return lista.get(index);
	}else {
		throw new IllegalArgumentException("Pozitie invalida!");
	}
		
	}
}
