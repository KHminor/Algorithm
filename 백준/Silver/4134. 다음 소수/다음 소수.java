import java.io.*;
import java.util.*;
public class Main {
    static List<Long> sosu = new ArrayList<>();
    static long mx = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long N = Long.parseLong(br.readLine());

        for (long i=0; i<N; i++) {
            long num = Long.parseLong(br.readLine());
            while (!f_prime(num)) num++;
            bw.write(num+"\n");
        }

        bw.flush();
    }
    public static boolean f_prime(long num) {
        boolean state = true;
        if (num<2) state = false;
        else  {
            for (long j=2; j<=(long)Math.sqrt(num); j++) {
                if (num%j==0) {
                    state = false;
                    break;
                }
            }
        }
        return state;
    }
}
