package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume="Gigel";
		Student student=new Student(nume);
		assertEquals("numele nu a fost initializat.",nume,student.getNume());
		//assertNotEquals(null,student.getNote());
		assertNotNull("lista de note nu a fost initializata.",student.getNote());
	}

	@Test
	public void testConstructorFaraParametri() {
		Student student=new Student();
		assertNotNull("numele nu a fost initializat.",student.getNume());
		assertNotNull("lista de note nu a fost initializata.",student.getNote());
	}
	
	@Test
	public void testSetterNume() {
		String nume="Gigel";
		Student student=new Student();
		student.setNume(nume);
		assertEquals(nume,student.getNume());
	}
	
	@Test
	public void testAdaugareNotaLista() {
		Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(nota,student.getNota(0));
	}
	
	@Test
	public void testDiemnsiuneLista() {
		Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(1,student.getNote().size());
	}
	
	@Test
	public void testCalculeazaMedie() {
		Student student=new Student();
		int nota1=10;
		int nota2=6;
		int nota3=4;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		float medie=(nota1+nota2+nota3)/3.0f;
		assertEquals(medie,student.calculeazaMedie(),0.01);//0.01 - pt ca float marja de eroare
		
	}
	
	@Test
	public void testCalculeazaMediePtONota() {
		Student student=new Student();
		int nota1=10;
		student.adaugaNota(nota1);
		assertEquals(nota1,student.calculeazaMedie(),0.01);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testCalculeazaMediePtZeroNote() {
		Student student=new Student();
		student.calculeazaMedie();
	}
	
	
	@Test
	public void testAreRestante() {
		Student student=new Student();
		int nota1=8;
		int nota2=3;
		int nota3=2;
		student.adaugaNota(nota3);
		student.adaugaNota(nota2);
		student.adaugaNota(nota1);
		
		assertTrue(student.areRestante());
	}
	
	
	@Test
	public void testNuAreRestante() {
		Student student=new Student();
		int nota1=8;
		int nota2=9;
		int nota3=10;
		student.adaugaNota(nota3);
		student.adaugaNota(nota2);
		student.adaugaNota(nota1);
		
		assertFalse(student.areRestante());
	}
	
	@Test
	public void testGetNotaPozitieIncorecta() {
		Student student=new Student();
		int nota1=8;
		int nota2=9;
		int nota3=10;
		student.adaugaNota(nota3);
		student.adaugaNota(nota2);
		student.adaugaNota(nota1);
		//1
		try {
			//2
			student.getNota(3);
			//3
			fail("metoda nu arunca exceptie");
		}catch(IndexOutOfBoundsException exceptie) {
			//4
		}
		//5
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testAdaugaNotaIncorecta() {
		Student student=new Student();
		int nota1=14;
		student.adaugaNota(nota1);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
