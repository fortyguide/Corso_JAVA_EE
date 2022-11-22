package service.EJB_stateless;

import javax.ejb.Remote;

@Remote
public interface EJBStatelessRemote extends EJBStatelessPadre{
    public void collegamentoServizio();
}
