import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> s_li = new HashSet<>(Arrays.asList("ChongChong"));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        while (N>0) {
            st = new StringTokenizer(br.readLine());
            String x = st.nextToken();
            String y = st.nextToken();
            if (x.equals("ChongChong")) s_li.add(y);
            else if (y.equals("ChongChong")) s_li.add(x);
            else if (s_li.contains(x)) s_li.add(y);
            else if (s_li.contains(y)) s_li.add(x);
            N--;
        }

        System.out.println(s_li.size());
    }
}

