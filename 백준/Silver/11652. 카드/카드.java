import java.io.*;
import java.util.Map;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] result = {(long)Math.pow(2,62), 0};
        Map<Long, Integer> dic = new HashMap<>();

        for (int i=0; i<N; i++) {
            long num = Long.parseLong(br.readLine());
            if (!dic.containsKey(num)) dic.put(num, 1);
            else dic.put(num, dic.get(num)+1);

            if (dic.get(num) > result[1]) {
                result[0] = num;
                result[1] = dic.get(num);
            } else if (dic.get(num)==result[1] && result[0]>num) result[0] = num;
        }

        System.out.println(result[0]);
    }
}
