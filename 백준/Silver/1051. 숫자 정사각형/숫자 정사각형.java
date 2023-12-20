import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] mtx = new int[n][];
        int result = 0;
        
        for (int i = 0; i < n; i++) {
            char[] li = br.readLine().toCharArray();
            int[] num_li = new int[m];

            for (int j = 0; j < m; j++) {
                num_li[j] = li[j] - '0';
            }
            mtx[i] = num_li;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n-i; k++) {
                    try {
                        if (mtx[i][j] == mtx[i][j+k] && mtx[i][j] == mtx[i+k][j] && mtx[i][j] == mtx[i+k][j+k]) {
                            result = Math.max(result,(int) Math.pow(k+1,2));
                        }
                    } catch (Exception e) {
                        break;
                    }
                }
            }
        }
        System.out.println(result);
    }

}