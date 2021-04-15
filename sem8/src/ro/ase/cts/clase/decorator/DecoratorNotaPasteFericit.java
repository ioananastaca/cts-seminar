package ro.ase.cts.clase.decorator;

public class DecoratorNotaPasteFericit extends DecoratorAbstract{

	public DecoratorNotaPasteFericit(NotaAbstracta nota) {
		super(nota);
		
	}

	public void printeazaFelicitare() {
		System.out.println("Felicitare - Paste fericit!");
		
	}
	public void printeaza() {
		super.printeaza();//pastram functionalitatea 
		System.out.println("Paste fericit!");
	}

	

}
