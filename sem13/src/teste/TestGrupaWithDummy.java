package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;
import clase.IStudent;
import ro.ase.cts.clase.dubluri.StudentDummy;

public class TestGrupaWithDummy {

	@Test
	public void testAdaugaStudent() {
		IStudent student=new StudentDummy();
		Grupa grupa=new Grupa(1083);
		grupa.adaugaStudent(student);
		assertEquals(1,grupa.getStudenti().size());
		
	}

}
