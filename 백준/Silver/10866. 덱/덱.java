import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> arr = new ArrayDeque<>();

        while(N!=0) {
            String[] li = br.readLine().split(" ");
            switch (li[0]) {
                case "push_front":
                    arr.addFirst(Integer.parseInt(li[1]));
                    break;
                case "push_back":
                    arr.addLast(Integer.parseInt(li[1]));
                    break;
                case "pop_front":
                    bw.write((arr.isEmpty()?-1:arr.removeFirst())+"\n");
                    break;
                case "pop_back":
                    bw.write((arr.isEmpty()?-1:arr.removeLast())+"\n");
                    break;
                case "size":
                    bw.write(arr.size()+"\n");
                    break;
                case "empty":
                    bw.write((arr.isEmpty()?1:0)+"\n");
                    break;
                case "front":
                    bw.write((arr.isEmpty()?-1:arr.getFirst())+"\n");
                    break;
                case "back":
                    bw.write((arr.isEmpty()?-1:arr.getLast())+"\n");
                    break;
            }
            N--;
        }
        bw.flush();
        bw.close();
    }
}
