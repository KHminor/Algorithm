import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i <tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double n = Integer.parseInt(st.nextToken());
            double hap = 0.0;
            ArrayList<Double> li = new ArrayList<>(Collections.nCopies((int) n,0.0));
            for (int j = 0; j<n ; j++) {
                double st_num = Integer.parseInt(st.nextToken());
                li.set(j,st_num);
                hap += st_num;
            }
            hap /= n;
            double cnt = 0.0;
            for (double num: li) {
                if (num > hap) cnt ++;
            }
            System.out.println(String.format("%.3f", (cnt/n)*100)+"%");
        }
    }
}