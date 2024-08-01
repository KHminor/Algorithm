import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int mx_ln = 0;
        List<String> li = new ArrayList<>(n);
        int[] check_li = new int[51];

        for (int i=0; i<n; i++) {
            String inp = br.readLine();
            int inp_ln = inp.length();
            if (!li.contains(inp)) {
                 li.add(inp);
                mx_ln = Math.max(mx_ln, inp_ln);
                 check_li[inp_ln]++;
            }
        }

        br.close();

        List<List<String>> mtrix = new ArrayList(mx_ln+1);

        for (int i=0; i<=mx_ln; i++) mtrix.add(new ArrayList<>(check_li[i]));

        for (String inp: li) mtrix.get(inp.length()).add(inp);

        for (List<String> i: mtrix) {
            Collections.sort(i);
            for (String j: i) bw.write(j+"\n");
        }

        bw.flush();
        bw.close();
    }
}
