package ro.ase.cts.clase;

public class Camin {

	private String nume;
	private int locuri;
	private double pretCazare;
	
	private static Camin caminStudentesc=null;
	
	private Camin(String nume, int locuri, double pretCazare) {
		super();
		this.nume = nume;
		this.locuri = locuri;
		this.pretCazare = pretCazare;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Camin [nume=");
		builder.append(nume);
		builder.append(", locuri=");
		builder.append(locuri);
		builder.append(", pretCazare=");
		builder.append(pretCazare);
		builder.append("]");
		return builder.toString();
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public void setLocuri(int locuri) {
		this.locuri = locuri;
	}
	public void setPretCazare(double pretCazare) {
		this.pretCazare = pretCazare;
	}
	
	public static synchronized Camin getInstance(String nume, int nrLocuri, double pretCazare) {
		if(caminStudentesc==null)
		{ 
			caminStudentesc=new Camin(nume,nrLocuri,pretCazare);
		}
		return caminStudentesc;
	}

	
	
}
