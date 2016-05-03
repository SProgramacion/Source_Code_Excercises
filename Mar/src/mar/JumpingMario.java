import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JumpingMario {

    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int T, N, H = 0, L = 0, ant = 0;
            String W;
            String[] ar;
            T = Integer.parseInt(in.readLine());

            for (int i = 0; i < T; i++) {
                N = Integer.parseInt(in.readLine());
                W = in.readLine();
                ar = W.split(" ");
                for (int j = 1; j < ar.length; j++) {
                    if (Integer.parseInt(ar[j]) > Integer.parseInt(ar[j - 1])) {
                        H++;
                    } else if (Integer.parseInt(ar[j]) < Integer.parseInt(ar[j - 1])) {
                        L++;
                    }
                }
                System.out.println("Case " + (i + 1) + ": " + H + " " + L);
                H = 0;
                L = 0;
            }
        } catch (Exception ex) {

        }
    }
}
