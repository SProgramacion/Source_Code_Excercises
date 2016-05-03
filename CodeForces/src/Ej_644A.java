
import java.util.Scanner;

public class Ej_644A {

    public static void main(String[] args) {
        try {
            Scanner tec = new Scanner(System.in);
            int n, a, b;
            n = tec.nextInt();
            a = tec.nextInt();
            b = tec.nextInt();
            System.out.println(getResult(n, a, b));
        } catch (Exception ex) {

        }
    }

    public static String getResult(int n, int a, int b) {
        String res = "";
        if (n <= (a * b)) {

        } else {
            return "-1";
        }
        return res;
    }

}
