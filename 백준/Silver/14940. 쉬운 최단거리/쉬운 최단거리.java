import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<List<Integer>> dq = new ArrayDeque<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];
        int[][] result = new int[N][M];

        for (int i=0; i<N; i++) Arrays.fill(result[i],-1);
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j]==2) {
                    dq.add(new ArrayList<>(Arrays.asList(i,j)));
                    result[i][j] = 0;
                } else if (map[i][j]==0) result[i][j] = 0;
            }
        }

        int[] ni = {-1,0,1,0};
        int[] nj = {0,1,0,-1};

        while (!dq.isEmpty()) {
            List<Integer> now = dq.pollFirst();
            for (int i=0; i<4; i++) {
                int di = ni[i]+now.get(0);
                int dj = nj[i]+now.get(1);
                if ((0<=di&&di<N) && (0<=dj&&dj<M) && map[di][dj]==1 && result[di][dj]==-1) {
                    result[di][dj] = result[now.get(0)][now.get(1)]+1;
                    dq.add(new ArrayList<>(Arrays.asList(di,dj)));
                }
            }
        }
        StringBuilder sb = new StringBuilder("");
        for (int[] li: result) {
            for (int num: li) sb.append(num+" ");
            sb.append("\n");
        }
        
        System.out.println(sb);
    }
}
