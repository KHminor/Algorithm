import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long cnt = 0L;

        while (true) {
            Boolean state = false;
            cnt++;
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            Integer o = Integer.parseInt(st1.nextToken());
            Integer w = Integer.parseInt(st1.nextToken());
            if (o == 0 && w == 0) break;
            while (true) {
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                String x = st2.nextToken();
                if (x.equals("#")) break;
                else if (x.equals("E")) w -= Integer.parseInt(st2.nextToken());
                else w += Integer.parseInt(st2.nextToken());
                if (w <= 0) state = true;
            }

            if (w <= 0 || state) System.out.println(cnt + " "+ "RIP");
            else if (o/2 < w && w < o*2) System.out.println(cnt + " "+ ":-)");
            else System.out.println(cnt + " "+ ":-(");
        }
    }
}