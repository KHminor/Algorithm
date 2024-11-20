import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a==0&&b==0&&c==0) break;
            int mx = Math.max(a,Math.max(b,c));
            if (a+b+c-mx<=mx) bw.write("Invalid"+"\n");
            else {
                if (a==b&b==c) bw.write("Equilateral"+"\n");
                else if (a==b || a==c || b==c) bw.write("Isosceles"+"\n");
                else bw.write("Scalene"+"\n");
            }
        }
        bw.flush();
    }
}
