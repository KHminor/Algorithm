import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String s = br.readLine();
        System.out.println(findResult(M,N*2+1,makeString(N),s));
    }
    private static String makeString(int N) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++) sb.append("IO");
        sb.append("I");
        return sb.toString();
    }

    private static int findResult(int M, int ms_ln, String ms, String s) {
        int cnt = 0;
        for (int i=0; i<=M-ms_ln; i++) {
            if (s.substring(i,i+ms_ln).equals(ms)) cnt++;
        }
        return cnt;
    }
}