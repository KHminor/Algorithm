import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static long[][] li;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        li = new long[num+1][2];
        for (int i=2; i<=num; i++) {
            fac(i);
        }
        System.out.println(Math.min(li[num][0],li[num][1]));
    }

    public static void fac(int num) {
        li[num][0] = li[num-1][0];
        li[num][1] = li[num-1][1];
        int now = num;
        while (now!=1) {
            if (now%2==0) {
                li[num][0]++;
                now/=2;
            } else if (now%5==0) {
                li[num][1]++;
                now/=5;
            } else break;
        }
    }
}
