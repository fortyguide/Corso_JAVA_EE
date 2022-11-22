package service.EJB_stateless;

import javax.ejb.Local;

@Local
public interface EJBStatelessLocal extends EJBStatelessPadre{
    public void salvaFattura();
}
