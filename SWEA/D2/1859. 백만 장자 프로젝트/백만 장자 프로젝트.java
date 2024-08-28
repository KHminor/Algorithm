import java.io.*;
import java.util.*;

class Solution
{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());
        for (int i=1; i<=tc; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] li = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            long result = 0L;
            int val = 0;

            for (int j=li.length-1; j>=0; j--) {
                if (li[j] >= val) val = li[j];
                else result += (long) val-li[j];
            }


            bw.write(String.format("#%d %d",i,result)+"\n");

        }
        bw.flush();
    }
}