import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        boolean[] li = new boolean[N+1];
        li[1] = true;
        for (int i=2; i<N; i++) {
            for (int j=i*2; j<=N; j+=i) {
                if (!li[j]) li[j] = true;
            }
        }

        int mn = 0;
        int hap = 0;
        for (int i=M; i<=N; i++) {
            if (!li[i]) {
                if (mn==0) mn = i;
                hap+=i;
            }
        }
        if (hap==0) System.out.println(-1);
        else {
            System.out.println(hap);
            System.out.println(mn);
        }
    }
}
