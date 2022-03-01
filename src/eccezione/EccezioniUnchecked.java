package eccezione;

public class EccezioniUnchecked {

    public static void main(String[] args) {

        EccezioniUnchecked eu = new EccezioniUnchecked();
        eu.stampaTesto(null);//NullPointerException

    }

    private void stampaTesto(String testo){

        String tmp = testo.concat("...");

        System.out.println(tmp);
    }
}
