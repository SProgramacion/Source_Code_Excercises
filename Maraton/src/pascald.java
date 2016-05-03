
import java.util.Scanner;

public class pascald {

    public static void main(String[] args) {
        try {
            Scanner tec = new Scanner(System.in);
            String linea = tec.nextLine();
            String[] A;
            int suma = 0;
            while (!linea.equals("-1 -1")) {
                A = linea.split(" ");
                for (int i = Integer.parseInt(A[0]); i <= Integer.parseInt(A[1]); i++) {
                    suma += Calcular(i);
                }
                System.out.println(suma);
                suma = 0;
                linea = tec.nextLine();
            }
        } catch (Exception ex) {
        }
    }

    public static int Calcular(int i) {
        int suma = 0;
        for (int j = 0; j < i + 1; j++) {
            suma += CalcularCombinacion(i, j);
        }
        return suma;
    }

    public static int CalcularCombinacion(int a, int b) {
        return Factorial(a) / (Factorial(a - b) * Factorial(b));
    }

    public static int Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }
}
