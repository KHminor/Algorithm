import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Set<String> s_li = new HashSet<>();
        while (N>0) {
            st = new StringTokenizer(br.readLine());
            String nm = st.nextToken();
            String cmd = st.nextToken();
            if (cmd.equals("enter")) s_li.add(nm);
            else s_li.remove(nm);
            N--;
        }
        List<String> result = new ArrayList<>(s_li);
        Collections.sort(result, Collections.reverseOrder());
        for (String name: result) bw.write(name+"\n");
        bw.flush();
    }
}
