import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] mtx = new int[n][m];

        for (int tc=0; tc<2; tc++) {
            for (int i=0; i<n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j=0; j<m; j++) mtx[i][j]+=Integer.parseInt(st.nextToken());
            }
        }

        for (int[] li: mtx) System.out.println(Arrays.stream(li).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}
