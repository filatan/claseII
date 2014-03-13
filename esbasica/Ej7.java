package esbasica;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ej7 {
	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		Data data = new Data(0, "nombre", 'n');
		Data data1 = new Data(1, "paco", 'p');
		Data data2 = new Data(2, "jose", 'j');

		Data data3 = new Data();
		Data data4 = new Data();
		Data data5 = new Data();

		String path = "C:/simo/UNI/telemática/5º Cuatri/DSA/re.txt";
		ObjectOutputStream out = null;
		ObjectInputStream in = null;
		try {

			out = new ObjectOutputStream(new FileOutputStream(path));
			out.writeObject(data);
			out.writeObject(data1);
			out.writeObject(data2);
			in = new ObjectInputStream(new FileInputStream(path));
			data3 = (Data) in.readObject();
			data4 = (Data) in.readObject();
			data5 = (Data) in.readObject();
			//System.out.format("$%.2f%n", data3);
		} finally {

			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}

	}

}
