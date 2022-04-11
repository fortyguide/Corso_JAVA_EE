package generics;

import classe_inner_local_anonima.Appartamento;

import java.util.List;
import java.util.ArrayList;

public class MainGenerics {

    public static void main(String[] args) {

        /* senza generics */
         List lista1 = new ArrayList();

         /* senza generics posso aggiungere elementi di tipo diverso,
         * ma ciò può creare problemi */
         lista1.add("es 1");
         lista1.add("es 2");
         lista1.add(new Appartamento());

         String test1 = (String) lista1.get(0);

        /* con generics */
        List<String> lista2 = new ArrayList<>();

        lista2.add("es 3");
        lista2.add("es 4");

        String test2 = lista2.get(0);
    }
}
