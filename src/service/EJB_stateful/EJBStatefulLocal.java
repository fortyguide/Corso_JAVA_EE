package service.EJB_stateful;

import javax.ejb.Local;

@Local
public interface EJBStatefulLocal {
    public int incrementa(int c);
    public void chiudiConnessione();
}
