package ro.ase.cts.clase.proxy;

public class Proxy  implements CreditAbstract{

	private CreditAbstract credit;
	
	public Proxy(CreditAbstract credit) {
		super();
		this.credit = credit;
	}
	@Override
	public void oferaCredit(TipMoneda tip, float suma) {
		if(tip==TipMoneda.RON) {
			credit.oferaCredit(tip, suma);
		}else {
			System.out.println("Banca nu mai ofera credit in alte monede!");
		}
		
	}

	
}
