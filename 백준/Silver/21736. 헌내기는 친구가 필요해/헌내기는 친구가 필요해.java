import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String[][] mtx;
    static boolean[][] visit;
    static Deque<int[]> dq = new ArrayDeque<>();
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        mtx = new String[N][M];
        visit = new boolean[N][M];
        addMtx(N,M);
        int result = findPeople(N,M);
        System.out.println(result==0?"TT":result);
    }

    private static void addMtx(int N, int M) throws IOException {
        for (int i=0; i<N; i++) {
            String inp = br.readLine();
            for (int j=0; j<M; j++) {
                mtx[i][j]=String.valueOf(inp.charAt(j));
                if (mtx[i][j].equals("I")) dq.add(new int[]{i,j});
            }
        }
    }

    private static int findPeople(int N, int M) {
        int cnt = 0;
        int[] ni = {-1,0,1,0};
        int[] nj = {0,1,0,-1};
        while (!dq.isEmpty()) {
            int[] now = dq.pollFirst();
            for (int i=0; i<4; i++) {
                if ((0<=now[0]+ni[i]&&now[0]+ni[i]<N) && (0<=now[1]+nj[i]&&now[1]+nj[i]<M) && !mtx[now[0]+ni[i]][now[1]+nj[i]].equals("X") && !visit[now[0]+ni[i]][now[1]+nj[i]]) {
                    dq.add(new int[]{now[0]+ni[i],now[1]+nj[i]});
                    visit[now[0]+ni[i]][now[1]+nj[i]]=true;
                    if (mtx[now[0]+ni[i]][now[1]+nj[i]].equals("P")) cnt++;
                }
            }
        }
        return cnt;
    }
}
