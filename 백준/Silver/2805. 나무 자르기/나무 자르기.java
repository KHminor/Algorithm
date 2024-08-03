import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 배열을 정렬 후
        // 이분 탐색을 통한 mid 값을 기준으로 반복문을 돌리고
        // 이후 해당 값에 따른 범위를 다시 지정 후 찾는 방법이구먼
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken()); // 나무 수
        int m = Integer.parseInt(st1.nextToken()); // 가져갈 길이
        int result = 0;

        int[] li = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(li);

        // 기준 높이 이분 탐색
        int start = 1;
        int end = li[n-1];

        while (start <= end) {
            int mid = (start+end)/2;
            long hap = 0;
            for (int num: li) {
                if (num >mid) hap += num-mid;
            }
            if (hap >= m) {
                start = mid+1;
                result = mid;
            } else end = mid-1;
        }

        System.out.println(result);

    }
}
