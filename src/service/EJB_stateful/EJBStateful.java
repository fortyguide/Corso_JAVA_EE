package service.EJB_stateful;

import javax.ejb.LocalBean;
import javax.ejb.Remove;
import javax.ejb.Stateful;

@Stateful
@LocalBean
public class EJBStateful implements EJBStatefulLocal{
    private int contatore;

    public EJBStateful() {
    }

    public int getContatore() {
        return contatore;
    }

    public void setContatore(int contatore) {
        this.contatore = contatore;
    }

    @Override
    public int incrementa(int c) {
        setContatore(getContatore() + c);
        return getContatore();
    }

    @Override
    @Remove
    public void chiudiConnessione() {

    }
}
