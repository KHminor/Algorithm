import java.util.Scanner;
import java.util.stream.IntStream;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i=0; i<T; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            int[] li = IntStream.rangeClosed(0,n).toArray();

            for (int j=0; j<k; j++) {
                for (int x=1; x<=n; x++) li[x] += li[x-1];
            }
            System.out.println(li[n]);
        }
    }
}
