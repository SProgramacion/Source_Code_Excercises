


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B{

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine()), M, cont = 0;
            M = Integer.parseInt(ordenar(N));
            while (N - M > 0) {
                cont++;
                N = N - M;
                M = Integer.parseInt(ordenar(N));
            }
            cont++;
            System.out.println(cont);
        } catch (Exception ex) {
        }
    }

    public static String ordenar(int N) {
        char[] ar = String.valueOf(N).toCharArray();
        Arrays.sort(ar);
        return String.valueOf(ar);
    }
}
