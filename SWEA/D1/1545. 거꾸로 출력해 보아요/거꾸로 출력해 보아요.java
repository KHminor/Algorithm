import java.io.*;
class Solution
{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i=n; i>=0; i--) {
            if (i==0) System.out.println(i);
            else System.out.print(i + " ");
        }
    }
}