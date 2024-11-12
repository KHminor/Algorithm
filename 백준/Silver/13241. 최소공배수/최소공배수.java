import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long gdc = GDC(a,b);
        System.out.println((b/gdc*a));

    }
    public static int GDC(int a, int b) {
        while (b!=0) {
            int tmp = b;
            b = a%b;
            a = tmp;
        }return a;
    }
}
