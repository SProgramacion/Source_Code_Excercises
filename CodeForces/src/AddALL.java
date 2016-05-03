
import java.io.*;
import java.util.*;

public class AddALL {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            String[] ar;
            while (!(linea = br.readLine()).equals("0")) {
                linea = br.readLine();
                ar = linea.split(" ");
                System.out.println(getArray(ar));
            }
        } catch (Exception ex) {
        }
    }

    public static int getArray(String[] ar) {
        int result = 0, aux = 0;
        if (ar.length == 1) {
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < ar.length; i++) {
            list.add(Integer.parseInt(ar[i]));
        }
        while (list.size() > 1) {
            Collections.sort(list);
            aux = list.get(0) + list.get(1);
            result += aux;
            list.remove(0);
            list.set(0, aux);
        }
        return result;
    }

}
