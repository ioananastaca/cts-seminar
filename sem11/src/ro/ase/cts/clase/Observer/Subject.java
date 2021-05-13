package ro.ase.cts.clase.Observer;

public interface Subject {

    public void adaugareAbonat(Observer observer);
	void stergereAbonat(Observer observer);
	void trimiteMesaj(String mesaj);
}
