import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        StringTokenizer num1 = new StringTokenizer(br.readLine());
        StringTokenizer num2 = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(num1.nextToken());
        String n2 = num2.nextToken();

        char[] num2Chars = n2.toCharArray();
        for (int i = num2Chars.length-1; i > -1; i--) {
            int x = Character.getNumericValue(num2Chars[i]);
            System.out.println(n1*x);
        }
        System.out.println(n1*Integer.parseInt(n2));
    }
}