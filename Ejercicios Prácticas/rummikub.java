
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author julian
 */
public class rummikub {

    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            int cases = Integer.parseInt(in.readLine());

            for (int j = 0; j < cases; j++) {
                boolean s = false;
                List<String> list = Arrays.asList(in.readLine().split(" "));
                java.util.Collections.sort(list);
                List<String> numbers = new ArrayList<>(), chars = new ArrayList<>();
                list.stream().map((item) -> {
                    numbers.add(number(item));
                    return item;
                }).forEach((item) -> {
                    chars.add(endChar(item));
                });

                for (int i = 0; i < list.size(); i++) {
                    if (java.util.Collections.frequency(numbers, numbers.get(i)) >= 3) {
                        System.out.println("YES");
                        s = true;
                        break;
                    } else if (java.util.Collections.frequency(chars, chars.get(i)) >= 3) {
                        System.out.println("YES");
                        s = true;
                        break;
                    }
                }
                if (!s) {
                    if (secuence(numbers)) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        } catch (IOException ex) {
        }
    }

    public static String endChar(String line) {
        return line.charAt(line.length() - 1) + "";
    }

    public static String number(String line) {
        return line.substring(0, line.length() - 1);
    }

    public static boolean secuence(List<String> n) {
        int sec = 1;
        for (int i = 0; i < n.size() - 1; i++) {
            if (Integer.parseInt(n.get(i)) + 1 == Integer.parseInt(n.get(i + 1))) {
                sec++;
            } else {
                sec = 1;
            }
            if (sec >= 3) {
                return true;
            }
        }
        return false;
    }
}
