import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] li = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int x = li[0];
        int y = li[1];
        long z = y*100L/x;
        int result = -1;

        int s = 0;
        int e = (int) 1e9;
        while (s<=e) {
            int mid = (s+e)/2;
            long new_persent = (y+mid)*100L/(x+mid);

            if (z != new_persent) {
                result = mid;
                e = mid-1;
            } else s = mid+1;
        }


        System.out.println(result);
    }
}
