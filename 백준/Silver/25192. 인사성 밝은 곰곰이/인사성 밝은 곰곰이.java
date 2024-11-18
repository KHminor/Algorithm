import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<String> s_li = new HashSet<>();
        int result = 0;
        while (N>0) {
            String cmd = sc.next();
            if (cmd.equals("ENTER")) s_li.clear();
            else if (!s_li.contains(cmd)) {
                result++;
                s_li.add(cmd);
            }
            N--;
        }
        System.out.println(result);
    }
}
