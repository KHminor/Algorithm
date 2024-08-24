import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] li = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = li[0];
        int c = li[1];

        // 집 위치 체크
        int[] check = new int[n];
        for (int i=0; i<n; i++) check[i] = Integer.parseInt(br.readLine());
        Arrays.sort(check);

        // 이분 탐색 시작
        System.out.println(B_Search(check, c));

//        int result = 1000000000;
//        for (int i=1; i<result_li.length; i++) result = Math.min(result, result_li[i]-result_li[i-1]);
//        System.out.println(result);
//        System.out.println(Arrays.toString(result_li));

    }

    public static int B_Search(int[] check, int c) {
        // 이분 탐색 시작
        int s = 0;
        int e = check[check.length-1]-check[0];

        int mx_range = 0;

        while (s<=e) {
            int m = (s+e)/2;
            int cnt = 1;
            int now = check[0];

            for (int i=1; i<check.length; i++) {
                if (check[i]-now >= m) {
                    cnt++;
                    now = check[i];
                }
            }

            if (cnt >= c) {
                mx_range = Math.max(mx_range, m);
                s = m+1;
            }
            else e = m-1;
        }
        return mx_range;
    }
}
