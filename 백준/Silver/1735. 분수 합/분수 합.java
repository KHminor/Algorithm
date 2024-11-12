import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int gcd = GCD(a2,b2);
        a1 = a1*(b2/gcd);
        b1 = b1*(a2/gcd);
        int x = a1+b1;
        int y = a2*(b2/gcd);
        while (true) {
            gcd = GCD(x,y);
            if (gcd==1) break;
            else {
                x/=gcd;
                y/=gcd;
            }
        }
        System.out.printf("%d %d",x,y);
    }
    public static int GCD(int x, int y) {
        while (y!=0) {
            int tmp = y;
            y = x%y;
            x = tmp;
        }
        return x;
    }
}
