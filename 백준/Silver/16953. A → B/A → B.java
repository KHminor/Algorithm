import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] AB = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        Deque<List<Long>> dq = new ArrayDeque<>();
        dq.add(new ArrayList<>(Arrays.asList(AB[0],1L)));
        Set<Long> s_li = new HashSet<>(Arrays.asList(AB[0]));
        long result = -1;
        while (!dq.isEmpty()) {;
            List<Long> li = dq.pollFirst();
            if (li.get(0)==AB[1]) {
                result = li.get(1);
                break;
            }
            if (li.get(0)*2<=AB[1] && !s_li.contains(li.get(0)*2)) {
                dq.add(new ArrayList<>(Arrays.asList(li.get(0)*2, li.get(1)+1)));
                s_li.add(li.get(0)*2);
            }
            if (li.get(0)*10+1<=AB[1] && !s_li.contains(li.get(0)*10+1)) {
                dq.add(new ArrayList<>(Arrays.asList(li.get(0)*10+1, li.get(1)+1)));
                s_li.add(li.get(0)*10+1);
            }
        }
        System.out.println(result);
    }
}
