import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NK = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] li = new int[NK[0]];
        boolean[] visit = new boolean[NK[0]];
        int result = -1;
        int cnt = 0;

        for (int i=0; i<NK[0]; i++) li[i] = Integer.parseInt(br.readLine());

        int now = 0;
        while (true) {
            if (visit[now]) break;
            else {
                visit[now] = true;
                now = li[now];
                cnt++;
                if (now==NK[1]) {
                    result = cnt;
                    break;
                }
            }
        }
        System.out.println(result);

    }
}
