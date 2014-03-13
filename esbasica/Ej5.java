package esbasica;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ej5 {
	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		FileInputStream in = null;
		PrintWriter out = null;
		try {
			Path path = Paths
					.get("C:/simo/UNI/telemática/5º Cuatri/DSA/hola7.jpg");
			// BufferedImage bmp = null;
			in = new FileInputStream(
					"C:/simo/UNI/telemática/5º Cuatri/DSA/hola7.jpg");
			out = new PrintWriter(new FileWriter(
					"C:/simo/UNI/telemática/5º Cuatri/DSA/regis.txt"));
			out.println(path.getFileName());
			int c;
			int cont = 0;
			fecha(out);

			while ((c = in.read()) != -1) {

				cont++;
			}
			System.out.println(cont);
			out.println(cont);
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}

	public static void fecha(PrintWriter outputStream) {
		// Instanciamos el objeto Calendar
		// en fecha obtenemos la fecha y hora del sistema
		Calendar fecha = new GregorianCalendar();
		// Obtenemos el valor del año, mes, día,
		// hora, minuto y segundo del sistema
		// usando el método get y el parámetro correspondiente
		int año = fecha.get(Calendar.YEAR);
		int mes = fecha.get(Calendar.MONTH);
		int dia = fecha.get(Calendar.DAY_OF_MONTH);
		int hora = fecha.get(Calendar.HOUR_OF_DAY);
		int minuto = fecha.get(Calendar.MINUTE);
		int segundo = fecha.get(Calendar.SECOND);
		System.out.printf("%02d/%02d/%02d %02d:%02d:%02d %n", dia, (mes + 1),
				año, hora, minuto, segundo);

		outputStream.printf("%02d/%02d/%02d %02d:%02d:%02d %n", dia, (mes + 1),
				año, hora, minuto, segundo);

	}
}