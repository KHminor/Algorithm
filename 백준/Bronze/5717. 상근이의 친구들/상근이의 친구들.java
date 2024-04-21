import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] val = br.readLine().split(" ");
            Integer m = Integer.parseInt(val[0]);
            Integer f = Integer.parseInt(val[1]);
            if (m == 0 && f == 0) break;
            System.out.println(m+f);
        }

    }
}