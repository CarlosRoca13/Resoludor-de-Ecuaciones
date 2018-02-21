package ecuacion;

import aritmetica.test.AritmeticaTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ EcuacionLinealTest.class,
                        EcuacionCuadraticaTest.class})
public class AllTest {
}
