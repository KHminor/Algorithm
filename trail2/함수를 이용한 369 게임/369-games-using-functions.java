import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static boolean is369(int n) {
        boolean state = false;
        int now = n;
        while (now>10) {
            if (now%10==3 || now%10==6 || now%10==9) {
                return true;
            } else now/=10;
        }
        if (!state && (now == 3 || now == 6 || now == 9)) state = true;
        return state;
    }

    public static boolean is3Mul(int n) {
        return n%3==0 ? true : false;
    }

    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int result = 0;
        if (a>b) {
            int temp = a;
            a = b;
            b= temp;
        }
        for (int i=a; i<=b; i++) {
            if (is3Mul(i) || is369(i)) result++;
        }
        System.out.println(result);
    }
}