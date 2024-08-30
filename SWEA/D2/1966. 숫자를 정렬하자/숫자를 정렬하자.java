import java.io.*;
import java.util.*;
import java.util.stream.*;

class Solution
{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());
        for (int t=1; t<=tc; t++) {
            int N = Integer.parseInt(br.readLine());
            int[] li = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(li);
            String result =  Arrays.stream(li).mapToObj(String::valueOf).collect(Collectors.joining(" "));
            bw.write(String.format("#%d %s",t,result)+"\n");
        }
        bw.flush();
    }
}