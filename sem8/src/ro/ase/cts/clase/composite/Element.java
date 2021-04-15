package ro.ase.cts.clase.composite;

public class Element implements ComponentaMeniu{
	private  String numeElement;

	public Element(String numeElement) {
		super();
		this.numeElement = numeElement;
	}

	@Override
	public void adaugaNod(ComponentaMeniu componentaMeniu) throws Exception {
		throw new Exception("Nu este implentata");
		
	}

	@Override
	public void stergeNod(ComponentaMeniu componentaMeniu)  {
		throw new IllegalArgumentException("Nu este implementata!");
	}

	@Override
	public ComponentaMeniu getNod(int index) {
		throw new IllegalArgumentException("Nu este implementata!");
		
	}

	@Override
	public void printeaza() {
	
		System.out.println("Elementul: "+numeElement);
	}

}
