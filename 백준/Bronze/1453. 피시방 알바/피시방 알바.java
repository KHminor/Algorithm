import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> dic = new HashMap<>(100);
        Integer result = 0;
        for (int i = 1; i <= 100; i++) dic.put(i,0);
        for (int i = 0; i < n; i++) {
            Integer val = Integer.parseInt(st.nextToken());
            if (dic.get(val) == 0) dic.put(val,1);
            else result++;
        }
        System.out.println(result);
    }
}