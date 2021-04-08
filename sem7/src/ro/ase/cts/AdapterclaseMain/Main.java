package ro.ase.cts.AdapterclaseMain;

import ro.ase.cts.Adapterclase.AdaptorCreditClase;
import ro.ase.cts.Adapterclase.CreditAbstract;

public class Main {
	
	public static void afiseazaInfoCredit(CreditAbstract credit) {
		credit.oferaCredit();
	}

	public static void main(String[] args) {
		AdaptorCreditClase  adaptorClase=new AdaptorCreditClase(50, "Ana");
		afiseazaInfoCredit(adaptorClase);

		
	}

}
