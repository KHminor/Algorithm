import java.io.*;
import java.util.*;
public class Main {
    static List<Integer> li = new ArrayList<>();
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        result = 50000;
        addZegob(N);
        findRec(0,N, li.size()-1);
        System.out.println(result);
    }

    private static void addZegob(int N) {
        for (int i=1; i<=(int)Math.sqrt(N); i++) li.add(i*i);
    }

    private static void findRec(int cnt, int hap, int idx) {
        if (hap==0) {
            if (result>cnt) result = cnt;
        }
        else if (result>cnt){
            for (int i=idx; i>=0; i--) {
                if (hap-li.get(i)>=0) findRec(cnt+1,hap-li.get(i), i);
            }
        }
    }
}
