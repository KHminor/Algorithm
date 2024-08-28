import java.io.*;
import java.util.*;
class Solution
{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int i=0; i<tc; i++) {
            int[] li = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int a = Math.min(li[0],li[1]);
            int b = Math.max(li[0],li[1]);
            int n = li[2];
            int cnt = 0;
            while (a<=n && b<=n) {
                if (a>=b) {
                    b += a;
                } else {
                    a += b;
                }
                cnt += 1;
            }
            System.out.println(cnt);
        }
    }
}