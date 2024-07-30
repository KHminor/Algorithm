import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder(br.readLine());

            int result = 0;
            int cnt = 0;
            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(j) == 'O') result += ++cnt;
                else cnt = 0;
            }
            System.out.println(result);
        }
    }
}
