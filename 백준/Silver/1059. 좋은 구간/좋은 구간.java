import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        ArrayList<Integer> li = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i <= L; i++) {
            if (i == 0) li.add(0);
            else {
                li.add(Integer.parseInt(st.nextToken()));
            }
        }
        Collections.sort(li);
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < L; i++) {
            if (li.get(i) == n || li.get(i+1) == n) {
                System.out.println(0);
                break;
            } else if (li.get(i) <= n && n <= li.get(i+1)) {
                System.out.println((n-li.get(i)) * (li.get(i+1)-n) -1);
                break;
            }
        }
    }
}