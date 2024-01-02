import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer n = Integer.parseInt(st.nextToken());
        Integer l = Integer.parseInt(st.nextToken());
        Integer d = Integer.parseInt(st.nextToken());

        Long e_song = 0L;
        Long e_rest = 0L;
        Long bell = 0L;

        for (int i = 0; i < n; i++) {
            e_song += l;
            e_rest = e_song+5;
            while (e_rest > bell) {
                if (e_song <= bell && bell < e_rest) {
                    System.out.println(bell);
                    System.exit(0);
                } else bell += d;
            }
            e_song = e_rest;
        }
        System.out.println(bell);
    }
}