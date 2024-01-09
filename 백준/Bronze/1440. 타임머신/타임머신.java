import java.io.*;
import java.util.*;

public class Main {
    static Integer result = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),":");
        List<String> li = new ArrayList<>();
        List<Integer> visit = new ArrayList<>(Collections.nCopies(3,-1));
        Integer cnt = 0;
        for (int i = 0; i < 3; i++) li.add(st.nextToken());
        permutation(li, visit, cnt);
        System.out.println(result);

    }
    public static void permutation(List<String> li, List<Integer> visit, Integer cnt) {

        if (cnt == 3) {
            Integer h = Integer.parseInt(li.get(visit.get(0)));
            Integer m = Integer.parseInt(li.get(visit.get(1)));
            Integer s = Integer.parseInt(li.get(visit.get(2)));
            if ((0<h && h<=12) && (0<=m && m<=59) && (0<=s && s<=59)) {
                result++;
            }
        } else {
            for (int i = 0; i < 3; i++) {
                if (visit.get(i) == -1) {
                    visit.set(i,cnt);
                    cnt++;
                    permutation(li, visit, cnt);
                    visit.set(i,-1);
                    cnt--;
                }
            }
        }

    }
}