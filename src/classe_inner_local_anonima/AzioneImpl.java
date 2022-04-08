package classe_inner_local_anonima;

public class AzioneImpl implements Azione{

    @Override
    public void eseguiAzione() {
        System.out.println("Sono nella classe AzioneImpl");
    }
}
