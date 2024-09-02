import java.io.*;

class Solution
{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc = Integer.parseInt(br.readLine());
        for (int t=1; t<=tc; t++) {
            int num = Integer.parseInt(br.readLine());
            boolean[] check = new boolean[10];
            int cnt = 0;
            int round = 1;
            while (true) {
                int d_num = num*round;
                while (d_num!=0) {
                    int namugy = d_num%10;
                    if (!check[namugy]) {
                        check[namugy]= true;
                        cnt++;
                    }
                    d_num /= 10;
                }
                if (cnt == 10) break;
                round++;
            }
            bw.write(String.format("#%d %d",t,num*round)+"\n");
        }
        bw.flush();
    }
}