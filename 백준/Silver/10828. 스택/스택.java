import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Integer> li = new LinkedList<>();
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    li.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (li.isEmpty()) bw.write(-1 + "\n");
                    else {
                        int num = li.remove(li.size()-1);
                        bw.write(num + "\n");
                    }
                    break;
                case "size":
                    bw.write(li.size() + "\n");
                    break;
                case "empty":
                    if (li.isEmpty()) bw.write(1 + "\n");
                    else bw.write(0 + "\n");
                    break;
                case "top":
                    if (li.isEmpty()) bw.write(-1 + "\n");
                    else {
                        bw.write(li.get(li.size()-1) + "\n");
                    }
                    break;
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
