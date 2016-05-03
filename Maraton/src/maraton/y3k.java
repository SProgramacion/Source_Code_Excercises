import java.util.Calendar;
import java.util.Scanner;

public class y3k {

    public static void main(String[] args) {
        try {
            Scanner tec = new Scanner(System.in);
            String linea = tec.nextLine();
            while (!linea.equals("0 0 0 0")) {
                System.out.println(MostrarFecha(linea));
                linea = tec.nextLine();
            }
        } catch (Exception ex) {
        }
    }

    public static String MostrarFecha(String f) {
        String[] fecha = f.split(" "), ar;
        String res;
        int i = Integer.parseInt(fecha[0]), d = Integer.parseInt(fecha[1]), m = Integer.parseInt(fecha[2]), a = Integer.parseInt(fecha[3]);
        Calendar n = Calendar.getInstance();
        n.set(a, (m - 1), d);
        n.add(Calendar.DAY_OF_YEAR, i);
        res = n.getTime().toLocaleString();
        ar = res.substring(0, res.indexOf(" ")).replaceAll("/", " ").split(" ");
        return ar[0] + " " + (Integer.parseInt(ar[1])) + " " + ar[2];
    }
}