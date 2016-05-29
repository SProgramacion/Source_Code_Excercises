
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class elephants {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());

            String linea, nums;
            String[] ar;
            int M, W, aux = 0, cont = 0;
            int[] ar2;
            for (int i = 0; i < N; i++) {
                nums = br.readLine();
                M = Integer.parseInt(nums.split(" ")[0]);
                W = Integer.parseInt(nums.split(" ")[1]);
                linea = br.readLine();
                ar = linea.split(" ");
                ar2 = new int[ar.length];
                for (int j = 0; j < ar.length; j++) {
                    ar2[j] = Integer.parseInt(ar[j]);
                }
                Arrays.sort(ar2);
                for (int j = 0; j < ar2.length; j++) {
                    aux += ar2[j];
                    if (aux <= W) {
                        cont++;
                    }
                }
                System.out.println(cont);
                cont=0;
                aux=0;
            }

        } catch (Exception ex) {

        }
    }

}
