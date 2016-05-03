
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Argus {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Map<Integer, Integer> map = new HashMap();
            List<Integer> list;
            boolean state = true;
            int K = 0, cont = 0, value;
            String linea;
            while (state) {
                linea = br.readLine();

                if (!linea.equals("#")) {
                    int a = Integer.parseInt(linea.split(" ")[1]);
                    int b = Integer.parseInt(linea.split(" ")[2]);
                    map.put(a, b);
                } else {
                    K = Integer.parseInt(br.readLine());
                    state = false;
                }

            }
            list = new ArrayList<>(map.values());
            Collections.sort(list);
            state = true;
            int act = list.get(0);

            while (cont <= K) {
                for (int i = 0; i < 10; i++) {
                    
                }
                for (int j = 0; j < list.size(); j++) {
                    value = list.get(j);
                    if ((act % value) == 0) {
                        System.out.println(getKeyFromValue(map, value).toString());
                        cont++;
                    }
                    if (cont == K) {
                        break;
                    }
                }
                cont++;
            }
        } catch (Exception ex) {
        }
    }

//    public static String getValues(String line){
//        String res="";
//        for (int i = 0; i < 10; i++) {
//            
//        }
//    }
    public static Object getKeyFromValue(Map hm, Object value) {
        for (Object o : hm.keySet()) {
            if (hm.get(o).equals(value)) {
                return o;
            }
        }
        return "";
    }
}
