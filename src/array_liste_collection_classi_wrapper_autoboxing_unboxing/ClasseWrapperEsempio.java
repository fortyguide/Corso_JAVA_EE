package array_liste_collection_classi_wrapper_autoboxing_unboxing;

public class ClasseWrapperEsempio {

    public static void main(String[] args) {

        /* É solo un dato primitivo, per cui JAVA non gli mette a disposizione alcun metodo */
        int a = 10;

        /* É un oggetto di tipo intero, per cui JAVA gli mette a disposizione dei metodi */
        Integer b = new Integer(10);

        Integer c = new Integer(a);

    }

}
