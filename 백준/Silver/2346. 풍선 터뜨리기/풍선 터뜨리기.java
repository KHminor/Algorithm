import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = sc.nextInt();
        int[] li = new int[N];
        boolean[] check = new boolean[N];
        for (int i=0; i<N; i++) li[i]=sc.nextInt();

        int now = 0;
        for (int i=0; i<N; i++) {
            check[now] = true;
            bw.write((now%N)+1+" ");

            if (i!=N-1) {
                int next = now;
                int x = li[next]>0?1:-1;

                for (int j=0; j<Math.abs(li[now]); j++) {
                    next = next+x>=0?(next+x)%N:next+x+N;

                    while (check[next]) {
                        next = next+x>=0?(next+x)%N:next+x+N;
                    }
                }
                now = next;
            }
        }
        bw.flush();
    }
}
