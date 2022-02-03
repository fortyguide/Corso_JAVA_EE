package costruttore;

public class Prodotto {

    private int id;
    private String nome;
    private String descrizione;
    private double prezzo;

    /*Costruttore default, che si può anche evitare di definire
    * perchè lo crea già JAVA in automatico*/
    public Prodotto() {
        super();
    }

    /*Altro costruttore, in cui vengono popolati gli attributi id, nome e descrizione.
    * Se, però, vengono svolte modifiche nei vari metodi getter e setter, questi
    * this nel costruttore fanno perdere tali modifiche, per cui conviene
    * riscrivere il + come quello appena sotto di questo, cioè con i richiami
    * ai metodi getter e setter dove sono svolte le modifiche*/

    /*public Prodotto(int id, String nome, double prezzo) {
        super();

        this.id = id;
        this.nome = nome;
        this.prezzo = prezzo;
    }*/

    public Prodotto(int id, String nome, double prezzo) {
        super();

        this.id = id;
        setNome(nome);
        setPrezzo(prezzo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String tmp = nome.concat("...");
        this.nome = tmp;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        if(prezzo == 0){
            prezzo = 1;
        }

        this.prezzo = prezzo;
    }
}

