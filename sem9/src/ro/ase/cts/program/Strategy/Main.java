package ro.ase.cts.program.Strategy;


import ro.ase.cts.clase.Strategy.Card;
import ro.ase.cts.clase.Strategy.Client;
import ro.ase.cts.clase.Strategy.Portofel;

public class Main {

	public static void main(String[] args) {
		Portofel portofel=new Portofel(300);
		
		Client client1=new Client(portofel,"ioana");
		client1.platesteNota(200);
		client1.setStrategy(new Card());
		client1.platesteNota(110);
		client1.setStrategy(portofel);
		client1.platesteNota(200);

		
	}

}
