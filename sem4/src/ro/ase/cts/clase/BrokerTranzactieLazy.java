package ro.ase.cts.clase;

public class BrokerTranzactieLazy {
	private String nume;
	private int vechime;
	private int nrTranzactiiEfectuate;
	
	private static BrokerTranzactieLazy brokerTranzactieLazy=null;
		
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BrokerTranzactieLazy [nume=");
		builder.append(nume);
		builder.append(", vechime=");
		builder.append(vechime);
		builder.append(", nrTranzactiiEfectuate=");
		builder.append(nrTranzactiiEfectuate);
		builder.append("]");
		return builder.toString();
	}
	private BrokerTranzactieLazy(String nume, int vechime, int nrTranzactiiEfectuate) {
		super();
		this.nume = nume;
		this.vechime = vechime;
		this.nrTranzactiiEfectuate = nrTranzactiiEfectuate;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public void setVechime(int vechime) {
		this.vechime = vechime;
	}
	public void setNrTranzactiiEfectuate(int nrTranzactiiEfectuate) {
		this.nrTranzactiiEfectuate = nrTranzactiiEfectuate;
	}
	
	public static BrokerTranzactieLazy getInstance(String nume, int vechime, int nrTranzactii) {
		if(brokerTranzactieLazy==null)
		{ //apelam constr doar daca este null
			brokerTranzactieLazy=new BrokerTranzactieLazy(nume,vechime,nrTranzactii);
		}
		return brokerTranzactieLazy;
	}

}
