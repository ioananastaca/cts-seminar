package ro.ase.cts.clase.Observer;

public class Client implements Observer{
	
	private String name;

	public Client(String name) {
		super();
		this.name = name;
	}

	@Override
	public void receptioneazaMesaj(String mesaj) {
		// TODO Auto-generated method stub
		System.out.println(name +" ai primit mesajul "+ mesaj);
	}
	
 

}
