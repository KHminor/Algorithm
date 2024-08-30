import java.io.*;
import java.util.*;

class Solution
{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());
        int[] month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        for (int t=1; t<=tc; t++) {
            int[] li = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int result = 0;
            if (li[0]==li[2]) result = li[3]-li[1]+1;
            else {
                for (int i=li[0]+1; i<li[2]; i++) result += month[i];
                result += month[li[0]]-li[1]+li[3]+1;
            }
            bw.write(String.format("#%d %d",t,result)+"\n");
        }
        bw.flush();
    }
}