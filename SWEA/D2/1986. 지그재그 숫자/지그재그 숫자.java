import java.io.*;

class Solution
{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int tc=1; tc<=t; tc++) {
            int n = Integer.parseInt(br.readLine());
            if (n%2 != 0) bw.write(String.format("#%d %d",tc,-1*(n/2)+n)+"\n");
            else bw.write(String.format("#%d %d",tc,-1*(n/2))+"\n");
        }
        bw.flush();
    }
}