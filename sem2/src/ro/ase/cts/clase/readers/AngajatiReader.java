package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public class AngajatiReader extends AplicantReader {
	
//	Am facut aceste clase ca sa respecte Single Responsability
	
//	nu folosim ArrayList, folosim List - principiul Dependency Inversion Principle .....
	
	
	public List<Aplicant> readAplicanti() throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(super.fileName));
		scanner.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<Aplicant>();

		while (scanner.hasNext()) {
			Angajat angajat=new Angajat();
			super.readAplicant(scanner,angajat);
			int salariu = scanner.nextInt();
			String ocupatie = scanner.next();
			angajat.setSalariu(salariu);
			angajat.setOcupatie(ocupatie);
			angajati.add(angajat);
		}
		scanner.close();
		return angajati;
	}

	public AngajatiReader(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

}