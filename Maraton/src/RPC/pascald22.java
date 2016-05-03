import java.math.BigInteger;
import java.util.Scanner;

public class pascald22 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        String linea = tec.nextLine();
        String[] A;

        BigInteger suma = new BigInteger("0");
        while (!linea.equals("-1 -1")) {
            A = linea.split(" ");
            for (int i = Integer.parseInt(A[0]); i <= Integer.parseInt(A[1]); i++) {
                suma = suma.add(Calcular(i));
            }
            System.out.println(suma);
            suma = new BigInteger("0");
            linea = tec.nextLine();
        }
    }

//    public static BigInteger[] LlenarMatriz(){
//        BigInteger[] P = new BigInteger[1001];
//        for (int i = 0; i < P.length; i++) {
//            P[i] = Calcular(i);
//        }
//        return P;
//    }
    public static BigInteger Calcular(int i) {
        BigInteger suma = new BigInteger("0");
        for (int j = 0; j < i + 1; j++) {
            suma = suma.add(CalcularCombinacion(i, j));
        }
        return suma;
    }

    public static BigInteger CalcularCombinacion(int a, int b) {
        return Factorial(a).divide(Factorial(a - b).multiply(Factorial(b)));
    }

    public static BigInteger Factorial(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.valueOf(1);
        } else {
            return BigInteger.valueOf(n).multiply(Factorial(n - 1));
        }
    }
}
