import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());
        ArrayList<Integer> li = new ArrayList<>();

        for (int i = 0; i <= n ; i++) {
            li.add(0);
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st2.nextToken());
            int y = Integer.parseInt(st2.nextToken());
            int k = Integer.parseInt(st2.nextToken());

            for (int j = x; j <= y ; j++) {
                li.set(j, k);
            }
        }

        for (int i: li.subList(1,li.size())) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}