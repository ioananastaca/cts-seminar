package ro.ase.cts.clase.Strategy;

public class Card implements Strategy{

	@Override
	public void realizeazaPlata(float suma) {
		System.out.println("Tranzactia a fost efectuata cu cardul pt suma de "+suma+" lei.");
		
	}

}
