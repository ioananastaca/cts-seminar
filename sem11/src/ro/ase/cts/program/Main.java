package ro.ase.cts.program;

import ro.ase.cts.clase.Observer.Client;
import ro.ase.cts.clase.Observer.ManagerSala;
import ro.ase.cts.clase.Observer.Observer;

public class Main {

	public static void main(String[] args) {
		
		ManagerSala manager=new ManagerSala("sala nr2");
		Observer client1=new Client("Ana");
		Observer client2=new Client("alex");
		Observer client3=new Client("mihai");
		
		manager.adaugareAbonat(client1);
		manager.adaugareAbonat(client2);
		manager.adaugareAbonat(client3);
		
		manager.trimiteAnuntImportant("Fotbal");
		manager.stergereAbonat(client3);
		manager.trimiteAnuntImportant("Handbal");
		
		
	}

}
