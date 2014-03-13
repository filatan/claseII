package Runnableej9;

import java.io.IOException;

public class Runnable {
	public static void main(String args[]) throws IOException,
			InterruptedException {

		CuentaAtrasRunnable contador1 = (new CuentaAtrasRunnable("ID1", 4));
		CuentaAtrasRunnable contador2 = new CuentaAtrasRunnable("ID2", 8);
		CuentaAtrasRunnable contador3 = new CuentaAtrasRunnable("ID3", 7);

		contador1.start();
		contador2.start();
		contador3.start();
	}
}
