package eccezione;

public class EccezioniUnchecked {

    public static void main(String[] args) {

        EccezioniUnchecked eu = new EccezioniUnchecked();
        eu.stampaTesto2 (null);

        eu.stampaTesto("testo di prova");

    }

    private void stampaTesto(String testo){

        String tmp = testo.concat("...");

        System.out.println(tmp);// testo di prova...
    }

    private void stampaTesto2(String testo){
        try{
            stampaTesto(testo);
        }catch(Exception e) {}
    }
}
