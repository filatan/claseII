package esbasica;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Ej6 {
	public static void main(String[] args) throws IOException {
		String path = "C:/simo/UNI/telemática/5º Cuatri/DSA/Reg.txt";
		String path1 = "C:/simo/UNI/telemática/5º Cuatri/DSA/regis.txt";
		int cont = numero_bytes(path);
		int cont1 = numero_bytes(path1);
		System.out.println("el numero de bytes del primer archivo es: " + cont
				+ " y del segundo es: " + cont1);
		if (cont1 > cont) {
			System.out.println(path1);
		}
		else System.out.println(path);
	}

	public static int numero_bytes(String path) throws IOException {
		FileInputStream in = null;
		PrintWriter out = null;
		int cont = 0;

		try {
			in = new FileInputStream(path);
			int c;
			while ((c = in.read()) != -1) {
				cont++;
			}
			System.out.println(cont);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		finally {

			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
		return cont;
	}
}
