import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> li = new ArrayList<>();
        int mx = 0;
        while (true) {
            int N = sc.nextInt();
            if (N==0) break;
            li.add(N);
            if (N>mx) mx = N;
        }
        boolean[] prime = new boolean[2*mx+1];
        prime[1]=true;
        for (int i=2; i<2*mx; i++) {
            for (int j=i*2; j<=2*mx; j+=i) {
                if (!prime[j]) prime[j]=true;
            }
        }

        for (int num: li) {
            int cnt = 0;
            for (int i=num+1; i<=2*num; i++) {
                if (!prime[i]) cnt++;
            }
            bw.write(cnt+"\n");
        }
        bw.flush();
    }
}
