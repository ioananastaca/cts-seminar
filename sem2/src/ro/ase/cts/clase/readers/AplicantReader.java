package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class AplicantReader {
	
	protected String fileName;

	public AplicantReader(String fileName) {
		super();
		this.setFileName(fileName);
	}
	
	
	
	
	
	public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;





	public String getFileName() {
		return fileName;
	}





	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}