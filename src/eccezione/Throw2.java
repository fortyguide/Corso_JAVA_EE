package eccezione;

public class Throw2 {

    public static void main(String[] args) {
        Throw2 t = new Throw2();
        try {
            t.eseguiTesto(null);
        } catch (CorsoJavaException e) {
            e.printStackTrace();
        }
        System.out.println("sono l'istruzione dopo la chiamata al metodo eseguiTesto() nel main()");
    }

    public void stampaTesto(String testo) throws CorsoJavaException {
        if(testo == null){
            throw new CorsoJavaException();
        }
    }

    public void eseguiTesto(String testo) throws CorsoJavaException {
        stampaTesto(testo);
    }
}
