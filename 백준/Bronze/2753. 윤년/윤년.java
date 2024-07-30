import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        if (x%4 == 0 && (x%100 != 0 || x%400 == 0)) System.out.println(1);
        else System.out.println(0);
    }
}
