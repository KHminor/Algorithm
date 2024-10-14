import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> li = new ArrayList<>();
        while (st.hasMoreTokens()) li.add(Integer.parseInt(st.nextToken()));
        int[] TP = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] result = new int[3];
        for (int num: li) result[0] += num%TP[0]==0?num/TP[0]:num/TP[0]+1;
        result[1] = N/TP[1];
        result[2] = N%TP[1];

        bw.write(result[0]+"\n");
        bw.write(String.format("%d %d",result[1],result[2]));
        bw.flush();
    }
}
