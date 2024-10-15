import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb;
        int t = Integer.parseInt(br.readLine());
        for (int i=0; i<t; i++) {
            String[] li = br.readLine().split(" ");
            for (int x=0; x<li.length; x++) {
                sb = new StringBuilder("");
                for (int j=li[x].length()-1; j>=0; j--) sb.append(li[x].charAt(j));
                li[x] = sb.toString();
            }
            bw.write(String.join(" ", li) +"\n");
        }
        bw.flush();
    }
}
