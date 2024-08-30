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
            int hour = (li[0]+li[2]+(li[1]+li[3])/60)%12;
            int minute = (li[1]+li[3])%60;
            if (hour == 0) hour = 12;
            bw.write(String.format("#%d %d %d",t,hour,minute)+"\n");
        }
        bw.flush();
    }
}