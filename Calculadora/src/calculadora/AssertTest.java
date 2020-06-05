package calculadora;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class AssertTest {

	@Test
	public void test() {
		assertEquals("3 es distinto de 4",3, 4);
	}
	
	@Test
	public void test2() {
		assertFalse(true);//existe assertTrue
	}
	
	@Test
	public void test3() {
		assertFalse(false);//existe assertTrue
	}
	
	@Test
	public void test4() {
		String s1 = "hola";
		String s2 = "hola";
		assertEquals(s1, s2); //ser�n iguales ya que comprueba car�cter por car�cter
	}
	
	@Test
	public void test5() {
		Date date1 = new Date();
		Date date2 = new Date();
		assertEquals(date1, date2); //ser�n iguales ya que comprueba car�cter por car�cter
		assertSame(date1, date2); // falla porque estan inicializados en distintos new
	}
	
	
	

}
