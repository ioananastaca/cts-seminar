package teste;

import static org.junit.Assert.*;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import clase.Student;
import ro.ase.cts.categorii.GetPromovabilitateCategory;
import ro.ase.cts.categorii.TesteNormaleCategory;
import ro.ase.cts.categorii.TesteUrgenteCategory;

public class TestGrupa {
	
	@Test
	public void testConstructorCorrect() {
		Grupa grupa=new Grupa(1083);
		assertEquals(1083, grupa.getNrGrupa());
	}

	@Test
	public void testConstructorLimitaInferioara()
	{
		Grupa grupa=new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	@Test
	public void testConstructorLimitaSuperioara()
	{
		Grupa grupa=new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	@Test(expected=IllegalArgumentException.class)
	public void testConstructorShouldThrowException()
	{
		Grupa grupa=new Grupa(988);
		
	}
	@Test(expected=IllegalArgumentException.class)
	public void testConstructorShouldThrowExceptionInAfaraLimiteiSuperioare()
	{
		Grupa grupa=new Grupa(1123);
		
	}
	@Test(timeout=500)
	@Category(TesteUrgenteCategory.class)
	public void testConstructorPerformanta()
	{
		Grupa grupa=new Grupa(1082);
	}
	@Test
	@Category(TesteNormaleCategory.class)
	public void testConstructorExistentaListaStudenti()
	{
		Grupa grupa=new Grupa(1083);
		assertNotNull(grupa.getStudenti());
	}
	@Test
	@Category({GetPromovabilitateCategory.class,TesteNormaleCategory.class})
	public void testPromovabilitate() {
		Grupa grupa = new Grupa(1083);
		for(int i=0; i<3; i++) {
			Student student = new Student("Andreea");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		for(int i =0; i<7; i++) {
			Student student = new Student("Ioana");
			student.adaugaNota(9);
			grupa.adaugaStudent(student);
		}
		float promovabilitate = 0.7f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(), 0.1);
	}

	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testPromovabilitateLowerBoundery()
	{
		Grupa grupa=new Grupa(1083);
		for(int i=0;i<5;i++)
		{
			Student student=new Student("raluca");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		float promovabilitate=0f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(),0.1);
	}
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testPromovabilitateUpperBoundery()
	{
		Grupa grupa=new Grupa(1083);
		for(int i=0;i<5;i++)
		{
			Student student=new Student("raluca");
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		float promovabilitate=1f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(),0.1);
	}
	@Test(expected=IndexOutOfBoundsException.class)
	@Category(GetPromovabilitateCategory.class)
	public void testPromovabilitateBoundsException()
	{
		Grupa grupa=new Grupa(1083);
		grupa.getPromovabilitate();
	}
	
	
}