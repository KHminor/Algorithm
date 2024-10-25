import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] fibo = new long[N+1];
        if (N>2) {
            fibo[0] = 1L;
            fibo[1] = 1L;
            for (int i=2; i<N; i++) fibo[i] = fibo[i-2]+fibo[i-1];
            System.out.println((fibo[N-1]+fibo[N-2])*2+(fibo[N-2]+fibo[N-3])*2);
        } else {
            if (N==1) System.out.println(4);
            else System.out.println(6);
        }
    }
}
