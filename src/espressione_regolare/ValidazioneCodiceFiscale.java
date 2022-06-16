package espressione_regolare;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidazioneCodiceFiscale {

    public static void main(String[] args) {
        ValidazioneCodiceFiscale validazioneCodiceFiscale = new ValidazioneCodiceFiscale();
        System.out.println(validazioneCodiceFiscale.CFFormatValidator("PRTPPP77P15H501K"));// true
        System.out.println(validazioneCodiceFiscale.CFFormatValidator("PRTPPP77P15H501KPOOI"));// false
        System.out.println(validazioneCodiceFiscale.CFFormatValidator("PRTPPP77P15H"));// false
        System.out.println(validazioneCodiceFiscale.CFFormatValidator("123PPP77P15H501K"));// false
        System.out.println(validazioneCodiceFiscale.CFFormatValidator("PRT12377P15H501K"));// false
        System.out.println(validazioneCodiceFiscale.CFFormatValidator("PRT123AAP15H501K"));// false
    }

    public boolean CFFormatValidator(String date) {

        String regex = "[a-zA-Z]{6}\\d\\d[a-zA-Z]\\d\\d[a-zA-Z]\\d\\d\\d[a-zA-Z]";

        /* Si crea un oggetto Pattern, passandogli l'espressione regolare */
        Pattern pattern = Pattern.compile(regex);

        /* A questo punto, invece, si passa in ingresso il codice fiscale*/
        Matcher matcher = pattern.matcher(date);

        /* Il metodo matches ritorna true se la stringa rispetta
        i criteri dell'espressione regolare, altrimenti false */
        if(matcher.matches()) {
            return true;
        }
        return false;
    }
}
