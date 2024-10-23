import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N>=2) {
            int[] li = new int[N+1];
            li[1] = 1;
            for (int i=2; i<=N; i++) li[i] = li[i-1]+li[i-2];
            System.out.println(li[N]);
        } else System.out.println(N);
    }
}
