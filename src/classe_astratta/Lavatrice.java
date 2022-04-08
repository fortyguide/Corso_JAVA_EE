package classe_astratta;

public class Lavatrice extends Prodotto{

    @Override
    public double calcolaSpedizione() {
        return 0;
    }

    @Override
    public int calcolaVendite() {
        return 0;
    }
}
