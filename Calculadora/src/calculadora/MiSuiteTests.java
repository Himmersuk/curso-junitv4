package calculadora;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
//ejecuta las pruebas dependiendo como están en la lista
@Suite.SuiteClasses({
	CalculadoraTest.class, CalculadoraParamsTest.class
})
public class MiSuiteTests {

}
