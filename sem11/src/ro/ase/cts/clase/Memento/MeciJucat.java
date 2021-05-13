package ro.ase.cts.clase.Memento;
//originator
public class MeciJucat {
	private String numeGazda;
	private String numeOaspeti;
	private int nrSpectatori;
	private int nrBileteVandute;
	private int nrSticleVandute;
	private int nrJandarmi;
	public MeciJucat(String numeGazda, String numeOaspeti, int nrSpectatori, int nrBileteVandute, int nrSticleVandute,
			int nrJandarmi) {
		super();
		this.numeGazda = numeGazda;
		this.numeOaspeti = numeOaspeti;
		this.nrSpectatori = nrSpectatori;
		this.nrBileteVandute = nrBileteVandute;
		this.nrSticleVandute = nrSticleVandute;
		this.nrJandarmi = nrJandarmi;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MeciJucat [numeGazda=");
		builder.append(numeGazda);
		builder.append(", numeOaspeti=");
		builder.append(numeOaspeti);
		builder.append(", nrSpectatori=");
		builder.append(nrSpectatori);
		builder.append(", nrBileteVandute=");
		builder.append(nrBileteVandute);
		builder.append(", nrSticleVandute=");
		builder.append(nrSticleVandute);
		builder.append(", nrJandarmi=");
		builder.append(nrJandarmi);
		builder.append("]");
		return builder.toString();
	}
	public String getNumeGazda() {
		return numeGazda;
	}
	public String getNumeOaspeti() {
		return numeOaspeti;
	}
	public int getNrSpectatori() {
		return nrSpectatori;
	}
	public int getNrBileteVandute() {
		return nrBileteVandute;
	}
	public int getNrSticleVandute() {
		return nrSticleVandute;
	}
	public int getNrJandarmi() {
		return nrJandarmi;
	}
	public void setNumeGazda(String numeGazda) {
		this.numeGazda = numeGazda;
	}
	public void setNumeOaspeti(String numeOaspeti) {
		this.numeOaspeti = numeOaspeti;
	}
	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}
	public void setNrBileteVandute(int nrBileteVandute) {
		this.nrBileteVandute = nrBileteVandute;
	}
	public void setNrSticleVandute(int nrSticleVandute) {
		this.nrSticleVandute = nrSticleVandute;
	}
	public void setNrJandarmi(int nrJandarmi) {
		this.nrJandarmi = nrJandarmi;
	}
	public Memento creareMemento() {
		Memento m=new Memento(numeOaspeti,numeGazda,nrSpectatori);
		return m;
		
	}
	
	public void setMemento(Memento memento) {
		nrSpectatori=memento.getNrSpectatori();
		numeGazda=memento.getNumeGazda();
		numeOaspeti=memento.getNumeOaspeti();
	}

}
