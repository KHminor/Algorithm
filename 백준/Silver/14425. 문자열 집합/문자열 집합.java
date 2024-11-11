import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<String> s_li = new HashSet<>(N);
        int result = 0;
        for (int i=0; i<N; i++) s_li.add(br.readLine());
        for (int i=0; i<M; i++) {
            if (s_li.contains(br.readLine())) result++;
        }
        System.out.println(result);
    }
}
