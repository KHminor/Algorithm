import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("<");
        String[] NK = br.readLine().split(" ");
        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);

        int[] arr = IntStream.rangeClosed(1,Integer.parseInt(NK[0])).toArray();
        Set<Integer> s_li = new HashSet<>();
        int now = -1;
        for (int i=0; i<N; i++) {
            for (int j=0; j<K; j++) {
                now=(now+1)%N;
                while (s_li.contains(arr[now])) {
                    now=(now+1)%N;
                }
            }
            s_li.add(arr[now]);
            bw.write(String.valueOf(arr[now]));
            if (i!=N-1) bw.write(", ");
        }
        bw.write(">");
        bw.flush();
        bw.close();
    }
}
