import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num != 0) {
            System.out.println(num);
            num = sc.nextInt();
        }
    }
}