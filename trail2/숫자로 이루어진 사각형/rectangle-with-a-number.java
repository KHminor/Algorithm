import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.printf("%d ",cnt);
                if (cnt+1>9) cnt = 1;
                else  cnt++;
            }
            System.out.println();
        }
    }
}