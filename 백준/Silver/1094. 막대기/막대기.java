import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int hap = 64;
        Queue<Integer> li = new PriorityQueue<>(Arrays.asList(64));
        while (hap!=X) {
            int now = li.poll();
            if (hap-now/2>=X) {
                hap-=now/2;
                li.add(now/2);
            } else {
                li.add(now/2);
                li.add(now/2);
            }
        }
        System.out.println(li.size());
    }
}
