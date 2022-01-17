package thread;

public class EsempioTryCatchFinally extends Thread {
	private long sleep;

	public EsempioTryCatchFinally(long sleep) {
		super();
		this.sleep = sleep;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(sleep);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Entrato nel finally!");
		}
	}
}
