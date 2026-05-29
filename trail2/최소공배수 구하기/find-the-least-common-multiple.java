import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        System.out.println(LCM(n,m));
    }

    public static int LCM(int n, int m) {
        int min = n;
        int max = m;
        if (min>m) {
            min = m;
            max = n;
        }
        int result = 1;
        for (int i=2; i<=min; i++) {
            if (min%i==0 && max%i==0) result = i;
        }
        return (min/result)*(max/result)*result;
    }
}