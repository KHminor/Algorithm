import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<Integer> li = new LinkedList<>();
        for (int i = 0; i < n; i++) li.add(Integer.parseInt(br.readLine()));
        Collections.sort(li);
        for (int num: li) bw.write(num + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
