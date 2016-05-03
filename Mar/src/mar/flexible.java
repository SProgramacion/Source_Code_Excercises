import java.util.Scanner;
import java.util.Arrays;

public class flexible {

    public static void main(String[] args) {
        try {
            
            Scanner tec = new Scanner(System.in);
            String linea, num, res;
            String[] n;
            int dif;
            while (true) {
                res = "";
                linea = tec.nextLine();
                num = tec.nextLine();
                n = num.split(" ");
                for (int i = 0; i < n.length; i++) {
                    res += Integer.parseInt(n[i]) - 0 + " ";
                }
                res += linea.split(" ")[0] + " ";
                for (int i = 0; i < n.length; i++) {
                    for (int j = (i + 1); j <= n.length; j++) {
                        if (j != n.length) {
                            res += (Integer.parseInt(n[j]) - Integer.parseInt(n[i])) + " ";
                        } else {
                            res += Integer.parseInt(linea.split(" ")[0]) - Integer.parseInt(n[i]) + " ";
                        }
                    }
                }
                String[] ar = res.split(" ");
                int[] ar2 = new int[ar.length];
                for (int i = 0; i < ar.length; i++) {
                    ar2[i] = Integer.parseInt(ar[i]);
                }
                Arrays.sort(ar2);
                System.out.println(RetornarCadena(Arrays.toString(ar2).replace("[", "").replace("]", "").replace(",", "")));
            }
        } catch (Exception ex) {

        }
    }

    public static String RetornarCadena(String cad) {
        String res = "";
        String[] ar = cad.split(" ");
        for (int i = 0; i < ar.length; i++) {
            if (i < ar.length - 1) {
                if (!ar[i].equals(ar[i + 1])) {
                    res += ar[i] + " ";
                }
            }
        }
        res += ar[ar.length - 1];
        return res;
    }
}
