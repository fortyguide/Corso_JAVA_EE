package espressione_regolare;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidazioneData {

    public static void main(String[] args) {

        ValidazioneData validazioneData = new ValidazioneData();
        System.out.println(validazioneData.dateFormatValidator("10/12/2016"));// true
        System.out.println(validazioneData.dateFormatValidator("10-12-2016"));// true
        System.out.println(validazioneData.dateFormatValidator("31-12-2016"));// true
        System.out.println(validazioneData.dateFormatValidator("31-12-1899"));// false
        System.out.println(validazioneData.dateFormatValidator("31\\12\\1899"));// false
        System.out.println(validazioneData.dateFormatValidator("2016/02/14"));// false
        System.out.println(validazioneData.dateFormatValidator("12/2016"));// false
        System.out.println(validazioneData.dateFormatValidator("2016/02/14"));// false
        System.out.println(validazioneData.dateFormatValidator("dd/mm/yyyy"));// false
    }

    public boolean dateFormatValidator(String date) {

        String regex = "(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[-/.](19|20)\\d\\d";

        /* Si crea un oggetto Pattern, passandogli l'espressione regolare */
        Pattern pattern = Pattern.compile(regex);

        /* A questo punto, invece, si passa in ingresso la data*/
        Matcher matcher = pattern.matcher(date);

        /* Il metodo matches ritorna true se la stringa rispetta
        i criteri dell'espressione regolare, altrimenti false */
        if(matcher.matches()) {
            return true;
        }
        return false;
    }

}
