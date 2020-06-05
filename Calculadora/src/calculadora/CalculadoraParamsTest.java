package calculadora;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class CalculadoraParamsTest {

	@Parameters
	public static Iterable<Object[]> getData(){
		//se puede hacer así
//		List<Object[]> objs = new ArrayList<>();
//		objs.add(new Object[] {1,2,8});
//		objs.add(new Object[] {1,5,6});
//		objs.add(new Object[] {1,6,7});
//		return objs;
		// o así, esto es más corto
		
		return Arrays.asList(new Object[][] {
			{1,2,3},{1,5,6},{1,6,7}
			});
		
	}
	int a, b , exp; 
	
	public CalculadoraParamsTest(int a , int b, int exp) {
		this.a = a;
		this.b = b;
		this.exp = exp;
	}
	
	@Test
	public void testAdd() {
		Calculadora calc = new Calculadora();
		int result = calc.add(a,b);
		assertEquals(exp, result);
	}

}
