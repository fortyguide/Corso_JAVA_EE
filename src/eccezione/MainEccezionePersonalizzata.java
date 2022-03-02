package eccezione;

public class MainEccezionePersonalizzata {

    public static void main(String[] args) {
        MainEccezionePersonalizzata mainEccezionePersonalizzata = new MainEccezionePersonalizzata();
        try {
            mainEccezionePersonalizzata.stampaTesto(null);
        } catch (CorsoJavaException e) {
            /*e.printStackTrace();*/
            System.out.println(e.getMessage());
        }
    }

    public void stampaTesto(String testo) throws CorsoJavaException {
        if(testo == null){
            throw new CorsoJavaException();
        }
    }
}
