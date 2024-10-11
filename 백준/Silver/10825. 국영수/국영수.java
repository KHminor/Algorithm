import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Object[][] mtx = new Object[N][4];

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            for (int j=0; j<4; j++) {
                if (j==0) mtx[i][j] = st.nextToken();
                else mtx[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(mtx, new Comparator<Object[]>() {
            public int compare(Object[] o1, Object[] o2) {
                if (o1[1]!=o2[1]) return Integer.compare((int)o2[1],(int)o1[1]);
                else if (o1[2]!=o2[2]) return Integer.compare((int)o1[2],(int)o2[2]);
                else if (o1[3]!=o2[3]) return Integer.compare((int)o2[3],(int)o1[3]);
                else {
                    String s_o1 = (String) o1[0];
                    String s_o2 = (String) o2[0];
                    return s_o1.compareTo(s_o2);
                }

            }
        });

        for (Object[] li: mtx) bw.write((String)li[0]+"\n");
        bw.flush();

    }
}
