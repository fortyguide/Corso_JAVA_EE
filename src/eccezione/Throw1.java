package eccezione;

public class Throw1 {

    public static void main(String[] args) {
        Throw1 t = new Throw1();
        t.eseguiTesto(null);
        System.out.println("sono l'istruzione dopo la chiamata al metodo eseguiTesto() nel main()");
    }

    public void stampaTesto(String testo) throws CorsoJavaException {
        if(testo == null){
            throw new CorsoJavaException();
        }
    }

    public void eseguiTesto(String testo){
        try {
            stampaTesto(testo);
        } catch (CorsoJavaException e) {
            e.printStackTrace();
        }
    }
}
