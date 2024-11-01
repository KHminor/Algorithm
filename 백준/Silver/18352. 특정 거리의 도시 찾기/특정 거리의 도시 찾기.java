import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        List<List<Integer>> citys = new ArrayList<>();
        for (int i=0; i<=N; i++) citys.add(new ArrayList<>());
        int[] cost = new int[N+1];
        Arrays.fill(cost,-1);

        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            citys.get(Integer.parseInt(st.nextToken())).add(Integer.parseInt(st.nextToken()));
        }

        Deque<Integer> dq = new ArrayDeque<>(Arrays.asList(X));
        cost[X] = 0;

        List<Integer> result = new ArrayList<>();

        while (!dq.isEmpty()) {
            int now = dq.pollFirst();
            if (cost[now]==K) result.add(now);
            else {
                for (Integer val: citys.get(now)) {
                    if (cost[val]==-1 && cost[now]+1<=K) {
                        cost[val] = cost[now]+1;
                        dq.add(val);
                    }
                }
            }
        }
        if (result.isEmpty()) System.out.println(-1);
        else {
            Collections.sort(result);
            for (int num: result) bw.write(num+"\n");
            bw.flush();
        }
    }
}
