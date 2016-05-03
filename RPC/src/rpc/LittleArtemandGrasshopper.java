package rpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LittleArtemandGrasshopper {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String n, car, num;
            int N;

            boolean state = true;
            while (state) {
                if ((n = br.readLine()) != null) {
                    N = Integer.parseInt(n);
                    car = br.readLine();
                    num = br.readLine();

                    System.out.println(calculate(N, car, num));
                } else {
                    state = false;
                }
            }
        } catch (Exception ex) {
        }
    }

    public static String calculate(int N, String car, String num) {
        String res = "";
        boolean state = true;
        int ini = 1, value, cont = 0;
        char dir;
        String[] values = num.split(" ");
        while (state) {
            cont++;
            value = Integer.parseInt(values[ini - 1]);
            dir = car.charAt(ini - 1);
            if (value > N) {
                return "FINITE";
            }
            if (cont > (N * 2)) {
                return "INFINITE";
            }
            if (dir == '>') {
                ini += value;
            } else {
                ini -= value;
            }
            if (ini > N || ini <= 0) {
                return "FINITE";
            }
        }
        return res;
    }
}
