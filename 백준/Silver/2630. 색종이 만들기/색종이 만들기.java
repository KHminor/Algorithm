import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
    static int N;
    static int[][] mtx;
    static int[] result = {0,0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        mtx = new int[N][N];
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; j++) mtx[i][j] = Integer.parseInt(st.nextToken());
        }
        find(0,0,N);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    public static void find(int si, int sj, int num) {
        boolean state = true;
        int now = mtx[si][sj];
        for (int i=si; i<si+num; i++) {
            for (int j=sj; j<sj+num; j++) {
                if (mtx[i][j]!=now) {
                    state = false;
                    break;
                }
            }
            if (!state) break;
        }
        if (state) {
            result[now]++;
            return;
        } else {
            find(si,sj,num/2); // 0,0,4
            find(si,sj+num/2,num/2); // 0,4,4
            find(si+num/2,sj,num/2); // 4,0,4
            find(si+num/2,sj+num/2,num/2); // 4,4,4
        }
    }
}