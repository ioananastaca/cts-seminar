package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;
import clase.IStudent;
import ro.ase.cts.clase.dubluri.StudentStub;

public class TestPromovabilitateWithStub {

	@Test
	public void testPromovabilitateLimitaSuperioara() {
		Grupa grupa=new Grupa(1083);
		IStudent studen=new StudentStub();
		grupa.adaugaStudent(studen);
		assertEquals(1,grupa.getPromovabilitate(),0.01);
	}

}
