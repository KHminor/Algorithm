import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int[][] mtx =  new int[h][w];
        for (int i=0; i<h; i++) {
            String arr = br.readLine();
            int cnt = -1;
            for (int j=0; j<arr.length(); j++) {
                if (arr.charAt(j) == 'c') cnt = 0;
                else if (cnt!=-1) cnt++;
                mtx[i][j] = cnt;
            }
        }
        for (int i=0; i<h; i++) {
            for (int num: mtx[i]) System.out.print(num+" ");
            System.out.println();
        }
    }
}