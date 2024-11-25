import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static String[][] mtx;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        mtx = new String[N][N];
        for (int i=0; i<N; i++) {
            String row = br.readLine();
            for (int j=0; j<N; j++) mtx[i][j]=String.valueOf(row.charAt(j));
        }
        find(0,N,0,N,N);
        System.out.println(sb);
    }

    public static void find(int si, int ei, int sj, int ej, int ln) {
        String now = mtx[si][sj];
        boolean state = true;
        if (ln!=1) {
            for (int i=si; i<ei; i++) {
                for (int j=sj; j<ej; j++) {
                    if (!mtx[i][j].equals(now)) {
                        state = false;
                        break;
                    }
                }
                if (!state) break;
            }
        }
        if (state) sb.append(now.equals("0")?"0":"1");
        else {
            int n_ln = ln/2;
            sb.append("(");
            find(si, (si+ei)/2, sj, (sj+ej)/2, n_ln); // 1사분면

            find(si, (si+ei)/2, (sj+ej)/2, ej, n_ln); // 2사분면

            find((si+ei)/2, ei, sj, (sj+ej)/2, n_ln); // 3사분면

            find((si+ei)/2, ei, (sj+ej)/2, ej, n_ln); // 4사분면
            sb.append(")");
        }
    }
}