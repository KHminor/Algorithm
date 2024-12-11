import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static int M;
    static int[] check;
    static int[] li;
    static boolean[] visit;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        li = new int[N];
        visit = new boolean[N];
        check = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) li[i]=Integer.parseInt(st.nextToken());
        Arrays.sort(li);
        sequence(0);
        bw.flush();
    }

    private static void sequence(int cnt) throws IOException {
        if (cnt==M) {
            StringBuilder sb = new StringBuilder();
            for (int num: check) sb.append(num+" ");
            bw.write(sb+"\n");
        } else {
            for (int i=0; i<N; i++) {
                if (!visit[i]) {
                    visit[i]=true;
                    check[cnt]=li[i];
                    sequence(cnt+1);
                    visit[i]=false;
                }
            }
        }
    }
}