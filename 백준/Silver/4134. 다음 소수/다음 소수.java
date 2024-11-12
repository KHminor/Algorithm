import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long T = Long.parseLong(bf.readLine());
        long n;

        for (int i = 0; i < T; i++) {
            n = Long.parseLong(bf.readLine());

            while (!isPrime(n)) {
                n++;
            }
            bw.write(String.valueOf(n) + "\n");
            bw.flush();
        }
        bw.close();
    }

    public static boolean isPrime(long a) {
        if (a < 2)
            return false;
        for (long i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}