import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int result = 100;
        for (int i=0; i<n; i++) {
            int num = sc.nextInt();
            if (result>num) result = num;
        }
        System.out.println(result);
    }
}