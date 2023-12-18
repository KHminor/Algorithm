import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st1.nextToken());
        int n = Integer.parseInt(st1.nextToken());
        ArrayList<Integer> f_li = new ArrayList<>();
        ArrayList<Integer> li = new ArrayList<>();
        int result = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st2.nextToken());
            int y = Integer.parseInt(st2.nextToken());
            f_li.add(x);
            li.add(y);
        }

        Collections.sort(f_li);
        Collections.sort(li);

        if (li.get(0)*6 > f_li.get(0)) {
            result = (m/6)*f_li.get(0);
            if (m%6* li.get(0) > f_li.get(0)) result += f_li.get(0);
            else result += m%6*li.get(0);
        } else result = m*li.get(0);
        System.out.println(result);
    }
}
