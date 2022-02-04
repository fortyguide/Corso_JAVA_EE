package costruttore;

import programmazione_a_oggetti_esempio.ereditarieta.Televisore;

public class MainProdotto {

    public static void main(String[] args) {

        Prodotto pDefault = new Prodotto(); /*istanza da costruttore default*/
        Prodotto p = new Prodotto(1, "Paolo", 0);

        System.out.println(p.getId() + " " + p.getNome()+ " " + p.getPrezzo());//1 Paolo... 1.0

        Televisore t = new Televisore();

        /*La classe Televisore, che estende Prodotto, eredita tutti i metodi della
         * classe madre. Non riesce però ad accedere alle variabili di Prodotto
         * perchè sono definite private*/

        t.setId(2);
        t.setNome("Samsung");
        t.setPrezzo(0);

        System.out.println(t.getId() + " " + t.getNome()+ " " + t.getPrezzo());//2 Samsung... 1.0


    }
}
