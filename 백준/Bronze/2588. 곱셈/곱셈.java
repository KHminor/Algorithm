import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < 3; i++) {
            int x = a*(b%10);
            b = b/10;
            System.out.println(x);
            result += (int) (x*Math.pow(10,i));
        }
        System.out.println(result);
    }
}
