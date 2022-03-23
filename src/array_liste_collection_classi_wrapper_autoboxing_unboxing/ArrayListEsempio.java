package array_liste_collection_classi_wrapper_autoboxing_unboxing;

import programmazione_a_oggetti_esempio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEsempio {

    public static void main(String[] args) {

        ArrayListEsempio al = new ArrayListEsempio();

        al.esempioArrayList();
    }

    public void esempioArrayList(){
        /*Primo modo per istanziare un oggetto di tipo ArrayList*/
        List<String> lista = new ArrayList<String>();

        lista.add("Paolo");
        lista.add("Mario");
        lista.add("Chiara");
        lista.add("Marta");

        for (String nome: lista){
            System.out.print(nome + " "); //Paolo Mario Chiara Marta
        }
        System.out.println();
        System.out.println("------------------------------------------");

        lista.add(2, "Valerio");

        for (String nome: lista){
            System.out.print(nome + " "); //Paolo Mario Valerio Chiara Marta
        }
        System.out.println();
        System.out.println("------------------------------------------");

        lista.remove(2);

        for (String nome: lista){
            System.out.print(nome + " "); //Paolo Mario Chiara Marta
        }
        System.out.println();
        System.out.println("------------------------------------------");

        lista.set(2, "Claudia");

        for (String nome: lista){
            System.out.print(nome + " "); //Paolo Mario Claudia Marta
        }
        System.out.println();
        System.out.println("------------------------------------------");

        System.out.println(lista.size()); //4

        System.out.println("------------------------------------------");

        System.out.println(lista.isEmpty()); //false

        lista.clear();

        System.out.println("------------------------------------------");

        System.out.println(lista.size()); //0

        System.out.println("------------------------------------------");

        System.out.println(lista.isEmpty()); //true

        lista.add("Paolo");
        lista.add("Mario");
        lista.add("Chiara");
        lista.add("Marta");

        System.out.println("------------------------------------------");

        System.out.println(lista.indexOf("Mario")); //1

        System.out.println("------------------------------------------");

        System.out.println(lista.toString()); //[Paolo, Mario, Chiara, Marta]

        System.out.println("------------------------------------------");

        /*Conversione da Arraylist a Array*/
        String[] listaArray = lista.toArray(new String[lista.size()]);

        for (String nome : listaArray) {
            System.out.print(nome + " "); //Paolo Mario Chiara Marta
        }

        /*Secondo modo per istanziare un oggetto di tipo ArrayList*/
        ArrayList<String> lista2 = new ArrayList<String>();

        List<Smartphone> smartphone = new ArrayList<Smartphone>();

        /* Siccome non abbiamo definito un costruttore per la classe Smartphone, */ 
        /* che specifica in ingresso più parametri per caratterizzare l'oggetto,  */ 
        /* dobbiamo fare nella seguente maniera per aggiungere oggetti di tipo Smartphone */
        /* nell lista dello stesso tipo: */
        Smartphone sm = new Smartphone();
        sm.setMarca("Apple");
        sm.setModello("iPhone");

        smartphone.add(sm);

        Smartphone sm2 = new Smartphone();
        sm2.setMarca("Samsung");
        sm2.setModello("Galaxy");

        smartphone.add(sm2);

    }

}
