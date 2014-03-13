package syncronizedej11;

import java.io.IOException;

public class Back {
	public static void main(String args[]) throws IOException,
			InterruptedException {

		BackSyncronised contador1 = new BackSyncronised("ID1", 4);
		BackSyncronised contador2 = new BackSyncronised("ID2", 8);
		BackSyncronised contador3 = new BackSyncronised("ID3", 7);
		contador2.start();

		contador3.start();

		contador1.start();

	}
}