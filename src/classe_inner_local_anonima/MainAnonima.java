package classe_inner_local_anonima;

public class MainAnonima {

    public static void main(String[] args) {

        MainAnonima m = new MainAnonima();

        Azione a1 = m.eseguiAzione();
        a1.eseguiAzione(); //Sono nella classe AzioneImpl
        Azione a2 = m.eseguiAzione2();
        a2.eseguiAzione(); //Sono nella classe anonima Azione
    }

    public Azione eseguiAzione() {
        return new AzioneImpl();
    }

    public Azione eseguiAzione2(){

        /*Classe anonima*/
        return new Azione() {
            @Override
            public void eseguiAzione() {
                System.out.println("Sono nella classe anonima Azione");
            }
        };
    }
}
