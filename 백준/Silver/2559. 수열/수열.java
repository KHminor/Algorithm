import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] li = new int[N];
        int[] check = new int[N+1];
        for (int i=0; i<N; i++) {
            li[i]=sc.nextInt();
            check[i+1]=li[i]+check[i];
        }
        int result = Integer.MIN_VALUE;
        for (int i=0; i<=N-K; i++) {
            result = Math.max(result, check[i + K] - check[i]);
        }
        System.out.println(result);
    }
}
