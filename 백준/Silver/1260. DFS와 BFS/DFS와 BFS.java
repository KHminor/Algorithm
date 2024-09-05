import java.io.*;
import java.util.*;
import java.util.stream.*;
public class Main {
    static List<Boolean> visit;
    static List<Integer> result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NMV = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = NMV[0];
        int M = NMV[1];
        int V = NMV[2];


        // 노드 연결
        List<List<Integer>> li = IntStream.rangeClosed(0,N).mapToObj(ArrayList<Integer>::new).collect(Collectors.toList());
        for (int i=0; i<M; i++) {
            int[] node = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            li.get(node[0]).add(node[1]);
            li.get(node[1]).add(node[0]);
        }
        li.forEach(arr-> arr.sort(Comparator.reverseOrder()));

        // dfs
        visit = new ArrayList<>(Collections.nCopies(N+1,false));
        result = new ArrayList<>(N);
        Deque<Integer> stack = new ArrayDeque<>(){{
            add(V);
        }};

        while (!stack.isEmpty()) {
            int now = stack.pollLast();
            if (!visit.get(now)) {
                result.add(now);
                visit.set(now,true);
            }
            for (int num: li.get(now)) {
                if (!visit.get(num)) stack.add(num);
            }
        }
        System.out.println(result.stream().map(String::valueOf).collect(Collectors.joining(" ")));

        // bfs
        li.forEach(Collections::reverse);

        visit = new ArrayList<>(Collections.nCopies(N+1,false));
        result = new ArrayList<>(N);

        Deque<Integer> queue = new ArrayDeque<>(){{
            add(V);
        }};
        visit.set(V,true);
        result.add(V);

        while (!queue.isEmpty()) {
            int now = queue.pollFirst();

            for (int num: li.get(now)) {
                if (!visit.get(num)) {
                    visit.set(num,true);
                    queue.add(num);
                    result.add(num);
                }
            }
        }
        System.out.println(result.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
