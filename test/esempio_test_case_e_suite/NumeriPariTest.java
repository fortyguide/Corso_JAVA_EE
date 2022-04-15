package esempio_test_case_e_suite;

import static  org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class NumeriPariTest{
    private int numeroTestato;
    private boolean risultatoAtteso;

    @Parameterized.Parameters
    public static Collection<Object[]> getParam() {
        return Arrays.asList(new Object[][] {
                {1, false},
                {2, true},
                {3, false},
                {4, true},
                {5, false},
                {6, true},
                {7, false},
                {8, true},
                {9, false},
                {10, true}
        });
    }

    public NumeriPariTest(int numeroTestato, boolean risultatoAtteso) {
        this.numeroTestato = numeroTestato;
        this.risultatoAtteso = risultatoAtteso;
    }

    @Test
    public void testNumeroPari() {
        NumeriPari numeriPari = new NumeriPari();

        System.out.println("Eseguo il test con il numero " + numeroTestato);

        assertEquals(risultatoAtteso, numeriPari.numeroPari(numeroTestato));
    }
}