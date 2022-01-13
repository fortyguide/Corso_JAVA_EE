package thread;

public class EsempioRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("sono un thread runnable");
    }
}

class MainRunnable {
    public static void main(String[] args) {
        /*Per eseguire questo thread, dobbiamo creare un'istanza della
        classe Thread, passando in ingresso un'istanza della nostra
        classe che implementa l'interfaccia Runnable*/
        Thread t = new Thread(new EsempioRunnable());

        t.start();//sono un thread runnable
    }
}
