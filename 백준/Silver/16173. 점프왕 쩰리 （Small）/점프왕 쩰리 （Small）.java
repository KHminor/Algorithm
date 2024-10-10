import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String result = "Hing";
        int n = Integer.parseInt(br.readLine());
        int[][] mtx = new int[n][n];
        boolean[][] visit = new boolean[n][n];

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++) mtx[i][j] = Integer.parseInt(st.nextToken());
        }

        // bfs
        Deque<List<Integer>> deque = new ArrayDeque<>(Arrays.asList(new ArrayList<>(Arrays.asList(0,0))));
        visit[0][0] = true;

        while (!deque.isEmpty()) {
            List<Integer> now = deque.pollFirst();
            if (mtx[now.get(0)][now.get(1)]==-1) {
                result = "HaruHaru";
                break;
            }

            int mtx_num = mtx[now.get(0)][now.get(1)];
            int[] li = {now.get(0),now.get(1)};
            for (int i=0; i<2; i++) {
                int num = li[i]+mtx_num;
                if (0<num && num<n) {
                    if (i==0 && !visit[num][now.get(1)]) {
                        deque.add(new ArrayList<>(Arrays.asList(num,now.get(1))));
                        visit[num][now.get(1)] = true;
                    }
                    else if (i==1 && !visit[now.get(0)][num]) {
                        deque.add(new ArrayList<>(Arrays.asList(now.get(0),num)));
                        visit[now.get(0)][num] = true;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
