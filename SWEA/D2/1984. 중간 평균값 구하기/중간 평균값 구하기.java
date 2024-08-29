import java.io.*;
import java.util.*;

class Solution
{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc = Integer.parseInt(br.readLine());

        for (int t=1; t<=tc; t++) {
            int[] li = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int max_num = 0;
            int min_num = 10000;
            int result = 0;
            for (int num: li) {
                max_num = Math.max(max_num, num);
                min_num = Math.min(min_num, num);
                result += num;
            }
            bw.write(String.format("#%d %d",t,Math.round((result-max_num-min_num)/8.0))+"\n");
        }
        bw.flush();
    }
}