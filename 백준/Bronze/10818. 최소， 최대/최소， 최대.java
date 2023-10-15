import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int max = num;
        int min = num;

        for (int i = 0; i < n-1; i++) {
            num = Integer.parseInt(st.nextToken());
            if (num > max) max = num;
            else if (min > num) min = num;
        }
        System.out.println(min + " " + max);
    }
}