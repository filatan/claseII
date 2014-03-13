package syncronizedej11;

public class BackSyncronised extends Thread {

	int c;
	String id;
	static String ultimaescritura;

	static int cont = 0;

	public BackSyncronised() {

	}

	public BackSyncronised(String v, int c) throws InterruptedException {

		this.c = c;
		this.id = v;
		// Setescritura(id);

		++cont;
		// System.out.println(cont);

	}

	/*
	 * public synchronized void Setescritura(String escritura) { ultimaescritura
	 * = escritura; }
	 */

	/*
	 * public String Getescritura() {
	 * 
	 * return ultimaescritura; }
	 */

	public int GetCont() {
		return cont;
	}

	public void SetCont() {
		--cont;
	}

	public void run() {
		while (c >= 0) {
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (c == 0) {
				SetCont();
				synchronized (this) {
					System.out.println("ultima escritura " + id + " quedan "
							+ GetCont() + " Threads activos");

					System.out.println(id + " - " + c + " ultima escritura "
							+ ultimaescritura);
				}
			} else
				synchronized (this) {
					System.out.println(id + " - " + c + " ultima escritura "
							+ ultimaescritura);
				}
			--c;

			synchronized (this) {
				ultimaescritura = id;
			}
			// System.out.println(id + " - " + c + " ultima escritura1215 "
			// + Getescritura());
		}
	}
}
