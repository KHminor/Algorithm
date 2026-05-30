import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int hap = n/10+n%10;
        if (n%2==0 && hap%5==0) System.out.println("Yes");
        else System.out.println("No");
    }
}