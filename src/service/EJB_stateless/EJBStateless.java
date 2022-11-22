package service.EJB_stateless;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class EJBStateless implements EJBStatelessLocal, EJBStatelessRemote {

    public EJBStateless() {

    }

    @Override
    public String saluto() {
        return "Ciao sono un EJB!";
    }

    @Override
    public void stampaFattura() {

    }

    @Override
    public void salvaFattura() {

    }

    @Override
    public void collegamentoServizio() {

    }
}
