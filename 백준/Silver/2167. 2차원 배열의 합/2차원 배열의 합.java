import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] mtx = new int[N+1][M+1];
        for (int t=1; t<=N; t++) {
            st = new StringTokenizer(br.readLine());
            for (int c=1; c<=M; c++) mtx[t][c] = Integer.parseInt(st.nextToken());
        }

        int K = Integer.parseInt(br.readLine());
        for (int t=0; t<K; t++) {
            int[] li = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int hap = 0;
            for (int y=li[0]; y<=li[2]; y++) {
                for (int x=li[1]; x<=li[3]; x++) hap += mtx[y][x];
            }
            bw.write(hap+"\n");
        }
        bw.flush();
    }
}
