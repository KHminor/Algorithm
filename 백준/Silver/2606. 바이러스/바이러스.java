import java.io.*;
import java.util.*;
import java.util.stream.*;
public class Main {
    static List<List<Integer>> nodes;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int net = Integer.parseInt(br.readLine());

        nodes = IntStream.rangeClosed(0,N).mapToObj(ArrayList<Integer>::new).collect(Collectors.toList());

        for (int i=0; i<net; i++) {
            int[] node = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            nodes.get(node[0]).add(node[1]);
            nodes.get(node[1]).add(node[0]);
        }

        visit = new boolean[N+1];

        // bfs
        Deque<Integer> queue = new ArrayDeque<>(){{
            add(1);
        }};

        System.out.println(bfs(queue));

    }

    public static int bfs(Deque<Integer> queue){
        int cnt = 0;
        while (!queue.isEmpty()) {
            int now = queue.pollFirst();
            if (!visit[now]) visit[now] = true;

            for (int num: nodes.get(now)) {
                if (!visit[num]) {
                    queue.add(num);
                    visit[num] = true;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
