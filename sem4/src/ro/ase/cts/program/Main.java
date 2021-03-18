package ro.ase.cts.program;

import ro.ase.cts.clase.BrokerTranzactie;
import ro.ase.cts.clase.BrokerTranzactieLazy;
import ro.ase.cts.clase.Camin;

public class Main {

	public static void main(String[] args) {
		
		BrokerTranzactie broker1=BrokerTranzactie.getInstance();
		BrokerTranzactie broker2=BrokerTranzactie.getInstance();
		//referinte care retin adresa aceleasi instante
		System.out.println(broker1.toString());
		System.out.println(broker2.toString());
		broker1.setNume("Alina");
		broker2.setNrTranzactiiEfectuate(9);
		System.out.println(broker1.toString());
		System.out.println(broker2.toString());
		
		BrokerTranzactieLazy brokerLazy2=BrokerTranzactieLazy.getInstance("Lazy2", 6,350);
		BrokerTranzactieLazy brokerLazy1=BrokerTranzactieLazy.getInstance("Lazy1",5,300);
		System.out.println(brokerLazy1.toString());
		System.out.println(brokerLazy2.toString());
		
		Camin camin1=Camin.getInstance("ASE", 300,350.50);
		Camin camin2=Camin.getInstance("UNIB",200,250.7);
		System.out.println(camin1.toString());
		System.out.println(camin2.toString());
		
		
	}

}
