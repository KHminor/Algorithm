import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int m = Integer.parseInt(br.readLine());
        int num = 0;
        Set<Integer> s_li = new HashSet<>();

        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if (cmd.equals("all")) s_li = IntStream.rangeClosed(1,20).boxed().collect(Collectors.toSet());
            else if (cmd.equals("empty")) s_li.clear();
            else {
                num = Integer.parseInt(st.nextToken());
                switch (cmd) {
                    case "add":
                        if (!s_li.contains(num)) s_li.add(num);
                        break;
                    case "remove":
                        if (s_li.contains(num)) s_li.remove(num);
                        break;
                    case "check":
                        int val = s_li.contains(num) ? 1 : 0;
                        bw.write(val + "\n");
                        break;
                    case "toggle":
                        if (s_li.contains(num)) s_li.remove(num);
                        else s_li.add(num);
                        break;
                }
            }
        }
        bw.flush();
    }
}
