import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String a = st.nextToken();
        String b = st.nextToken();
        for (int i = a.length()-1; i >= 0; i--) {
            sb.append(a.charAt(i));
        }
        for (int i = b.length()-1; i >= 0; i--) {
            sb2.append(b.charAt(i));
        }

        if (Integer.parseInt(sb.toString()) > Integer.parseInt(sb2.toString())) System.out.println(Integer.parseInt(sb.toString()));
        else System.out.println(Integer.parseInt(sb2.toString()));
    }
}
