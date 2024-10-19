import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] li = new int[N];
        for (int i=0; i<N; i++) li[N-1-i] = Integer.parseInt(br.readLine());
        int result = 1;
        int now = li[0];
        for (int i=1; i<N; i++) {
            if (li[i]>now) {
                result++;
                now = li[i];
            }
        }
        System.out.println(result);
    }
}
