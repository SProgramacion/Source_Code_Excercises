import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int p, a, b, c, d, n;
        double result = 0, aux, alto = 0, bajo = 0, dif, e_fijo = 0.00001;

        while (true) {
            p = tec.nextInt();
            a = tec.nextInt();
            b = tec.nextInt();
            c = tec.nextInt();
            d = tec.nextInt();
            n = tec.nextInt();
            for (int i = 1; i <= n; i++) {
                aux = p * (Math.sin(a * i + b) + Math.cos(c * i + d) + 2);
                if (aux > alto) {
                    alto = aux;
                } else {
                    bajo = aux;
                    dif = alto - bajo;
                    result = (result > dif) ? result : dif;
                }
            }
            result = Math.round(result);
            System.out.println(result);
            result = 0;
        }
    }
}
