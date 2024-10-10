import java.io.*;
import java.util.*;

public class Main {
    static int l;
    static int[] start;
    static int[] end;
    static int[] ni = {-2,-1,1,2,2,1,-1,-2};
    static int[] nj = {1,2,2,1,-1,-2,-2,-1};
    static int[][] mtx;
    static boolean[][] visit;
    static Deque<List<Integer>> dq;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());
        for (int t=0; t<tc; t++) {
            l = Integer.parseInt(br.readLine());
            mtx = new int[l][l];
            visit = new boolean[l][l];
            start = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            end = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            bw.write(dfs(0)+"\n");
        }
        bw.flush();
    }

    public static int dfs(int cnt) {
        dq = new ArrayDeque<>(List.of(new ArrayList<>(Arrays.asList(start[0],start[1],cnt))));
        visit[start[0]][start[1]] = true;
        while (!dq.isEmpty()) {
            List<Integer> li = dq.pollFirst();
            if (li.get(0)==end[0] && li.get(1)==end[1]) return li.get(2);

            for (int k=0; k<8; k++) {
                int di = li.get(0)+ni[k];
                int dj = li.get(1)+nj[k];
                if ((0<=di&&di<l) && (0<=dj&&dj<l) && !visit[di][dj]) {
                    dq.addLast(new ArrayList<>(Arrays.asList(di,dj,li.get(2)+1)));
                    visit[di][dj] = true;
                }
            }
        }
        return cnt;
    }
}
