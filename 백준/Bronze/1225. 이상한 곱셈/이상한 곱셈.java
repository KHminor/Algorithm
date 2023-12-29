import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] a_li = st.nextToken().toCharArray();
        Long a = 0L;
        char[] b_li = st.nextToken().toCharArray();
        Long result = 0L;
        for (int i = 0; i < a_li.length; i++) a += Integer.parseInt(String.valueOf(a_li[i]));
        for (int i = 0; i < b_li.length; i++) {
            result += a*Integer.parseInt(String.valueOf(b_li[i]));
        }
        System.out.println(result);
    }
}