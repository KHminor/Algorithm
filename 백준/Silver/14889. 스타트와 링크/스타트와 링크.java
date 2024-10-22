import java.io.*;
import java.util.*;
public class Main {
    static int[][] mtx;
    static int N;
    static int result;
    static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        visit = new boolean[N];
        result = 100*N;
        mtx = new int[N][N];
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; j++) mtx[i][j] = Integer.parseInt(st.nextToken());
        }

        find(0,0);
        System.out.println(result);
    }

    public static void find(int cnt, int now) {
        if (cnt==N/2) {
            int x = 0;
            int y = 0;
            for (int i=0; i<N; i++) {
                for (int j=0; j<N; j++) {
                    if (i!=j) {
                        if (visit[i] && visit[j]) x += mtx[i][j];
                        else if (!visit[i] && !visit[j]) y+= mtx[i][j];
                    }
                }
            }
            result = Math.min(Math.abs(x-y),result);
            return ;
        }
        for (int i=now; i<N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                find(cnt+1, i+1);
                visit[i] = false;
            }
        }
    }
}
