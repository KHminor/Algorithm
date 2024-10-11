import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        String now;
        int[] NM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[][] mtx = new String[NM[0]][NM[1]];

        for (int i=0; i<NM[0]; i++) {
            String inp = br.readLine();
            for (int j=0; j<NM[1]; j++) mtx[i][j] = String.valueOf(inp.charAt(j));
        }

        // 가로 세로 각각 찾기(정사각형이 아니어서)
        for (int i=0; i<NM[0]; i++) {
            now = "";
            for (int j=0; j<NM[1]; j++) {
                if (mtx[i][j].equals("-") && !now.equals("-")) {
                    now = "-";
                    result++;
                }
                else if (!mtx[i][j].equals("-")) now = mtx[i][j];
            }
        }
        for (int i=0; i<NM[1]; i++) {
            now = "";
            for (int j=0; j<NM[0]; j++) {
                if (mtx[j][i].equals("|") && !now.equals("|")) {
                    now = "|";
                    result++;
                }
                else if (!mtx[j][i].equals("|")) now = mtx[j][i];
            }
        }
        System.out.println(result);

    }
}
