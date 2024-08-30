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
            int n = Integer.parseInt(br.readLine());
            int[] li = {0,0,0,0,0};
            while (n!=1) {
                if (n%2==0) {
                    li[0]++;
                    n /= 2;
                } else if (n%3==0) {
                    li[1]++;
                    n /= 3;
                } else if (n%5==0) {
                    li[2]++;
                    n /= 5;
                } else if (n%7==0) {
                    li[3]++;
                    n /= 7;
                } else if (n%11==0){
                    li[4]++;
                    n /= 11;
                }
            }
            String result = Arrays.stream(li).mapToObj(String::valueOf).collect(Collectors.joining(" "));
            bw.write(String.format("#%d %s",t,result)+"\n");
        }
        bw.flush();
    }
}