import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());
        char[][] mtx = new char[n][m];
        for (int i = 0; i < n; i++) {
            char[] li = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                mtx[i] = li;
            }
        }
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < n; i++) {
            boolean state = false;
            for (int j = 0; j < m; j++) {
                if (mtx[i][j] == 'X') {
                    state = true;
                    break;
                }
            }
            if (!state) cnt1++;
        }
        
        for (int i = 0; i < m; i++) {
            boolean state = false;
            for (int j = 0; j < n; j++) {
                if (mtx[j][i] == 'X') {
                    state = true;
                    break;
                }
            }
            if (!state) cnt2++;
        }
        
        System.out.println(Math.max(cnt1,cnt2));
    }
}
