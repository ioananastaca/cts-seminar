package ro.ase.cts.program;

import ro.ase.cts.clase.BrokerTranzactie;
import ro.ase.cts.clase.BrokerTranzactieLazy;

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
		
		BrokerTranzactieLazy brokerLazy1=BrokerTranzactieLazy.getInstance("Lazy1",5,300);
		BrokerTranzactieLazy brokerLazy2=BrokerTranzactieLazy.getInstance("Lazy2", 6,350);
		
		System.out.println(brokerLazy1.toString());
		System.out.println(brokerLazy1.toString());
	}

}
