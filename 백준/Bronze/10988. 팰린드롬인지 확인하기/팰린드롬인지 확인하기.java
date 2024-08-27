import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] li = br.readLine().toCharArray();
        int result = 1;
        for (int i=0; i<li.length/2; i++) {
            if (li[i] != li[li.length-1-i]) {
                result = 0;
                break;
            }
        }
        System.out.println(result);
    }
}
