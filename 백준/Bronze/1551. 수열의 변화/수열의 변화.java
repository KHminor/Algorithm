import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static List<Integer> li = new ArrayList<>();
    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        addData(N);
        findResult(N,M);
        System.out.println(li.stream().map(String::valueOf).collect(Collectors.joining(",")));
    }

    private static void addData(int N) throws IOException {
        st = new StringTokenizer(br.readLine(),",");
        for (int i=0; i<N; i++) li.add(Integer.parseInt(st.nextToken()));
    }

    private static void findResult(int N, int M) {
        int cnt = M;
        int ln = N;
        while (cnt>0) {
            List<Integer> n_li = new ArrayList<>();
            for (int j=0; j<ln-1; j++) n_li.add(li.get(j+1)-li.get(j));
            li = new ArrayList<>(n_li);
            cnt--;
            ln--;
        }
    }
}
