import java.util.*;

public class Main {
    static Deque<List<Integer>> dq = new ArrayDeque<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[] li = new boolean[N+1];
        dq.add(new ArrayList<>(Arrays.asList(N,0)));
        li[N] = true;

        while (!dq.isEmpty()) {
            List<Integer> now = dq.pollFirst();
            if (now.get(0)==1) {
                System.out.println(now.get(1));
                break;
            }
            if (now.get(0)%3==0 && !li[now.get(0)/3]) {
                li[now.get(0)/3] = true;
                dq.add(new ArrayList<>(Arrays.asList(now.get(0)/3,now.get(1)+1)));
            } if (now.get(0)%2==0 && !li[now.get(0)/2]) {
                li[now.get(0)/2] = true;
                dq.add(new ArrayList<>(Arrays.asList(now.get(0)/2,now.get(1)+1)));
            } if (now.get(0)-1>0 && !li[now.get(0)-1]) {
                li[now.get(0)-1] = true;
                dq.add(new ArrayList<>(Arrays.asList(now.get(0)-1,now.get(1)+1)));
            }
        }
    }
}
