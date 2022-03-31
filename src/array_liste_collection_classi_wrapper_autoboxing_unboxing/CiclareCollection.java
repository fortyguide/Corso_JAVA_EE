package array_liste_collection_classi_wrapper_autoboxing_unboxing;

import programmazione_a_oggetti_esempio.Smartphone;

import java.util.*;

public class CiclareCollection {

    public static void main(String[] args) {
        CiclareCollection cc = new CiclareCollection();
        cc.esempioIterazione();
    }

    public void esempioIterazione(){

        /* Dichiarazione lista e popolamento */

        List<String> lista = new ArrayList<String>();

        lista.add("Paolo");
        lista.add("Mario");
        lista.add("Chiara");
        lista.add("Marta");

        /* Metodo 1 di iterazione per liste: for */

        System.out.print("Risultato iterazione con for su lista = ");
        for(int i = 0; i < lista.size(); i++){
            String nome = lista.get(i);

            System.out.print(nome + " ");
        }

        System.out.println();
        System.out.println("-------------------------------");

        /* Metodo 2 di iterazione per liste: foreach */

        System.out.print("Risultato iterazione con foreach su lista = ");

        for (String nome : lista) {
            System.out.print(nome + " ");
        }

        System.out.println();
        System.out.println("-------------------------------");

        /* Metodo 3 di iterazione per liste: interfaccia Iterator */

        System.out.print("Risultato iterazione con interfaccia Iterator su lista = ");

        Iterator<String> it = lista.iterator();

        while(it.hasNext()){
            String nome = it.next();

            System.out.print(nome + " ");
        }

        System.out.println();
        System.out.println("-------------------------------");

        /* Dichiarazione mappa e popolamento */

        Map<String, Smartphone> mappa = new HashMap<String, Smartphone>();

        Smartphone sm = new Smartphone();
        sm.setMarca("Apple");
        sm.setModello("iPhone");

        mappa.put(sm.getModello(), sm);

        Smartphone sm2 = new Smartphone();
        sm2.setMarca("Samsung");
        sm2.setModello("Galaxy");

        mappa.put(sm2.getModello(), sm2);

        Set<String> chiavi = mappa.keySet();

        /* Metodo 1 di iterazione per le chiavi delle mappe: foreach */

        System.out.print("Risultato iterazione con foreach sulle chiavi di una mappa = ");

        for (String string : chiavi){
            System.out.print(string + " ");
        }

        System.out.println();
        System.out.println("-------------------------------");

        /* Metodo 2 di iterazione per le chiavi delle mappe: interfaccia Iterator */

        System.out.print("Risultato iterazione con interfaccia Iterator sulle chiavi di una mappa = ");

        Iterator<String> it2 = chiavi.iterator();

        while (it2.hasNext()){
            String chiave = it2.next();

            System.out.print(chiave + " ");
        }

        System.out.println();
        System.out.println("-------------------------------");

    }
}
