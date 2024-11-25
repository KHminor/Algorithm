import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        int N = sc.nextInt();
        while (N>0) {
            int num = sc.nextInt();
            if (num!=0) heap.add(num);
            else {
                if (heap.isEmpty()) bw.write("0\n");
                else bw.write(heap.poll()+"\n");
            }
            N--;
        }
        bw.flush();
    }
}
