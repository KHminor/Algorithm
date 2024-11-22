import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String S = br.readLine();
        int q = Integer.parseInt(br.readLine());
        int[][] li = new int[S.length()+1][26];
        for (int i=0; i<S.length(); i++) {
            int idx = (int)S.charAt(i)-97;
            for (int j=0; j<26; j++) li[i+1][j]=li[i][j];
            li[i+1][idx]++;
        }
        while (q>0) {
            st  = new StringTokenizer(br.readLine());
            int idx = st.nextToken().charAt(0)-97;
            int s = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            bw.write(li[l+1][idx]-li[s][idx]+"\n");
            q--;
        }
        bw.flush();
    }
}
