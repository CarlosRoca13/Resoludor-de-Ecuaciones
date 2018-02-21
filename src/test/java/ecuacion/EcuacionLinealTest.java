package ecuacion;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class EcuacionLinealTest {

	@Test
	public void terminoIndependienteCeroTest() {
        // A partir de aquí, el código que comprueba que la solución es correcta
	    EcuacionLineal ecuacionLineal = new EcuacionLineal(1, 0); // x + 0 = 0
        assertThat(ecuacionLineal.resuelveLineal(), is(0.0));

        ecuacionLineal = new EcuacionLineal(2, 0); // 2x + 0 = 0
        assertThat(ecuacionLineal.resuelveLineal(), is(0.0));

		ecuacionLineal = new EcuacionLineal(-2, 0); // -2x + 0 = 0
		assertThat(ecuacionLineal.resuelveLineal(), is(0.0));
	}

	@Test
	public void distintosDeCeroTest() {
		EcuacionLineal ecuacionLineal = new EcuacionLineal(1, 1); // x + 1 = 0
		// A partir de aquí, el código que comprueba que la solución es correcta
        assertThat(ecuacionLineal.resuelveLineal(), is(-1.0));

		ecuacionLineal = new EcuacionLineal(2, 1); // 2x + 1 = 0
		// A partir de aquí, el código que comprueba que la solución es correcta
        assertThat(ecuacionLineal.resuelveLineal(), is(-0.5));

		ecuacionLineal = new EcuacionLineal(2, 6); // 2x + 6 = 0
		// A partir de aquí, el código que comprueba que la solución es correcta
		assertThat(ecuacionLineal.resuelveLineal(), is(-3.0));
	}
}
