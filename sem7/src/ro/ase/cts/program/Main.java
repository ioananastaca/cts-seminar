package ro.ase.cts.program;

import ro.ase.cts.clase.AdapterCreditObiecte;
import ro.ase.cts.clase.CreditAbstract;
import ro.ase.cts.clase.Leasing;

public class Main {
	
	public static void afiseazaInfoCredit(CreditAbstract credit,float suma) {
		credit.oferaCredit(suma);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Leasing leasing=new Leasing(100,"Alex");
		AdapterCreditObiecte adaptor=new AdapterCreditObiecte(leasing);
		afiseazaInfoCredit(adaptor, leasing.getSuma());
	}

}
