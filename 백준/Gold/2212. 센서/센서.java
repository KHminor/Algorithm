import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int[] li = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) li[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(li);
        Integer[] diff = new Integer[N-1];
        for (int i=0; i<N-1; i++) diff[i] = li[i+1]-li[i];
        Arrays.sort(diff, Collections.reverseOrder());
        int result = 0;
        for (int i=K-1; i<N-1; i++) result += diff[i];
        System.out.println(result);
    }
}
