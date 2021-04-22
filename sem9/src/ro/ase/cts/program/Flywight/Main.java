package ro.ase.cts.program.Flywight;

import ro.ase.cts.clase.Flywight.Flyweight;
import ro.ase.cts.clase.Flywight.FlyweightFactory;
import ro.ase.cts.clase.Flywight.Rezervare;

public class Main {

	public static void main(String[] args) {
		Rezervare r1=new Rezervare(5, 3, 17);
		Rezervare r2=new Rezervare(4, 2, 18);
		Rezervare r3=new Rezervare(2, 7, 19);
		
		FlyweightFactory fabrica=new FlyweightFactory();
		
		fabrica.getClient("071111").printeazaRezervare(r1);
		fabrica.getClient("072222").printeazaRezervare(r2);
		fabrica.getClient("071111").printeazaRezervare(r3);
	}

}
