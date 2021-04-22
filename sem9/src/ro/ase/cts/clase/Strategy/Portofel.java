package ro.ase.cts.clase.Strategy;

public class Portofel implements Strategy{
	private float sumaDisponibila;

	public Portofel(float sumaDisponibila) {
		super();
		this.sumaDisponibila = sumaDisponibila;
	}

	@Override
	public void realizeazaPlata(float suma) {
		
		if(sumaDisponibila>=suma) {
			System.out.println("Tranzactia a fost efectuata cash pt suma de "+ suma+" lei");
			sumaDisponibila-=suma;
			return ;
		}
		System.out.println("Nu sunt suficieti bani");
	}
	

}
