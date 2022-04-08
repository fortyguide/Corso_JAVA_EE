package classe_astratta;

public class Televisore extends Prodotto{

    @Override
    public double calcolaSpedizione() {
        return 0;
    }

    @Override
    public int calcolaVendite() {
        return 0;
    }
}
