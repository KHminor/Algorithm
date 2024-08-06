import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] mtx = {0,0};
        int result = 0;

        for (int i=0; i<9; i++) {
            int[] li = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int j=0; j<9; j++) {
                if (li[j] > result) {
                    result = li[j];
                    mtx[0] = i;
                    mtx[1] = j;
                }
            }
        }
        System.out.println(result);
        System.out.println(Arrays.stream(mtx).map(i->i+1).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}
