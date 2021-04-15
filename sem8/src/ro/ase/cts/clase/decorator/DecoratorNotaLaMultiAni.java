package ro.ase.cts.clase.decorator;

public class DecoratorNotaLaMultiAni extends DecoratorAbstract {

	public DecoratorNotaLaMultiAni(NotaAbstracta nota) {
		super(nota);
		
	}

	@Override
	public void printeazaFelicitare() {
		System.out.println("Felicitare - La multi ani!");
		
	}
	public void printeaza() {
		super.printeaza();//pastram functionalitatea 
		System.out.println("La multi ani!");
	}

	
}
