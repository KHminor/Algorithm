import java.io.*;
import java.util.*;

public class Main {
    private static int[][][] mtx = new int[21][21][21];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == -1 && a == b && a == c) break;
            bw.write(String.format("w(%d, %d, %d) = %d", a, b, c, rec(a, b, c)) + "\n");
        }
        bw.flush();
    }

    public static int rec(int a, int b, int c) {
        if (check(a,b,c)&&mtx[a][b][c]!=0) return mtx[a][b][c];
        else if (a<=0 || b<=0 || c<=0) return 1;
        else if (a>20 || b>20 || c>20) return mtx[20][20][20]=rec(20, 20, 20);
        else if (a<b&&b<c) return mtx[a][b][c]=rec(a,b,c-1)+rec(a,b-1,c-1)-rec(a,b-1,c);
        else return mtx[a][b][c]=rec(a-1,b,c)+rec(a-1,b-1,c)+rec(a-1,b,c-1)-rec(a-1,b-1,c-1);
    }

    public static boolean check(int a, int b, int c) {
        return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20;
    }
}

