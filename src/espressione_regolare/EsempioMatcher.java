package espressione_regolare;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EsempioMatcher {

    public static void main(String[] args) {
        String text =
                "<h1>Titolo 1</h1>" +
                        "<p>Testo A</p>" +
                        "</hr>" +
                        "<p>Testo B</p>" +
                        "<h2>Titolo 2</h2>" +
                        "<p>Testo C</p>";

        /*L'espressione regolare (<p>([^<]+)</p>) è composta dai seguenti gruppi:
        - Gruppo 0 : (<p>([^<]+)</p>);
        - Gruppo 1 : <p>([^<]+)</p>;
        - Gruppo 2 : [^<]+ */
        String regex = "(<p>([^<]+)</p>)";

        Pattern pattern = Pattern.compile(regex);

        /* L'oggetto Matcher applica l'espressione
        regolare regex sulla stringa text */
        Matcher matcher = pattern.matcher(text);

        System.out.println("Gruppi presenti nell'espressione regolare " +
                regex + ": " + matcher.groupCount()); // Gruppi presenti nell'espressione regolare (<p>([^<]+)</p>): 2

        System.out.println();

        /*Finche' trovo occorrenze dell'espressione regolare regex in text...*/
        while (matcher.find()) {

            /* stampa tutto ciò che nel text corrisponde all'intera espressione regolare regex (gruppo 0)*/
            System.out.println(matcher.group()); /* <p>Testo A</p>
                                                    <p>Testo B</p>
                                                    <p>Testo C</p> */

            /* stampa tutto ciò che nel text corrisponde al gruppo 1 dell'espressione regolare regex*/
            System.out.println(matcher.group(1)); /* <p>Testo A</p>
                                                     <p>Testo B</p>
                                                     <p>Testo C</p> */

            /* stampa tutto ciò che nel text corrisponde al gruppo 2 dell'espressione regolare regex*/
            System.out.println(matcher.group(2)); /* Testo A
                                                     Testo B
                                                     Testo C */

            System.out.println("---------------");
        }
    }
}
