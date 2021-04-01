package ro.ase.cts.program;

import ro.ase.cts.builder.clase.Rezervare;
import ro.ase.cts.builder.clase.RezervareBuilder;
import ro.ase.cts.builder.clase.RezervareBuilderV2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare rezervare1=new RezervareBuilder(10)
				.setAreBauturaInclusa(true)
				.build();
		
		Rezervare rezervare2=new RezervareBuilder(20)
				.setAreBauturaInclusa(true)
				.setGenMuzica("Pop")
				.build();
		
		Rezervare rezervare3=new Rezervare(false,true,false,false,null,70);
		//shallow copy
		RezervareBuilder newBuilder=new RezervareBuilder().setAreMancareInclusa(true).setAreBauturaInclusa(true).setAreScaunErgonomic(false);
		Rezervare rezervare4=newBuilder.setCodRezervare(80).build();
		Rezervare rezervare5=newBuilder.setCodRezervare(81).build();
	
		System.out.println(rezervare1);
		System.out.println(rezervare2);
		System.out.println(rezervare3);
		
		//v2
		
		RezervareBuilderV2 builderV2=new RezervareBuilderV2();
		
		
		
	}

}
