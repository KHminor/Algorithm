import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        long result = 0;
        int now = (int)Math.round(Math.sqrt(M));
        int start = 0;
        while (now*now<=N) {
            if (M<=now*now&&now*now<=N) {
                result+= (long) now*now;
                if (start==0) start = now*now;
            }
            now++;
        }
        if (result==0) System.out.println(-1);
        else {
            System.out.println(result);
            System.out.println(start);
        }
    }
}
