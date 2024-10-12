import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] a_li = new int[N];
        int[] b_li = new int[M];
        int[] result = new int[N+M];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) a_li[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<M; i++) b_li[i] = Integer.parseInt(st.nextToken());

        int a_idx = 0;
        int b_idx = 0;

        for (int i=0; i<N+M-1; i++) {
            if (N>a_idx&&M>b_idx) {
                if (a_li[a_idx]>=b_li[b_idx]) {
                    result[i] = b_li[b_idx];
                    b_idx++;
                } else {
                    result[i] = a_li[a_idx];
                    a_idx++;
                }
            }
        }

        int s_idx = a_idx+b_idx;
        if (N==a_idx) {
            a_li = b_li;
            a_idx = b_idx;
        }

        for (int i=s_idx; i<N+M; i++) {
            result[i] = a_li[a_idx];
            a_idx++;
        }

        System.out.println(Arrays.stream(result).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}
