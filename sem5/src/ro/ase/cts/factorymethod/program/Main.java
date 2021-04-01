package ro.ase.cts.factorymethod.program;
import ro.ase.cts.factorymethod.clase.*;

public class Main {

	public static void printeazaPersonalSpital(FactoryPersonal fabrica,String nume)
	{
		PersonalSpital personal=fabrica.getPersonal(nume);
		System.out.println(personal.toString());
	}
	public static void main(String[] args) {
		printeazaPersonalSpital(new MedicFactory(),"Ion");
		printeazaPersonalSpital(new AsistentFactory(),"Maria");
		printeazaPersonalSpital(new InfirmierFactory(),"Raluca");
	}

}