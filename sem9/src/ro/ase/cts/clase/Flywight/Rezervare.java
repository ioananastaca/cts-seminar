//problema 10 sectiunea restaurant
package ro.ase.cts.clase.Flywight;

public class Rezervare {

	private int nrMasa;
	private int nrPers;
	private int oraRezervare;
	public Rezervare(int nrMasa, int nrPers, int oraRezervare) {
		super();
		this.nrMasa = nrMasa;
		this.nrPers = nrPers;
		this.oraRezervare = oraRezervare;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [nrMasa=");
		builder.append(nrMasa);
		builder.append(", nrPers=");
		builder.append(nrPers);
		builder.append(", oraRezervare=");
		builder.append(oraRezervare);
		builder.append("]");
		return builder.toString();
	}
	
}
