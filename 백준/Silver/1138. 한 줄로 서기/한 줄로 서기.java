import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> li = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            li.add(Integer.parseInt(st.nextToken()));
            result.add(0);
        }

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (cnt == li.get(i) && result.get(j) == 0) {
                    result.set(j,i+1);
                    break;
                } else if (result.get(j) == 0) cnt ++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i != n-1) System.out.print(result.get(i) + " ");
            else System.out.print(result.get(i));
        }

    }
}