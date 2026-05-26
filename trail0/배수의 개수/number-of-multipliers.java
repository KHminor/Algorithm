import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int three = 0;
        int five = 0;
        for (int i=0; i<10; i++) {
            int x = sc.nextInt();
            if (x%3==0) three++;
            if (x%5==0) five++;
        }
        System.out.printf("%d %d", three, five);
    }
}