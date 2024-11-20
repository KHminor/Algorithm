import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] li;
    static int[] cmd = new int[4];
    static int[] result = {(int)Math.pow(10,9),-(int)Math.pow(10,9)};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        int ln = 0;
        li = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) li[i]=Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<4; i++) {
            cmd[i]=Integer.parseInt(st.nextToken());
            if (cmd[i]!=0) ln+=cmd[i];
        }
        rec(li[0],1,ln);
        System.out.println(result[1]);
        System.out.println(result[0]);

    }

    public static void rec(int now, int idx, int ln) {
        if (ln==0) {
            if (result[0]>now) result[0]=now;
            if (now>result[1]) result[1]=now;
        } else {
            for (int j=0; j<4; j++) {
                if (cmd[j]!=0) {
                    cmd[j]--;
                    switch (j) {
                        case 0:
                            rec(now+li[idx],idx+1,ln-1);
                            break;
                        case 1:
                            rec(now-li[idx],idx+1,ln-1);
                            break;
                        case 2:
                            rec(now*li[idx],idx+1,ln-1);
                            break;
                        case 3:
                            rec(now>0?now/li[idx]:-((-now)/li[idx]),idx+1,ln-1);
                            break;
                    }
                    cmd[j]++;
                }
            }
        }
    }
}
