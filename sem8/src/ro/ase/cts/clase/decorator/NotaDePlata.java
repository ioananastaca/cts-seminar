package ro.ase.cts.clase.decorator;

public class NotaDePlata implements NotaAbstracta {
	float suma;

	@Override
	public void printeaza() {
		System.out.println("Nota de plata: "+suma);
	}

	public NotaDePlata(float suma) {
		super();
		this.suma = suma;
	}
	
	
}
