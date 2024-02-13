import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = 1;
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            ArrayList<String> name = new ArrayList<>(n);
            ArrayList<Integer> cnt = new ArrayList<>(Collections.nCopies(n,2));

            for (int i = 0; i < n; i++) name.add(br.readLine());
            for (int i = 0; i < 2*n-1; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int num = Integer.parseInt(st.nextToken());
                String x = st.nextToken();
                
                cnt.set(num-1,cnt.get(num-1)-1);
            }
            for (int i = 0; i < n; i++) {
                if (cnt.get(i) == 1) {
                    System.out.print(tc);
                    System.out.println(" " + name.get(i));
                    break;
                }
            }
            tc ++;
        }
    }
}
