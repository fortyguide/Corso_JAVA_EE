package thread;

public class EsempioThread extends Thread {
    /*Tutto quello che è il blocco di codice che dobbiamo eseguire,
      deve essere messo all'interno del metodo run()
     */
    @Override
    public void run() {
        System.out.println("sono un thread");
    }
}

class MainThread{
    public static void main(String[] args) {
        EsempioThread et = new EsempioThread();

        //Per eseguire il thread, dobbiamo invocare il metodo start()
        et.start();//sono un thread
    }
}
