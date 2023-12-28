import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Character> li = Arrays.asList('a', 'e', 'i', 'o', 'u');
        while (true) {
            char[] ip = br.readLine().toLowerCase().toCharArray();
            if (ip[0] == '#') break;
            int cnt = 0;
            for (int i = 0; i < ip.length; i++) {
                if (li.contains(ip[i])) cnt ++;
            }
            System.out.println(cnt);
        }
    }
}