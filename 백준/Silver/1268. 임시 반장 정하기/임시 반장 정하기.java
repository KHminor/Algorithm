import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] li = new int[N][5];
        int[][][] check = new int[5][10][N];

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<5; j++) {
                int num = Integer.parseInt(st.nextToken());
                li[i][j]=num;
                check[j][li[i][j]][i]++;
            }
        }
        int[] result = {-1,-1};
        for (int i=0; i<N; i++) {
            Set<Integer> s_li = new HashSet<>();
            for (int j=0; j<5; j++) {
                for (int k=0; k<N; k++) {
                    if (check[j][li[i][j]][k]!=0 && k!=i) s_li.add(k);
                }
            }
            if (s_li.size()>result[1]) {
                result[0]=i+1;
                result[1]=s_li.size();
            }
        }
        System.out.println(result[0]);
    }
}
