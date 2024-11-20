import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mx = Math.max(a,Math.max(b,c));
        System.out.println(a+b+c-mx>mx?a+b+c:2*(a+b+c-mx)-1);
    }
}
