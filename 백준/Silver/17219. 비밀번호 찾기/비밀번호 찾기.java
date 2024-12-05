import java.io.*;
import java.util.*;

public class Main {
    static private Map<String, String> dic = new HashMap<>();
    static private StringTokenizer st;
    static private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static private BufferedWriter bw;
    public static void main(String[] args) throws IOException {

        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        addMapData(N);
        findPwd(M);
        bw.flush();
    }

    private static void addMapData(int N) throws IOException {
        while (N > 0) {
            st = new StringTokenizer(br.readLine());
            dic.put(st.nextToken(), st.nextToken());
            N--;
        }
    }

    private static void findPwd(int M) throws IOException {
        while (M > 0) {
            bw.write(dic.get(br.readLine()) + '\n');
            M--;
        }
    }
}
