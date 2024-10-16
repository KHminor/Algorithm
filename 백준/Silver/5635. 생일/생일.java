import java.io.*;
import java.util.*;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Object[][] li = new Object[N][4];
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            li[i][0] = st.nextToken();
            for (int j=3; j>0; j--) li[i][j] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(li, new Comparator<Object[]>() {
           public int compare(Object[] o1, Object[] o2) {
              if ((int)o1[1]!=(int)o2[1]) return Integer.compare((int)o1[1],(int)o2[1]);
              else if ((int)o1[2]!=(int)o2[2]) return Integer.compare((int)o1[2],(int)o2[2]);
              else return Integer.compare((int)o1[3],(int)o2[3]);
           }
        });
        System.out.println(li[N-1][0]);
        System.out.println(li[0][0]);
    }
}
