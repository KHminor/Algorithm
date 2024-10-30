import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Long> li = new PriorityQueue<>();
        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++) {
            long x = Long.parseLong(br.readLine());
            if (x==0) {
                if (li.isEmpty()) bw.write(0+"\n");
                else bw.write(li.poll()+"\n");
            }
            else li.add(x);
        }
        bw.flush();
    }
}
