import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        if (X>Y) {
            int tmp = X;
            X=Y;
            Y=tmp;
        }

        List<Integer> li = new ArrayList<>(N+1);
        List<Integer> now;
        for (int i=1; i<=N; i++) li.add(i);
        int result = 1;
        boolean state = false;
        while (N!=1) {
            now = new ArrayList<>();
            for (int i=0; i<N/2; i++) {
                if (li.get(i*2)==X && li.get(i*2+1)==Y) {
                    state = true;
                    break;
                }
                else if (li.get(i*2+1)==X || li.get(i*2+1)==Y) now.add(li.get(i*2+1));
                else now.add(li.get(i*2));
            }
            if (N%2!=0) now.add(li.get(li.size()-1));
            if (state) break;
            li = new ArrayList<>(now);
            if (N%2==0) N/=2;
            else N = N/2+1;
            result++;
        }
        System.out.println(state?result:-1);
    }
}
