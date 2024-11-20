import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] li = {10000,-10000,10000,-10000};
        while (N>0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if (li[0]>x) li[0]=x;
            if(x>li[1])li[1]=x;
            if (li[2]>y) li[2]=y;
            if(y>li[3])li[3]=y;
            N--;
        }
        System.out.println(Math.abs(li[0]-li[1])*Math.abs(li[2]-li[3]));
    }
}
