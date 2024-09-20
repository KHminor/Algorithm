import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] XY = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] s_month = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int days = -1;
        for (int i=0; i<XY[0]-1; i++) days+= month[i];
        days+=XY[1];
        System.out.println(s_month[days%7]);
    }
}