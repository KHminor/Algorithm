import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] mtx = new int[101][101];
        boolean[][] visit = new boolean[101][101];
        int result = 0;

        for (int t=0; t<N; t++) {
            int[] val = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int y=val[1]; y<=val[3]; y++) {
                for (int x=val[0]; x<=val[2]; x++) {
                    if (!visit[y][x]) {
                        mtx[y][x]++;
                        if (mtx[y][x]>M) {
                            result++;
                            visit[y][x] = true;
                        }

                    }
                }
            }
        }
        System.out.println(result);
    }
}
