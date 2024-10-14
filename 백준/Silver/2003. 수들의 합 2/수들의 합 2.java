import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] li = new int[N+1];
        int result = 0;

        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=N; i++) li[i] = li[i-1]+Integer.parseInt(st.nextToken());

        // 찾기
        for (int i=0; i<N; i++) {
            for (int j=i+1; j<=N; j++) {
                if (li[j]-li[i]==M) {
                    result ++;
                    break;
                } else if (li[j]-li[i]>M) break;
            }
        }
        System.out.println(result);
    }
}
