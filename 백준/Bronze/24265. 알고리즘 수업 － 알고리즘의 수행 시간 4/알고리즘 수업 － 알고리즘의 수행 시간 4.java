import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long result = 0L;
        for (int i=1; i<n; i++) result+=i;
        System.out.println(result);
        System.out.println(2);
    }
}
