
import java.util.Scanner;

public class Date {

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
        String[] fecha = f.split(" ");
        String nueva = "";
        int i = Integer.parseInt(fecha[0]), d = Integer.parseInt(fecha[1]),
                m = Integer.parseInt(fecha[2]), a = Integer.parseInt(fecha[3]), dif = MostrarDias(m, a) - d;
        i -= dif;
        while (true) {
            a += (m == 12) ? 1 : 0;
            m = (m == 12) ? 1 : ++m;
            d = MostrarDias(m, a);
            if (i <= d && i > 0) { 
                nueva = i + " " + m + " " + a;
                break;
            }
            i -= d;
        }
        return nueva;
    }

    public static int MostrarDias(int mes, int ano) {
        return (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) ? 31
                : (mes == 4 || mes == 6 || mes == 9 || mes == 11) ? 30 : (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) ? 29 : 28;
    }
}
