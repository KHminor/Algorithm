import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 100000;
        for (int i=N/5; i>0; i--) {
            int x = N-(i*5);
            if (x%2==0) result = Math.min(result, x/2+i);
        }
        if (N%2==0) result = Math.min(result, N/2);
        System.out.println(result==100000?-1:result);
    }
}
