import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 1;
        int st = 3;
        int now = 1;
        while (true) {
            if (N>=now+st) {
                now+=st;
                result++;
                st+=2;
            } else break;

        }
        System.out.println(result);
    }
}