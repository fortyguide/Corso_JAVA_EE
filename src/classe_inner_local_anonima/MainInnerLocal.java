package classe_inner_local_anonima;

import java.util.List;

public class MainInnerLocal {

    public static void main(String[] args) {

        Appartamento a = new Appartamento();

        a.setPiano(0);

        a.getStanzeSt().add(new StanzaStandard(30,"angolo cottura"));

        /*L'istruzione di seguito è un errore perchè non possiamo istanziare oggetti della classe StanzaInner all'esterno della classe Appartamento*/
        /*a.getStanzeIn().add(new Appartamento.StanzaInner(16,"angolo cottura")); //java: an enclosing instance that contains classe_inner_local_anonima.Appartamento.StanzaInner is required */

        a.aggiungiStanza(16,"angolo cottura");

        List<StanzaStandard> st = a.getStanzeSt();

        for(StanzaStandard stanzaStandard : st){
            System.out.println(stanzaStandard.getMq()); // 30.0
        }

        List<Appartamento.StanzaInner> st2 = a.getStanzeIn();

        for (Appartamento.StanzaInner stanzaInner : st2) {
            System.out.println(stanzaInner.getMq()); // 16.0
        }
    }
}
