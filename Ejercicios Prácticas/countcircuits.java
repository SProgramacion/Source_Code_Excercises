import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class countcircuits {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine()), cont = 0;
            String linea;
            ArrayList<String> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                linea = br.readLine();
                if (!a.contains(linea)) {
                    if (a.contains(linea.replace("-", ""))) {
                        cont += 2;
                    } else {
                    }
                    a.add(linea);
                }
            }
            System.out.println(cont);
        } catch (Exception ex) {
        }
    }
}
