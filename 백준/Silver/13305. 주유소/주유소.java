import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] d_dis= new int[N-1];
        int[] dis = new int[N-1];
        int[] li = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N-1; i++) {
            int num = Integer.parseInt(st.nextToken());
            for (int j=0; j<=i; j++) dis[j]+=num;
            d_dis[i] = num;
        }

        int[] oil = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) oil[i] = Integer.parseInt(st.nextToken());

        int result = -1;
        for (int i=0; i<N-1; i++) {
            li[i+1] = li[i]+d_dis[i]*oil[i];
            int hap = li[i]+dis[i]*oil[i];
            if (result==-1) result = hap;
            else result = Math.min(result, hap);
        }
        System.out.println(result);
    }
}
