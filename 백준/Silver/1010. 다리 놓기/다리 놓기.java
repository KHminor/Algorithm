import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int t=0; t<T; t++) {
            int[] CN = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (CN[0]==CN[1]) bw.write(1+"\n");
            else bw.write(fac(CN[0], CN[1])+"\n");
        }
        bw.flush();
    }

    public static long fac(int C, int N) {
        Double[] li = new Double[N+1];
        li[1] = 1.0;
        for (int i=2; i<=N; i++) li[i] = li[i-1]*i;
        return Math.round(li[N]/(li[C]*li[N-C]));
    }
}
