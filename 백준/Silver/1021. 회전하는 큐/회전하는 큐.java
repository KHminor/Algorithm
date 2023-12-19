import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());
        int cnt = 0;

        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) dq.add(i);

        for (int i = 0; i < m; i++) {
            int x = Integer.parseInt(st2.nextToken());
            while (true) {
                if (x == dq.getFirst()) {
                    dq.removeFirst();
                    break;
                }
                else {
                    if (indexOf(dq, x) < (double) dq.size()/2) {
                        while (dq.getFirst() != x) {
                            cnt ++;
                            dq.addLast(dq.removeFirst());
                        }
                    } else {
                        while (dq.getFirst() != x) {
                            cnt ++;
                            dq.addFirst(dq.removeLast());
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
    private static double indexOf(Deque<Integer> deque, int target) {
        Iterator<Integer> dq = deque.iterator();
        double index = 0;

        while (dq.hasNext()) {
            if (dq.next() == target) {
                return index;
            }
            index++;
        }

        return -1;
    }
}