import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = (n+1)*(n/2);
        if (n%2!=0) result += (n/2)+1;
        System.out.println(result/10);
        
    }
}