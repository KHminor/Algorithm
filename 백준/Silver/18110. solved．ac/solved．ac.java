import java.util.Arrays;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] li = new int[N];
        for (int i=0; i<N; i++) li[i]= Integer.parseInt(br.readLine());
        Arrays.sort(li);
        double hap = 0;
        int cnt = 0;
        for (int i=(int)Math.round(N*0.15); i<(int)(N-Math.round(N*0.15)); i++) {
            hap+=li[i];
            cnt++;
        }
        System.out.println(Math.round(hap/cnt));
    }
}
