package ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int an_studii;
	private static int sumaFinantata=30;
	
	
	public static int getSumaFinantata() {
		return sumaFinantata;
	}
	public static void setSumaFinantata(int sumaFinantata) {
		Student.sumaFinantata = sumaFinantata;
	}
	public String getFacultate() {
		return facultate;
	}
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public int getAn_studii() {
		return an_studii;
	}
	public void setAn_studii(int an_studii) {
		this.an_studii = an_studii;
	}


	public Student() {
		super();
		
	}
	
	public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int an_studii) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.facultate = facultate;
		this.an_studii = an_studii;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Student: ");
		builder.append(super.toString());
		builder.append ("Faculatate=" + facultate );
		builder.append ("An studiu=" + an_studii ); 
		return builder.toString();
	}
	
	

	
	@Override
	public int getFinantatare() {
		return sumaFinantata;
	}
}
