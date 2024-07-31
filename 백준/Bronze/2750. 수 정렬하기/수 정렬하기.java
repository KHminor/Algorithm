import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] li = new Integer[n];
        for (int i = 0; i < n; i++) li[i] = sc.nextInt();
        Arrays.sort(li);

        for (Integer num: li) System.out.println(num);
    }
}
