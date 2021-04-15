package ro.ase.cts.clase.composite;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaMeniu {
	 public Sectiune(String numeSectiune) {
		super();
		this.numeSectiune = numeSectiune;
		this.listaComponente=new ArrayList<ComponentaMeniu>();
	}
	private List<ComponentaMeniu>listaComponente;
	 private String numeSectiune;
	@Override
	public void adaugaNod(ComponentaMeniu componentaMeniu) throws Exception {
		listaComponente.add(componentaMeniu);
		
	}
	@Override
	public void stergeNod(ComponentaMeniu componentaMeniu) {
		listaComponente.remove(componentaMeniu);
		
	}
	@Override
	public ComponentaMeniu getNod(int index) {
		if(index<listaComponente.size() && index>=0) {
			return listaComponente.get(index);
		}
		return null;
	}
	@Override
	public void printeaza() {
		System.out.println("Sectiunea "+numeSectiune);
		for(ComponentaMeniu componenta:listaComponente) {
			componenta.printeaza();
		}
		
	}
}
