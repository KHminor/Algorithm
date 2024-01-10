import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        char[] a_li = a.toCharArray();
        String b = st.nextToken();
        char[] b_li = b.toCharArray();
        Integer result = 50;

        for (int i = 0; i < b.length()-a.length()+1; i++) {
            Integer cnt = 0;
            for (int j = 0; j < a.length(); j++) {
                if (a_li[j] != b_li[i+j]) cnt += 1;
            }
            if (result > cnt) result = cnt;
        }
        System.out.println(result);
    }
}