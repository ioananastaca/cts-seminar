package ro.ase.cts.clase.proxy;

public class Credit implements CreditAbstract {

	@Override
	public void oferaCredit(TipMoneda tipMoneda, float suma) {
		System.out.println("S-a achizitionat un credit de "+suma+" " +tipMoneda);
		
		
	}

}
