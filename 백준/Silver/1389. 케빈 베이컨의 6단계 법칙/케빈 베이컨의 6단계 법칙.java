import java.io.*;
import java.util.*;
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] mtx;
    static List<Set<Integer>> relationArr = new ArrayList<>();
    static StringTokenizer st;
    static int[] result;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        mtx = new int[N+1][N+1];
        result = new int[]{-1,-1};
        addData(N,M);
        findResult(N);
        System.out.println(result[0]);
    }

    private static void addData(int N, int M) throws IOException {
        for (int i=0; i<=N; i++) relationArr.add(new HashSet<>());
        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            relationArr.get(a).add(b);
            relationArr.get(b).add(a);
        }
    }

    private static void findResult(int N) {
        for (int i=1; i<=N; i++) {
            if (i!=N) BFS(i,N);
            int hap = 0;
            for (int j=1; j<=N; j++) hap+=mtx[i][j];
            if (result[0]==-1 || result[1]>hap) {
                result[0]=i;
                result[1]=hap;
            }
        }
    }

    private static void BFS(int a, int N) {
        Deque<int[]> dq = new ArrayDeque<>(Arrays.asList(new int[]{a,0}));
        boolean[] visit = new boolean[N+1];
        visit[a]=true;

        while (!dq.isEmpty()) {
            int[] now = dq.pollFirst();
            for (int next: new ArrayList<>(relationArr.get(now[0]))) {
                if (!visit[next]) {
                    dq.add(new int[]{next,now[1]+1});
                    visit[next]=true;
                    if (mtx[a][next]==0 || mtx[a][next]>now[1]+1) {
                        mtx[a][next]=now[1]+1;
                        mtx[next][a]=now[1]+1;
                    }
                }
            }
        }
    }
}