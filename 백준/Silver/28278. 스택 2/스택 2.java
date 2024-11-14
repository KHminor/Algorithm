import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> dq = new ArrayDeque<>();
        int N = sc.nextInt();

        while (N>0) {
            int cmd = sc.nextInt();
            switch (cmd) {
                case 1:
                    dq.add(sc.nextInt());
                    break;
                case 2:
                    if (!dq.isEmpty()) bw.write(dq.pollLast()+"\n");
                    else bw.write(-1+"\n");
                    break;
                case 3:
                    bw.write(dq.size()+"\n");
                    break;
                case 4:
                    if (dq.isEmpty()) bw.write(1+"\n");
                    else bw.write(0+"\n");
                    break;
                case 5:
                    if (!dq.isEmpty()) bw.write(dq.peekLast()+"\n");
                    else bw.write(-1+"\n");
            }
            N--;
        }
        bw.flush();
    }
}
