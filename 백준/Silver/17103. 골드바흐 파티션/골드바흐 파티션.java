import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = sc.nextInt();
        int[] li = new int[T];
        int mx = 0;
        for (int i=0; i<T; i++) {
            int n = sc.nextInt();
            if (n>mx) mx = n;
            li[i]=n;
        }

        boolean[] check = new boolean[mx+1];
        check[1]=true;
        List<Integer> prime = new ArrayList<>();

        for (int i=2; i<mx; i++) {
            if (!check[i]) prime.add(i);
            for (int j=i*2; j<=mx; j+=i) {
                if (!check[j]) check[j]=true;
            }
        }
        Set<Integer> s_li = new HashSet<>(prime);
        for (int num: li) {
            int cnt = 0;
            for (int sosu: prime) {
                if (num-sosu<sosu) break;
                else if (s_li.contains(num-sosu)) cnt++;
            }
            bw.write(cnt+"\n");
        }
        bw.flush();
    }
}
