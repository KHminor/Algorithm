import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
public class Main {
    static int n;
    static int[][] mtx;
    static int[][] result;
    static boolean[][] visit;
    static Deque<Integer> dq;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        mtx = new int[n][n];
        result = new int[n][n];
        dq = new ArrayDeque<>();

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++) {
                int num = Integer.parseInt(st.nextToken());
                mtx[i][j] = num;
                result[i][j] = num;
            }
        }

        for (int i=0; i<n; i++) {
            visit = new boolean[n][n];
            for (int j=0; j<n; j++) {
                if (mtx[i][j]==1) {
                    dq.add(j);
                    visit[i][j] = true;
                    dfs(i);
                }
            }
        }

        for (int[] li: result) bw.write(Arrays.stream(li).mapToObj(String::valueOf).collect(Collectors.joining(" "))+"\n");
        bw.flush();
    }

    public static void dfs(int now) {
        while (!dq.isEmpty()) {
            int dj = dq.pollFirst();
            for (int k=0; k<n; k++) {
                if (mtx[dj][k]==1 && !visit[dj][k]) {
                    dq.add(k);
                    result[now][k] = 1;
                    visit[dj][k] = true;
                }
            }
        }
    }
}
