package aritmetica.test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;

import aritmetica.Aritmetica;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class AritmeticaRestaParametrizadaTest {
    private static Aritmetica aritmetica;
    private double minuendo;
    private double sustraendo;
    private double resultado;

    public AritmeticaRestaParametrizadaTest(float minuendo, float sustraendo, float resultado) {
        this.minuendo = minuendo;
        this.sustraendo = sustraendo;
        this.resultado = resultado;
    }

    @Parameters
    public static Collection<Object[]> parametros() {
        return Arrays.asList(new Object[][]{
                {1, 1, 0},
                {2, 1, 1},
                {1, 2, -1},
                {1001, 1, 1000}
        });
    }

    @BeforeClass
    public static void setUp() {
        aritmetica = new Aritmetica();
    }

    @Test
    public void restasTest() {
        assertThat(aritmetica.resta(minuendo, sustraendo), is(resultado));
    }
}
