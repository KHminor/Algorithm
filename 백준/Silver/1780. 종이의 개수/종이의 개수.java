import java.io.*;
import java.util.*;
public class Main {
    static int[][] mtx;
    static int N;
    static int[] result = {0,0,0};

    public static void main(String[] agrs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        mtx = new int[N][N];
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; j++) mtx[i][j] = Integer.parseInt(st.nextToken());
        }
        reg(0,N,0,N,N);
        for (int num: result) System.out.println(num);

    }

    public static void reg(int si, int ei, int sj, int ej, int n) {
        boolean state = true;
        int now = mtx[si][sj];
        for (int i=si; i<ei; i++) {
            for (int j=sj; j<ej; j++) {
                if (mtx[i][j]!= now) {
                    state = false;
                    break;
                }
            } if (!state) break;
        }
        if (!state) {
            int t_half = n/3;
            for (int i=si; i<ei; i+=t_half) {
                for (int j=sj; j<ej; j+=t_half) reg(i,i+t_half, j,j+t_half, t_half);
            }
        } else {
            result[now + 1] += 1;
            return;
        }
    }
}
