package variabile;

public class Stringhe {

    public static void main(String[] args) {

        /*String val1 = "Lorem ipsum...";
        String val2 = "test,,,,";

        String val3 = val1 + val2;
        System.out.println(val3);//Lorem ipsum...test,,,,

        String val4 = val1.concat(val2);
        System.out.println(val4);//Lorem ipsum...test,,,,*/

        String val5 = "Questo e' il corso Java AVANZATO";

        /* replace */
        String val6 = val5.replace("a", "!");
        System.out.println(val6); //Questo e' il corso J!v! AVANZATO

        /* replaceAll*/
        String val7 = val5.replaceAll("[a-n]+", "4");/*tutte le lettere dalla a alla n
                                                                      minuscole sono sostituite dal 4*/
        System.out.println(val7); //Qu4sto 4' 4 4orso J4v4 AVANZATO

        /* replaceFirst*/
        String val8 = val5.replaceFirst("[a-n]+", "P");/*sostituisce con P solo la prima
                                                                          lettera trovata nella stringa
                                                                          tra a e n minuscola*/
        System.out.println(val8); //QuPsto e' il corso Java AVANZATO

        /*substring*/
        String val9 = val5.substring(5);
        System.out.println(val9);//o e' il corso Java AVANZATO

        String val10 = val5.substring(0, 5);
        System.out.println(val10);//Quest

        /*equals*/
        String val11 = "Paolo Preite";
        String val12 = "paolo preite";
        System.out.println(val11.equals(val12));//false
        System.out.println(val11.equalsIgnoreCase(val12));//true

        /*split*/
        String[] array = val11.split(" ");

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);//Paolo
                                         //Preite
        }

        /*startsWith e endsWith*/
        System.out.println(val11.startsWith("Pao"));//true
        System.out.println(val11.endsWith("Pao"));//false

        /*charAt*/
        System.out.println(val11.charAt(3));//l
    }
}
