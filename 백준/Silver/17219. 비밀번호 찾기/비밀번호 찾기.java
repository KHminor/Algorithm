import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String,String> dic = new HashMap<>();
        while (N>0) {
            st = new StringTokenizer(br.readLine());
            dic.put(st.nextToken(),st.nextToken());
            N--;
        }
        while (M>0) {
            bw.write(dic.get(br.readLine())+'\n');
            M--;
        }
        bw.flush();
    }
}
