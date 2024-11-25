import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> heap = new PriorityQueue<>((a,b)-> {
            if (Math.abs(a)==Math.abs(b)) return a-b;
            return Math.abs(a)-Math.abs(b);
        });
        int N = Integer.parseInt(br.readLine());
        while (N>0) {
            int num = Integer.parseInt(br.readLine());
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
