package esempio_test_case_e_suite;

import org.junit.jupiter.api.Test;
import variabile.Stringhe;

import static org.junit.jupiter.api.Assertions.*;

public class Stringa2Test{

    @Test
    public void verificaNumeroOccorrenze(){
        Stringa stringa = new Stringa();

        String testo = "Oggi è una giornata di sole";

        int occorrenzeCheCiSiAspetta = 3;

        assertEquals(occorrenzeCheCiSiAspetta, stringa.calcoloNumeroOccorrenze(testo, "g"));
    }
}