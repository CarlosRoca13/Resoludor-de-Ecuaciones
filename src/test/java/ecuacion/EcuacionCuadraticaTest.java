package ecuacion;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class EcuacionCuadraticaTest {
    @Test
    public void cCeroTest() {
        EcuacionCuadratica ecuacionCuadratica = new EcuacionCuadratica(1,2,0); //x^2 + 2x = 0
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(0).getReal(), is(0.0));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(1).getReal(), is(-2.0));

        ecuacionCuadratica = new EcuacionCuadratica(3,1,0); //3x^2 + x = 0
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(0).getReal(), is(0.0));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(1).getReal(), is(-1.0/3.0));

        ecuacionCuadratica = new EcuacionCuadratica(-3,1,0); //-3x^2 + x = 0
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(0).getReal(), is(0.0));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(1).getReal(), is(1.0/3.0));

    }
    @Test
    public void bCeroRaicesSimplesTest() {
        EcuacionCuadratica ecuacionCuadratica = new EcuacionCuadratica(1,0,-1); //x^2 - 1 = 0
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(0).getReal(), is(1.0));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(1).getReal(), is(-1.0));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(0).getImaginario(), is(0.0));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(1).getImaginario(), is(0.0));

        ecuacionCuadratica = new EcuacionCuadratica(4,0,-8); //4x^2 - 8 = 0
        // TODO Podeis sobreescribir el método equals tal y como lo hemos visto en clase.
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(0).getReal(), is(Math.sqrt(2)));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(1).getReal(), is(-Math.sqrt(2)));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(0).getImaginario(), is(0.0));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(1).getImaginario(), is(0.0));
    }

    @Test
    public void bCeroRaicesComplejasTest() {
        EcuacionCuadratica ecuacionCuadratica = new EcuacionCuadratica(1,0,1); //x^2 + 1 = 0
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(0).getReal(), is(0.0));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(1).getReal(), is(0.0));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(0).getImaginario(), is(1.0));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(1).getImaginario(), is(-1.0));

        ecuacionCuadratica = new EcuacionCuadratica(4,0,8); //4x^2 + 8 = 0
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(0).getReal(), is(0.0));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(1).getReal(), is(0.0));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(0).getImaginario(), is(Math.sqrt(2)));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(1).getImaginario(), is(-Math.sqrt(2)));
    }

    @Test
    public void todosCeroMenosATest() {
        EcuacionCuadratica ecuacionCuadratica = new EcuacionCuadratica(1,0,0); //x^2 = 0
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(0).getReal(), is(0.0));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(1).getReal(), is(0.0));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(0).getImaginario(), is(0.0));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(1).getImaginario(), is(0.0));

        ecuacionCuadratica = new EcuacionCuadratica(-4,0,0); //-4x^2  = 0
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(0).getReal(), is(0.0));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(1).getReal(), is(0.0));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(0).getImaginario(), is(0.0));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(1).getImaginario(), is(0.0));
    }

    @Test
    public void todasDistintasDeCeroSimplesTest() {
        EcuacionCuadratica ecuacionCuadratica = new EcuacionCuadratica(1,-4,4); //x^2 - 4x + 4= 0
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(0).getReal(), is(2.0));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(1).getReal(), is(2.0));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(0).getImaginario(), is(0.0));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(1).getImaginario(), is(0.0));

        ecuacionCuadratica = new EcuacionCuadratica(1,-2,-3); //x^2 - 2x + 3= 0
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(0).getReal(), is(3.0));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(1).getReal(), is(-1.0));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(0).getImaginario(), is(0.0));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(1).getImaginario(), is(0.0));

    }

    @Test
    public void todasDistintasDeCeroComplejasTest() {
        EcuacionCuadratica ecuacionCuadratica = new EcuacionCuadratica(1,1,1); //x^2 + x + 1= 0
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(0).getReal(), is(-1.0/2));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(1).getReal(), is(-1.0/2));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(0).getImaginario(), is(Math.sqrt(3)/2));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(1).getImaginario(), is(-Math.sqrt(3)/2));

        ecuacionCuadratica = new EcuacionCuadratica(1,-2,2); //x^2 - 2x + 2= 0
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(0).getReal(), is(1.0));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(1).getReal(), is(1.0));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(0).getImaginario(), is(1.0));
        assertThat(ecuacionCuadratica.resuelveCuadratico().get(1).getImaginario(), is(-1.0));

    }


}
