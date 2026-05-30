import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static boolean isPrime(int n) {
        for (int i=2; i<=(int) Math.sqrt(n); i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
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
            b = temp;
        }

        for (int i=a; i<=b; i++) {
            if (isPrime(i)) {
                result+=i;
            }
        }
        System.out.println(result);
    }
}