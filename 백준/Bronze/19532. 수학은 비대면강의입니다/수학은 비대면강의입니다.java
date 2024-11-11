import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        int x = 0;
        int y = 0;
        if ((zero(a) || zero(b)) && (zero(d) || zero(e))) {
            if (zero(a)) y = c/b;
            else x = c/a;
            if (zero(d)) y = f/e;
            else x = f/d;
        } else if (zero(a) || zero(b)) {
            if (zero(a)) {
                y = c/b;
                x = (f-e*y)/d;
            }
            else {
                x = c/a;
                y = (f-d*x)/e;
            }
        } else if (zero(d) || zero(e)) {
            if (zero(d)) {
                y = f/e;
                x = (c-b*y)/a;
            }
            else {
                x = f/d;
                y = (c-a*x)/b;
            }
        } else {
            int moc = GCD(a,d);
            int tmp = a;
            a = a*(d/moc);
            b = b*(d/moc);
            c = c*(d/moc);
            d = d*(tmp/moc);
            e = e*(tmp/moc);
            f = f*(tmp/moc);
            y = (c-f)/(b-e);
            x = (c-b*y)/a;
        }
        System.out.println(x);
        System.out.println(y);
    }

    public static boolean zero(int num) {
        return num==0;
    }

    public static int GCD(int n1, int n2) {
        int tmp = 0;
        while (n2!=0) {
            tmp = n1%n2;
            n1 = n2;
            n2 = tmp;
        }
        return n1;
    }
}
