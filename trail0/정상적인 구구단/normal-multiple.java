import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                System.out.printf("%d * %d = %d",i,j,i*j);
                if (j!=n) System.out.print(", ");
            }
            System.out.println();
        }
    }
}