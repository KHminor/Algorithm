import java.io.*;
import java.util.*;

class Solution
{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i=1; i<=n; i++) {
            int[] li = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int result = 0;
            for (int num: li) {
                if (num%2 != 0) result += num;
            }
            bw.write(String.format("#%d %d",i,result)+"\n");
        }
        bw.flush();
    }
}