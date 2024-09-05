import java.io.*;
import java.util.*;
import java.util.stream.*;
public class Main {
    static Deque<Integer> result;
    static boolean[] visit;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = NM[0];
        int M = NM[1];
        result = new ArrayDeque<>();
        visit = new boolean[N+1];
        int[] num_li = IntStream.rangeClosed(1,N).toArray();
        back(M,num_li);

    }
    public static void back(int M, int[] num_li) {
        if (result.size() == M) {
            System.out.println(result.stream().map(String::valueOf).collect(Collectors.joining(" ")));
            return ;
        }
        for (int num: num_li) {
            if (!visit[num]) {
                result.add(num);
                visit[num] = true;
                back(M,num_li);
                result.pollLast();
                visit[num] = false;
            }
        }
    }
}
