import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
public class Main {
    static List<Integer> result = new ArrayList<>();
    static int M;
    static int N;
    static int K;
    static boolean[][] mtx;
    static Deque<List<Integer>> dq = new ArrayDeque<>();

    static int[] di = {-1,0,1,0};
    static int[] dj = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] MNK = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        M = MNK[0];
        N = MNK[1];
        K = MNK[2];

        mtx = new boolean[M][N];


        for (int x=0; x<K; x++) {
            int[] li = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int i=li[1]; i<li[3]; i++) {
                for (int j=li[0]; j<li[2]; j++) {
                    if (!mtx[i][j]) mtx[i][j] = true;
                }
            }
        }
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                if (!mtx[i][j]) {
                    dq.add(new ArrayList<>(Arrays.asList(i,j)));
                    mtx[i][j] = true;
                    result.add(find());
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        System.out.println(result.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }

    public static int find() {
        int cnt = 1;
        while (!dq.isEmpty()) {
            List<Integer> li = dq.pollFirst();
            for (int t=0; t<4; t++) {
                int ni = di[t]+li.get(0);
                int nj = dj[t]+li.get(1);
                if ((0<=ni&&ni<M) && (0<=nj&&nj<N) && !mtx[ni][nj]) {
                    mtx[ni][nj] = true;
                    dq.add(new ArrayList<>(Arrays.asList(ni,nj)));
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
