package cicli;

public class ForWhileDoWhile {

    public void iteraConWhile(int contatore, int estremo){
        while(contatore < estremo){
            System.out.println("contatore vale" + contatore);
            contatore++;
        }

        System.out.println("sono uscito dal ciclo while\n");
    }

    public void iteraConDoWhile(int contatore, int estremo){
        do{
            System.out.println("contatore vale" + contatore);
            contatore++;
        }while(contatore < estremo);

        System.out.println("sono uscito dal ciclo do-while\n");
    }

    public void iteraConFor(int contatore){
        for(int i = 0; i < contatore; i++){
            System.out.println(i);
        }

        System.out.println("sono uscito dal ciclo for\n");
    }

    public static void main(String[] args) {
        ForWhileDoWhile fwdw = new ForWhileDoWhile();
        fwdw.iteraConWhile(0,5);
        fwdw.iteraConWhile(5,5);
        fwdw.iteraConDoWhile(0,5);
        fwdw.iteraConDoWhile(5,5);
        fwdw.iteraConFor(5);
    }

}
