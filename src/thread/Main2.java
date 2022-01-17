package thread;

public class Main2 {

	public static void main(String[] args) throws InterruptedException {
		EsempioTryCatchFinally t1 = new EsempioTryCatchFinally(10);

		// Avvio il Thread
		t1.start();		
		
		// Interrompo il thread
		t1.interrupt();
	}

}
