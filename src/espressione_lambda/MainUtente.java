package espressione_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MainUtente {

    private List<Utente> elencoUtenti() {
        List<Utente> utenti = new ArrayList<Utente>();

        utenti.add(new Utente("Paolo", "Preite", 39, "Roma", "info@paolopreite.it", "test"));
        utenti.add(new Utente("Mario", "Rossi", 40, "Roma", "info@paolopreite.it", "test"));
        utenti.add(new Utente("Antonio", "Di Girolamo", 23, "Roma", "info@paolopreite.it", "test"));
        utenti.add(new Utente("Caterina", "Montefalco", 55, "Roma", "info@paolopreite.it", "test"));
        utenti.add(new Utente("Valeria", "Natelli", 45, "Roma", "info@paolopreite.it", "test"));
        utenti.add(new Utente("Giovanna", "D'Antonelli", 50, "Roma", "info@paolopreite.it", "test"));
        utenti.add(new Utente("Paolo", "Pisani", 21, "Roma", "info@paolopreite.it", "test"));
        utenti.add(new Utente("Laura", "Gambaro", 19, "Roma", "info@paolopreite.it", "test"));
        utenti.add(new Utente("Benedetto", "Satini", 38, "Roma", "info@paolopreite.it", "test"));

        return utenti;
    }

    public List<Utente> cercaUtenti(List<Utente> utenti, Predicate<Utente> p){
        List<Utente> utentiTrovati = new ArrayList<Utente>();

        for (Utente u:utenti) {
            if (p.test(u)) {
                utentiTrovati.add(u);
            }
        }
        return utentiTrovati;
    }

    public static void main(String[] args) {

        MainUtente mainUtente = new MainUtente();

        List<Utente> elenco = mainUtente.elencoUtenti();

        List<Utente> trovati = mainUtente.cercaUtenti(elenco, utente -> utente.getNome().equals("Paolo"));

        for (Utente utenteTrovato : trovati) {
            System.out.println(utenteTrovato.getCognome() + " " + utenteTrovato.getNome()); /*Preite Paolo, Pisani Paolo*/
        }

        Consumer<Utente> consumer = utente ->  System.out.println(utente.getCognome() + " " + utente.getNome());
        elenco.forEach(consumer); /*Preite Paolo
                                    Rossi Mario
                                    Di Girolamo Antonio
                                    Montefalco Caterina
                                    Natelli Valeria
                                    D'Antonelli Giovanna
                                    Pisani Paolo
                                    Gambaro Laura
                                    Satini Benedetto*/

    }
}
