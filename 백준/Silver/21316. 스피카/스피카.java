import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        List<List<Integer>> mtx = IntStream.rangeClosed(0,13).mapToObj(ArrayList<Integer>::new).collect(Collectors.toList());
        int[] li = new int[13];
        int result = 0;

        for (int i=0; i<12; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            li[x]++;
            li[y]++;
            mtx.get(x).add(y);
            mtx.get(y).add(x);
        }

        for (int i=0; i<13; i++) {
            if (li[i]==3 && (li[mtx.get(i).get(0)]+li[mtx.get(i).get(1)]+li[mtx.get(i).get(2)]) == 6) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
