import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] NM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = NM[0]; // 총 단어
        int M = NM[1]; // 기준 단어 길이
        Set<String> s_li = new HashSet<>();
        Map<String, Object[]> dic = new HashMap<>();
        while (N>0) {
            String cmd = br.readLine();
            if (cmd.length()>=M) {
                if (!dic.containsKey(cmd)) {
                    s_li.add(cmd);
                    dic.put(cmd,new Object[]{cmd,1});
                } else dic.get(cmd)[1] = (int)dic.get(cmd)[1]+1;
            }
            N--;
        }
        List<Object[]> result = new ArrayList<>(dic.values());
        Collections.sort(result, new Comparator<Object[]>() {
            public int compare(Object[] a, Object[] b) {
                if ((int)a[1]!=(int)b[1]) return (int)b[1]-(int)a[1];
                else {
                    String a0 = (String) a[0];
                    String b0 = (String) b[0];
                    if (a0.length()!=b0.length()) return b0.length()-a0.length();
                    else return a0.compareTo(b0);
                }
            }
        });
        for (Object[] x: result) bw.write(x[0]+"\n");
        bw.flush();
    }
}
