import java.io.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] li = IntStream.rangeClosed(1,n).toArray();
        while (n!=1) {
            int cnt = 0;
            int[] arr = new int[n/2];
            for (int i=1; i<n; i+=2) {
                arr[cnt] = li[i];
                cnt++;
            }
            li = arr;
            n = cnt;
        }
        System.out.println(li[0]);
    }
}
