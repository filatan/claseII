package esbasica;


import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
public class Ej4 {
    public static void main(String[] args) throws IOException {

    	Path path = Paths.get("C:/simo/UNI/telemática/5º Cuatri/DSA/prueba.txt");
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        Scanner s = null;
                

        try {
            inputStream = new BufferedReader(new FileReader("C:/simo/UNI/telemática/5º Cuatri/DSA/prueba.txt"));
            outputStream = new PrintWriter(new FileWriter("C:/simo/UNI/telemática/5º Cuatri/DSA/Reg.txt"));
            outputStream.println(path.getFileName());
            fecha(outputStream);
            s = new Scanner (inputStream);

            String v = ""; 
            
            while (s.hasNext()) {
                v = v+s.next();
            }
            outputStream.println(v.length());
            
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
            if (s != null) {
                s.close();
            }
        }
    }
    public static void fecha(PrintWriter outputStream) {
        //Instanciamos el objeto Calendar
        //en fecha obtenemos la fecha y hora del sistema
        Calendar fecha = new GregorianCalendar();
        //Obtenemos el valor del año, mes, día,
        //hora, minuto y segundo del sistema
        //usando el método get y el parámetro correspondiente
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        int segundo = fecha.get(Calendar.SECOND);
        outputStream.printf("%02d/%02d/%02d %02d:%02d:%02d %n", dia ,(mes+1), año, hora, minuto, segundo);
    }
}