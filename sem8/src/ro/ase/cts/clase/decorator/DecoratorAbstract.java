package ro.ase.cts.clase.decorator;

public abstract class DecoratorAbstract implements NotaAbstracta {
	private NotaAbstracta nota;

	@Override
	public void printeaza() {
		nota.printeaza();
		
	}

	public DecoratorAbstract(NotaAbstracta nota) {
		super();
		this.nota = nota;
	}
	
	public abstract void printeazaFelicitare();
}
