import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (v == Integer.parseInt(st.nextToken())) result += 1;
        }
        System.out.println(result);
    }
}