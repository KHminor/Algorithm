import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb;
        int T = Integer.parseInt(br.readLine());
        while (T!=0) {
            String[] arr = br.readLine().split(" ");
            sb = new StringBuilder();
            for (int i=0; i<arr.length; i++) {
                for (int j=arr[i].length()-1; j>=0; j--) {
                    sb.append(arr[i].charAt(j));
                }
                sb.append(" ");
            }
            bw.write(sb+"\n");
            T--;
        }
        bw.flush();
        bw.close();
    }
}
