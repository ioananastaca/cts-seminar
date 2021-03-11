package ro.ase.cts.program;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Proiect;
import ro.ase.cts.clase.Student;

import java.io.FileNotFoundException;
import java.util.List;
import ro.ase.cts.clase.readers.*;
public class Program {
	
	public static List<Aplicant> citesteAplicanti(AplicantReader reader) throws FileNotFoundException
	{
		return reader.readAplicanti();
	}
	
	public static void main(String[] args) {
		
		System.out.println(Angajat.getSumaFinantata());
		System.out.println(Student.getSumaFinantata());
		
		Proiect proiectInitial=new Proiect(80);
		
		
		List<Aplicant> listaAngajati;
		try {
			listaAngajati = citesteAplicanti(new AngajatiReader("angajati.txt"));
			for(Aplicant angajat:listaAngajati)
			{
				System.out.println(angajat.toString());
				System.out.println("\nAngajatul primeste:" + angajat.getFinantatare());
				angajat.afisareStatutPeProiect(proiectInitial);
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 

}