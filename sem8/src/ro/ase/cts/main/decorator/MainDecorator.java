package ro.ase.cts.main.decorator;

import ro.ase.cts.clase.decorator.DecoratorAbstract;
import ro.ase.cts.clase.decorator.DecoratorNotaLaMultiAni;
import ro.ase.cts.clase.decorator.DecoratorNotaPasteFericit;
import ro.ase.cts.clase.decorator.NotaAbstracta;
import ro.ase.cts.clase.decorator.NotaDePlata;

public class MainDecorator {

	public static void main(String[] args) {
		
		NotaAbstracta nota=new NotaDePlata(100);
		nota.printeaza();
		
		//adaugam decoratie
		DecoratorAbstract decorator=new DecoratorNotaLaMultiAni(nota);
		decorator.printeaza();
		decorator.printeazaFelicitare();
		
		//spatiu
		System.out.println();
		
		DecoratorAbstract decorator2=new DecoratorNotaPasteFericit(nota);
		decorator2.printeaza();

		System.out.println();
		//ambele functionalitati
		NotaAbstracta nota2=new NotaDePlata(36);
		DecoratorAbstract decorator3=new DecoratorNotaLaMultiAni(nota2);
		DecoratorAbstract decorator4=new DecoratorNotaPasteFericit(decorator3);
		decorator4.printeaza();
	}

}
