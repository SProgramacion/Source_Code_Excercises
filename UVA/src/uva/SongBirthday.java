package uva;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SongBirthday {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine()), cont = 0;
            String song = "Happy birthday to you Happy birthday to you Happy birthday to Rujia Happy birthday to you ";
            
            String[] ar_song, ar_people = new String[n];
            for (int i = 0; i < n; i++) {
                ar_people[i] = br.readLine();
            }
            if (n > 16) {
                int p = n / 16;
                for (int i = 0; i < p; i++) {
                    song += song;
                }
            }
            ar_song = song.split(" ");
            while (cont < ar_song.length) {
                for (int i = 0; i < ar_people.length; i++) {
                    System.out.println(ar_people[i] + ": " + ar_song[cont]);
                    cont++;
                }
            }
        } catch (Exception ex) {
        }
    }
}
