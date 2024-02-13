import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = 1;

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            boolean state = true;
            ArrayList<String> name = new ArrayList<>(Collections.nCopies(n,""));
            Integer[][] check = new Integer[n][];
            for (int i = 0; i < n; i++) {
                check[i] = new Integer[n-1];
                check[i][0] = 0;
            }

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                name.set(i,st.nextToken());
                int cnt = 0;
                for (int j = 1; j < n; j++) {
                    if (st.nextToken().equals("N")) {
                        check[i][cnt] = j;
                        cnt++;
                        if (state) state = false;
                    }
                }
            }
            System.out.println("Group " + tc);

            for (int i = 0; i < n; i++) {
                if (check[i][0] != 0) {
                    for (Integer j: check[i]) {
                        String devil = "";
                        if (j == null) break;
                        if (i-j >= 0) devil = name.get(i-j);
                        else devil = name.get(n+i-j);
                        System.out.println(devil + " was nasty about " + name.get(i));
                    }
                }
            }

            if (state) System.out.println("Nobody was nasty");
            System.out.println();
            tc++;
        }
    }
}
