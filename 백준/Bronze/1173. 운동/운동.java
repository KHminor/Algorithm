import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int be_m = m;
        int cnt = 0;

        if (M-m >= T) {
            for (int i = 0; i < N; i++) {
                if (m+T <= M) {
                    m += T;
                    cnt ++;
                }
                else {
                    while (m+T > M) {
                        cnt ++;
                        if (m-R >= be_m) m -= R;
                        else {
                            m = be_m;
                            break;
                        }
                    }
                    m += T;
                    cnt ++;
                }
            }
            System.out.println(cnt);
        } else {
            System.out.println(-1);
        }
    }
}
