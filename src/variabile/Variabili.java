package variabile;

public class Variabili {
    public int b = 5; /*variabile d'istanza*/

    public static String stampa = "Ciao"; /*variabile di classe*/

    public static void main(String[] args) { /*la variabile args è un parametro*/

        Variabili c = new Variabili();
        c.b = 10; /*richiamo e modifica della variabile d'istanza, che richiede
                  la creazione di un oggetto con new*/

        System.out.println(Variabili.stampa); /*richiamo della variabile di classe, che non richiede
                                               la creazione di un oggetto con new*/

        int a = 10; /*variabile locale*/

        Variabili v; /*dichiarazione*/

        v = new Variabili();/*inizializzazione*/

        Variabili v2 = new Variabili();/*dichiarazione e inizializzazione*/
    }
}
