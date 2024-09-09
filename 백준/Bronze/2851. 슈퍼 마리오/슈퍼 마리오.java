import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        boolean state = false;
        for (int i=0; i<10; i++) {
            int num = Integer.parseInt(br.readLine());
            if (!state && Math.abs(100-result)>=Math.abs(100-(result+num))) result += num;
            else state = true;

        }
        System.out.println(result);
    }
}
