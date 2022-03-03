package array_liste_collection_classi_wrapper_autoboxing_unboxing;

import programmazione_a_oggetti_esempio.gestionale.Smartphone;

public class Array {

    public static void main(String[] args) {
        Array array = new Array();
        array.creaArray();
    }

    public void creaArray(){

        int[] test;/*dichiarazione dell'array test*/
        test = new int[5];/*inizializzazione dell'array test*/

        int[] numeri = new int[10];/*definizione e inizializzazione array di elementi di tipo intero*/

        /*Accesso in scrittura all'array di interi in ogni singola posizione*/
        /*###################################################################*/
        numeri[0] = 10;
        numeri[1] = 11;
        numeri[2] = 12;
        numeri[3] = 13;
        numeri[4] = 14;
        numeri[5] = 15;
        numeri[6] = 16;
        numeri[7] = 17;
        numeri[8] = 18;
        numeri[9] = 19;
        /*###################################################################*/

        /*Accesso in scrittura all'array di interi mediante il for*/
        /*###################################################################*/
        for(int i = 0; i < numeri.length; i++){
            numeri[i] = 10+i;
        }
        /*###################################################################*/

        Smartphone[] prodotti = new Smartphone[3];/*definizione e inizializzazione array di oggetti di tipo Smartphone*/

        /*Accesso in scrittura all'array di Smartphone in ogni singola posizione*/
        /*###################################################################*/
        prodotti[0] = new Smartphone();
        prodotti[0].setMarca("Apple");
        prodotti[0].setNome("Iphone");
        /*...*/

        prodotti[1] = new Smartphone();
        prodotti[1].setMarca("Samsung");
        prodotti[1].setNome("Note");
        /*...*/

        prodotti[2] = new Smartphone();
        prodotti[2].setMarca("Huawai");
        prodotti[2].setNome("P8Lite");
        /*...*/
        /*###################################################################*/

        /*Accesso in lettura all'array di Smartphone mediante il for*/
        /*###################################################################*/
        for (int i = 0; i < prodotti.length; i++){
            Smartphone sm = prodotti[i];

            System.out.println(sm.getMarca() + " " + sm.getNome());
        }
        /*###################################################################*/

        /*Accesso in lettura all'array di Smartphone mediante il foreach*/
        /*###################################################################*/
        for (Smartphone sm : prodotti){
            System.out.println(sm.getMarca() + " " + sm.getNome());
        }
        /*###################################################################*/


    }
}
