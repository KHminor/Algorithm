import java.io.*;
import java.util.*;

public class Main {
    static int[][] mtx;
    static boolean[][] visit;
    static Deque<List<Integer>> queue = new ArrayDeque<>();
    static int N;
    static int M;
    static int[] Wid = {0,1,0,-1};
    static int[] Hei = {1,0,-1,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        mtx = new int[N][M];
        visit = new boolean[N][M];
        int[] result = {0,0};

        // mtx 값 추가
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; j++) mtx[i][j] = Integer.parseInt(st.nextToken());
        }



        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                if (mtx[i][j]==1&&!visit[i][j]) {
                    // bfs
                    visit[i][j] = true;
                    queue.add(new ArrayList<>(Arrays.asList(i,j)));
                    result[0]++;
                    result[1] = Math.max(result[1], bfs());
                }
            }
        }

        for (int num: result) System.out.println(num);
    }

    public static int bfs() {
        int cnt = 1;
        while (!queue.isEmpty()) {
            List<Integer> now_IJ = queue.pollFirst();
            for (int i=0; i<4; i++) {
                int di = now_IJ.get(0)+Hei[i];
                int dj = now_IJ.get(1)+Wid[i];
                if ((0<=di && di<N) && (0<=dj && dj<M) && mtx[di][dj]==1 && !visit[di][dj]) {
                    cnt++;
                    visit[di][dj] = true;
                    queue.add(new ArrayList<>(Arrays.asList(di,dj)));
                }
            }

        }
        return cnt;
    }
}
