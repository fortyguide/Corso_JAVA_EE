package programmazione_a_oggetti_esempio.gestionale;

import java.util.Date;
import java.util.List;

public class OrdineDiVendita {

    private long id;
    private Cliente cliente;
    private Date dataOrdine;
    private String statoOrdine;
    private List<RigaOrdine> righeOrdine;

    public static final String STATO_IN_ATTESA = "STATO IN ATTESA";
    public static final String STATO_SPEDITO = "STATO SPEDITO";
    public static final String STATO_CONSEGNATO = "STATO CONSEGNATO";

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataOrdine() {
        return dataOrdine;
    }

    public void setDataOrdine(Date dataOrdine) {
        this.dataOrdine = dataOrdine;
    }

    public String getStatoOrdine() {
        return statoOrdine;
    }

    public void setStatoOrdine(String statoOrdine) {
        this.statoOrdine = statoOrdine;
    }

    public List<RigaOrdine> getRigheOrdine() {
        return righeOrdine;
    }

    public void setRigheOrdine(List<RigaOrdine> righeOrdine) {
        this.righeOrdine = righeOrdine;
    }
}
