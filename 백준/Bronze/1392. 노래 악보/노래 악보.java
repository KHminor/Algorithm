import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  new StringTokenizer(br.readLine());
        
        Integer n = Integer.parseInt(st.nextToken());
        Integer q = Integer.parseInt(st.nextToken());
        
        ArrayList<Integer> n_li = new ArrayList<>(n);
        Integer x = 0;

        for (int i = 0; i < n; i++) {
            Integer z = Integer.parseInt(br.readLine());
            n_li.add(z+x-1);
            x += z;
        }

        for (int i = 0; i < q; i++) {
            Integer Q = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                if (Q <= n_li.get(j)) {
                    System.out.println(j+1);
                    break;
                }
            }
        }
    }
}
