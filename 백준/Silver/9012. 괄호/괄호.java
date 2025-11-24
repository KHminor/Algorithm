import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        ArrayDeque<String> arr;
        while (T!=0) {
            arr = new ArrayDeque<>();
            boolean result = true;
            char[] vps = br.readLine().toCharArray();
            for (int i=0; i<vps.length; i++) {
                if (vps[i]==')') {
                    if (arr.isEmpty()) {
                        result = false;
                        break;
                    } else {
                        arr.removeLast();
                    }
                } else {
                    arr.addLast(String.valueOf(vps[i]));
                }
            }
            if (result&&arr.isEmpty()) {
                bw.write("YES"+"\n");
            } else {
                bw.write("NO"+"\n");
            }
            T--;
        }
        bw.flush();
        bw.close();
    }
}
