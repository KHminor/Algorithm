import java.io.*;
import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static BufferedWriter bw;
    static int[] li;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = sc.nextInt();
        M = sc.nextInt();
        li = new int[M];
        rec(0,0);
        bw.flush();
    }

    public static void rec(int idx, int ln) throws IOException {
        if (ln==M) {
            for (int num: li) bw.write(num+" ");
            bw.write("\n");
        } else {
            for (int i=1; i<=N; i++) {
                li[idx]=i;
                rec(idx+1,ln+1);
            }
        }
    }
}
