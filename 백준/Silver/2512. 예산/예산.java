import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] li = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(li);
        int m = Integer.parseInt(br.readLine());
        int result = 0;

        // 이분 탐색
        int s = 0;
        int e = li[n-1];

        while (s<=e) {
            int mid = (s+e)/2;
            int hap = 0;
            for (int num: li) {
                if (num>mid) hap += mid;
                else hap += num;
            }
            if (m>=hap) {
                result = mid;
                s = mid+1;
            } else e = mid-1;
        }
        System.out.println(result);
    }
}
