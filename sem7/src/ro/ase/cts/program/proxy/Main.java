package ro.ase.cts.program.proxy;

import ro.ase.cts.clase.proxy.Credit;
import ro.ase.cts.clase.proxy.Proxy;
import ro.ase.cts.clase.proxy.TipMoneda;

public class Main {

	public static void main(String[] args) {
		Credit credit=new Credit();
		credit.oferaCredit(TipMoneda.EUR, 0);
		
		Proxy proxy=new Proxy(credit);
		proxy.oferaCredit(TipMoneda.EUR, 100);
		proxy.oferaCredit(TipMoneda.RON, 1000);

	}

}
