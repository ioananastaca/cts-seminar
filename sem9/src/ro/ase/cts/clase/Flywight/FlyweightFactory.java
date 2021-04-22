package ro.ase.cts.clase.Flywight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	
	private Map<String,Flyweight>clienti;
	
	
	public FlyweightFactory() {
		super();
		this.clienti = new HashMap<String,Flyweight>();
	}


	public Flyweight getClient(String nrTelefon) {
		Flyweight flyweight=clienti.get(nrTelefon);//obtine celelalte informatii
		
		//in cazul in care nr de telefon nu exista in baza de date se creaza cont nou(noi  hardcodam atributele)
		if(flyweight==null) {
			flyweight=new Client("Ioana",nrTelefon,"ioana@mail.com");
			
			//dupa ce l-am creat il adaugam la map
			clienti.put(nrTelefon, flyweight);
		}
		return flyweight;
		
	}
}
