import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int result = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j=a; j<=b; j++) {
                if (j%2==0) result += j;
            }
            System.out.println(result);
        }
    }
}