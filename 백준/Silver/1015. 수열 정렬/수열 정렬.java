import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> li = new ArrayList<>(n);
        for (int i = 0; i < n; i++) li.add(Integer.parseInt(st.nextToken()));
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(n,-1));

        for (int i = 0; i < n; i++) {
            int low = 1001;
            int idx = 0;
            for (int j = 0; j < n; j++) {
                if (result.get(j) != -1) continue;
                else if (low > li.get(j)) {
                    low = li.get(j);
                    idx = j;
                }
            }
            result.set(idx,i);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result.get(i));
            if (i != n-1) System.out.print(" ");
        }
    }
}