package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	Calculadora calc;
	
	@Before
	public void before() {
		System.out.println("Before");
		calc = new Calculadora();
	}
	
	@After
	public void after() {
		System.out.println("after");
		calc.clear();
	}
	
	@Test
	public void testSum() {
		System.out.println("testSum()");
		int result = calc.add(3,2);
		assertEquals(5, result);
	}
	
	@Test
	public void testAnsSum() {
		System.out.println("testAnsSum()");
		calc.add(3,2);
		int result = calc.ans();
		assertEquals(5, result);
	}
	
	@Test
	public void testDiv() {
		calc.div(5, 2);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDiv2() {
		calc.div(5, 0);
	}
	
	@Test(timeout = 100)
	public void testAlgoritmoOptimo() {
		calc.operacionOptima();
	}
}
