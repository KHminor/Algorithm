import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int result = 0;
        boolean[][] mtx = new boolean[100][100];
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int y1=y; y1<y+10; y1++) {
                for (int x1=x; x1<x+10; x1++) {
                    if (!mtx[y1][x1]) {
                        result++;
                        mtx[y1][x1] = true;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
