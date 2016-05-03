

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class rummikub {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine()), M;
            String linea;
            for (int i = 0; i < T; i++) {
                M = Integer.parseInt(br.readLine());
                linea = br.readLine();
                System.out.println(calcular(linea.split(" ")));
            }
        } catch (Exception ex) {
        }
    }

    public static boolean isGeneral(ArrayList<Nodo> map) {
        ArrayList<Nodo> lr = new ArrayList<>();
        ArrayList<Nodo> lb = new ArrayList<>();
        ArrayList<Nodo> ly = new ArrayList<>();
        ArrayList<Nodo> lg = new ArrayList<>();
        String v;
        for (int i = 0; i < map.size(); i++) {
            int key = map.get(i).k;
            v = map.get(i).v;
            switch (v) {
                case "r":
                    lr.add(new Nodo(key, v));
                    break;
                case "g":
                    lg.add(new Nodo(key, v));
                    break;
                case "b":
                    lb.add(new Nodo(key, v));
                    break;
                case "y":
                    ly.add(new Nodo(key, v));
                    break;
                default:
                    break;
            }
        }
        if (isGroup(map)) {
            return true;
        }
        if (lg.size() >= 3) {
            if (isRun(lg)) {
                return true;
            }
        } else if (lb.size() >= 3) {
            if (isRun(lb)) {
                return true;
            }
        } else if (ly.size() >= 3) {
            if (isRun(ly)) {
                return true;
            }
        } else if (lr.size() >= 3) {
            if (isRun(lr)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isRun(ArrayList<Nodo> map) {
        String v;
        int cont = 1;
        for (int i = 0; i < map.size(); i++) {
            int key = map.get(i).k;
            v = map.get(i).v;
            for (int j = 0; j < map.size(); j++) {
                if (map.get(j).k == key + 1 || map.get(j).k == key + 2) {
                    cont++;
                }
            }
            if (cont >= 3) {
                return true;
            }
            cont = 1;
        }
        return false;
    }

    public static boolean isGroup(ArrayList<Nodo> map) {
        String v, v2, v3;
        int cont = 1, key, key2, key3;
        for (int i = 0; i < map.size(); i++) {
            key = map.get(i).k;
            v = map.get(i).v;
            key3 = key;
            v3 = v;
            //System.out.println(key + ", " + v);
            for (int j = 0; j < map.size(); j++) {
                key2 = map.get(j).k;
                v2 = map.get(j).v;

                if (key == key2 && !v.equals(v2) && key3 == key2 && !v3.equals(v2)) {
                    key3 = key2;
                    v3 = v2;
                    cont++;
                    //System.out.println(cont + ": " + key2 + ", " + v2);
                }
                if (cont >= 3) {
                    return true;
                }
            }
            cont = 1;
        }
        return false;
    }

    public static String calcular(String[] ar) {

        int v;
        String s;

        Arrays.sort(ar);
        ArrayList<Nodo> lista = new ArrayList<>();
        for (int i = 0; i < ar.length; i++) {
            v = Integer.parseInt(ar[i].substring(0, ar[i].length() - 1));
            s = ar[i].substring(ar[i].length() - 1, ar[i].length());
            lista.add(new Nodo(v, s));
        }
        return isGeneral(lista) ? "YES" : "NO";
    }

    public static class Nodo {

        int k;
        String v;

        public Nodo(int k, String v) {
            this.k = k;
            this.v = v;
        }
    }
}
