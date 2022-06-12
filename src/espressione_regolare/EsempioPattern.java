package espressione_regolare;

import java.util.regex.Pattern;

public class EsempioPattern {

    public static void main(String[] args) {
        /* Creazione dell'istanza Pattern */
        Pattern p = Pattern.compile("\\d");

        /*-------------------------------*/
        String elenco = "1. Juventus, 2. Roma, 3. Napoli, 4. Atalanta, 5. Lazio";

        /* split() suddivide la stringa su cui viene richiamato,
        basandosi sull'espressione regolare specificata nel compile(),
        e restituisce un array di stringhe */
        String[] elencoArray = p.split(elenco);

        for (int i = 1; i < elencoArray.length; i++){
            System.out.println(elencoArray[i].replaceAll(",", ""));/* . Juventus
                                                                                     . Roma
                                                                                     . Napoli
                                                                                     . Atalanta
                                                                                     . Lazio */
        }
        System.out.println();
        /*-------------------------------*/

        /*-------------------------------*/
        String testo = "info@paolopreite.it";

        /* matches() ritorna true se l'espressione regolare in input si trova
        * all'interno del testo, altrimenti false */
        boolean match = Pattern.matches(".*@.*", testo);
        System.out.println("il testo contiene la @? " + match); // true
        System.out.println();
        /*-------------------------------*/

        /*-------------------------------*/
        /* pattern() restituisce l'espressione regolare
           specificata nel compile()*/
        System.out.println(p.pattern()); // \d
        System.out.println();
        /*-------------------------------*/

        /*-------------------------------*/
        /*Il flag CASE_INSENSITIVE permette di trascurare
        * se una lettera è maiuscola o minuscola*/
        p = Pattern.compile("Paolo", Pattern.CASE_INSENSITIVE);

        String[] elencoArray2 = p.split(testo);

        for (int i = 0; i < elencoArray2.length; i++) {
            System.out.println(elencoArray2[i]); /* info@
                                                    preite.it */
        }
        System.out.println();
        /*-------------------------------*/

        /*-------------------------------*/
        /*flags() restituisce il valore intero del flag utilizzato nel compile.
        * In questo casa il flag CASE_INSENSITIVE vale 2*/
        System.out.println(p.flags()); // 2;
        /*-------------------------------*/

    }

}
