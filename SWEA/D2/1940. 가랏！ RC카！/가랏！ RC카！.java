import java.io.*;
import java.util.*;

class Solution
{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());
        int[] cmd = {0,1,-1};

        for (int t=1; t<=tc; t++) {
            int n = Integer.parseInt(br.readLine());
            int result = 0;
            int accel = 0;
            for (int i=0; i<n; i++) {
                int[] val_li = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                if (val_li[0]!=0) {
                    int u_val = cmd[val_li[0]]*val_li[1];
                    if (accel+u_val<=0) accel = 0;
                    else accel += u_val;
                }
                result += accel;
            }
            bw.write(String.format("#%d %d",t,result)+"\n");
        }
        bw.flush();
    }
}