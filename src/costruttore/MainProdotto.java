package costruttore;

public class MainProdotto {

    public static void main(String[] args) {

        Prodotto pDefault = new Prodotto(); /*istanza da costruttore default*/
        Prodotto p = new Prodotto(1, "Paolo", 0);

        System.out.println(p.getId() + " " + p.getNome()+ " " + p.getPrezzo());
    }
}
