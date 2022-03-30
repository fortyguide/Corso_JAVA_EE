package array_liste_collection_classi_wrapper_autoboxing_unboxing;

import programmazione_a_oggetti_esempio.Smartphone;

import java.util.HashMap;
import java.util.Map;

public class HashMapEsempio {

    public static void main(String[] args) {

        HashMapEsempio m = new HashMapEsempio();
        m.esempioHashMap();
    }

    public void esempioHashMap(){

        /*Primo modo per istanziare un oggetto di tipo HashMap*/
        Map<String, Smartphone> mappa = new HashMap<String, Smartphone>();

        Smartphone sm = new Smartphone();
        sm.setMarca("Apple");
        sm.setModello("iPhone");

        mappa.put(sm.getModello(), sm);

        Smartphone sm2 = new Smartphone();
        sm2.setMarca("Samsung");
        sm2.setModello("Galaxy");

        mappa.put(sm2.getModello(), sm2);

        Smartphone sm3 = mappa.get("iPhone");
        System.out.println(sm3.getMarca() + " " + sm3.getModello()); //Apple iPhone
        System.out.println("------------------------------------------");

        System.out.println(mappa.size()); // 2
        System.out.println("------------------------------------------");

        mappa.clear();

        System.out.println(mappa.size()); // 0
        System.out.println("------------------------------------------");

        Smartphone sm4 = new Smartphone();
        sm4.setMarca("Apple");
        sm4.setModello("iPhone");

        mappa.put(sm.getModello(), sm3);

        Smartphone sm5 = new Smartphone();
        sm5.setMarca("Samsung");
        sm5.setModello("Galaxy");

        mappa.put(sm5.getModello(), sm5);

        mappa.remove("Galaxy");

        System.out.println(mappa.size()); // 1
        System.out.println("------------------------------------------");

        System.out.println(mappa.keySet());// [iPhone]
        System.out.println("------------------------------------------");

        System.out.println(mappa.containsKey("iPhone"));// true

        /*Secondo modo per istanziare un oggetto di tipo HashMap*/
        HashMap<String, Smartphone> mappa2 = new HashMap<String, Smartphone>();

    }
}
