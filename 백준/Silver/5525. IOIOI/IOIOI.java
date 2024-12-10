import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String s = br.readLine();
        System.out.println(findResult(M,N*2+1,s));
    }
    private static int findResult(int M, int ms_ln, String s) {
        int cnt = 0;
        int ln = 0;
        char[] check = {'I','O'};
        for (int i=0; i<M; i++) {
            if (check[ln%2]==s.charAt(i)) ln++;
            else {
                cnt+=cal(ms_ln, ln);
                ln=check[0]==s.charAt(i)?1:0;
            }
        }
        if (ln!=0) cnt+=cal(ms_ln, ln);
        return cnt;
    }

    private static int cal(int ms_ln, int ln) {
        return ln>=ms_ln?(ln-ms_ln)/2+1:0;
    }
}