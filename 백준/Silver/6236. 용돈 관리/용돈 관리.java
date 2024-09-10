import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int result = 10000;
        int N = NM[0];
        int M = NM[1];
        int[] arr = new int[N];
        int max_val = 0;
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i]>max_val) max_val = arr[i];
        }

        int s = 1;
        int e = 1000000000;
        // b_f
        while (s<=e) {
            int mid = (s+e)/2;
            if (mid>= max_val) {
                int cnt = 1;
                int now = mid;
                for (int num: arr) {
                    if (now<num) {
                        cnt++;
                        now = mid-num;
                    } else now -= num;

                }
                if (cnt>M) s = mid+1;
                else {
                    e = mid-1;
                    result = mid;
                }
            } else s = mid+1;
        }
        System.out.println(result);
    }
}
