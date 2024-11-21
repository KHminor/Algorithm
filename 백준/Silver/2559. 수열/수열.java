import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] li = new int[N];
        li[0]=sc.nextInt();
        for (int i=1; i<N; i++) {
            li[i]=li[i-1]+sc.nextInt();
        }
        int mx = li[K-1];
        for (int i=0; i<N-K; i++) {
            mx = Math.max(mx,li[i+K]-li[i]);
        }
        System.out.println(mx);
    }
}
