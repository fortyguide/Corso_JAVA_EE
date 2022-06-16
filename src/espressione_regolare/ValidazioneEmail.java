package espressione_regolare;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidazioneEmail {

    public static void main(String[] args) {

        ValidazioneEmail validazioneEmail = new ValidazioneEmail();
        System.out.println(validazioneEmail.emailFormatValidator("info@paolopreite.it"));// true
        System.out.println(validazioneEmail.emailFormatValidator("paolo.preite@paolopreite.it"));// true
        System.out.println(validazioneEmail.emailFormatValidator("paolo_preite@paolopreite.it"));// true
        System.out.println(validazioneEmail.emailFormatValidator("paolo-preite@paolopreite.it"));// true
        System.out.println(validazioneEmail.emailFormatValidator("paolo-preite@paolopreite.com"));// true
        System.out.println(validazioneEmail.emailFormatValidator("paolo-preite@paolopreite.co.uk"));// true
        System.out.println(validazioneEmail.emailFormatValidator("paolo-preite@paolopreite.name"));// true
        System.out.println(validazioneEmail.emailFormatValidator("paolo%preite@paolopreite.it"));// false
        System.out.println(validazioneEmail.emailFormatValidator("Prova"));// false
        System.out.println(validazioneEmail.emailFormatValidator("info@test.comoi"));// false
        System.out.println(validazioneEmail.emailFormatValidator("@paolopreite.it"));// false

    }

    public boolean emailFormatValidator(String date) {

        String regex = "[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}";;

        /* Si crea un oggetto Pattern, passandogli l'espressione regolare */
        Pattern pattern = Pattern.compile(regex);

        /* A questo punto, invece, si passa in ingresso l'email*/
        Matcher matcher = pattern.matcher(date);

        /* Il metodo matches ritorna true se la stringa rispetta
        i criteri dell'espressione regolare, altrimenti false */
        if(matcher.matches()) {
            return true;
        }
        return false;
    }
}
