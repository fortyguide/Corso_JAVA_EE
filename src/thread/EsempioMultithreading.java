package thread;

public class EsempioMultithreading extends Thread{
    @Override
    public void run(){

        System.out.println("Sono il thread " + getName());

        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
        /*Utilizzo il metodo sleep per dare un tempo di pausa
         tra una stampa di i e un'altra*/
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class MainMultithreading{
    public static void main(String[] args) {

        EsempioMultithreading em1 = new EsempioMultithreading();
        //setName() serve per poter assegnare un nome al thread
        em1.setName("Thread1");

        EsempioMultithreading em2 = new EsempioMultithreading();
        em2.setName("Thread2");

        EsempioMultithreading em3 = new EsempioMultithreading();
        em3.setName("Thread3");

        EsempioMultithreading em4 = new EsempioMultithreading();
        em4.setName("Thread4");

        EsempioMultithreading em5 = new EsempioMultithreading();
        em5.setName("Thread5");

        em1.start();
        em2.start();
        em3.start();
        em4.start();
        em5.start();

    }
}
