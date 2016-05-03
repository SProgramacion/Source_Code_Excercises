package uva;

import java.util.*;

public class EJ_11799 {

    public static void main(String[] args) {
        try {
            Scanner tec = new Scanner(System.in);
            int T, N;
            List<Integer> list = new ArrayList();
            T = tec.nextInt();
            for (int i = 0; i < T; i++) {
                list.clear();
                N = tec.nextInt();
                for (int j = 0; j < N; j++) {
                    list.add(tec.nextInt());
                }
                System.out.println("Case " + (i + 1) + ": " + get(list));
            }
        } catch (Exception ex) {

        }
    }

    public static int get(List<Integer> l) {
        Collections.sort(l);
        return l.get(l.size() - 1);
    }

}
