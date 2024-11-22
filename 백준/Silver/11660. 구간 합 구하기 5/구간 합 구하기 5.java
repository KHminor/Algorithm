import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long[][] mtx = new long[N][N];
        long[][] check = new long[N+1][N+1];
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; j++) {
                mtx[i][j]=Integer.parseInt(st.nextToken());
                check[i+1][j+1]=check[i+1][j]+mtx[i][j];
            }
        }

        while (M>0) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            long hap = 0L;
            for (int i=x1; i<=x2; i++) hap+=check[i][y2]-check[i][y1-1];
            bw.write(hap+"\n");
            M--;
        }
        bw.flush();
    }
}
