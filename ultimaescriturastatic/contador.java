package ultimaescriturastatic;

import java.io.IOException;

public class contador {
	public static void main(String args[]) throws IOException,
			InterruptedException {

		CuentaAtrasThread contador1 = new CuentaAtrasThread("ID1", 4);
		CuentaAtrasThread contador2 = new CuentaAtrasThread("ID2", 8);
		CuentaAtrasThread contador3 = new CuentaAtrasThread("ID3", 7);

		contador1.start();

		contador2.start();

		contador3.start();

	}
}