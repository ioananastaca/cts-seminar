package ro.ase.cts.program.command;


import ro.ase.cts.clase.command.ComandaConstituireCont;
import ro.ase.cts.clase.command.ComandaDepunere;
import ro.ase.cts.clase.command.ContBancar;
import ro.ase.cts.clase.command.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
	
		ContBancar cont=new ContBancar("Ioana");
		ManagerComenzi manager=new ManagerComenzi();
		manager.invoca(new ComandaConstituireCont(cont,100));
		manager.invoca(new ComandaDepunere(cont,200));
		manager.executaComanda();
		
		

	}

}
