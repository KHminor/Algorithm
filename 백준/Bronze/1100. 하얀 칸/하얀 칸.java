import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;

        for (int i = 0; i < 8; i++) {
            char[] li = br.readLine().toCharArray();
            for (int j = 0; j < 8; j++) {
                if (i%2 == 0 && j%2 == 0 && li[j] == 'F') cnt ++;
                else if (i%2 == 1 && j%2 == 1 && li[j] == 'F') cnt ++;
            }
        }
        System.out.println(cnt);
    }
}
