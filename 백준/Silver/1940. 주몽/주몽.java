import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] li = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean[] visit = new boolean[N];
        Arrays.sort(li);

        int cnt = 0;
        for (int i=0; i<N-1; i++) {
            for (int j=i+1; j<N; j++) {
                if (!visit[i] && !visit[j] && (li[i]+li[j]==M)) {
                    visit[i] = true;
                    visit[j] = true;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }
}
